package q7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.lang.Integer.parseInt;

public class ConvertTimeTo24hFormat {
    private static String date;
    public ConvertTimeTo24hFormat(String str) {
        date = str;
    }

    public static String convertTimeTo24hFormat() {
        String[] dateArray = date.split(":");
        String[] stringArray = dateArray[2].split(" ");
        int a = parseInt(dateArray[0]);
        int b = parseInt(dateArray[1]);
        int c = parseInt(stringArray[0]);

        LocalDateTime dateH;

        switch (stringArray[1]) {
            case "pm":
                if(a != 12) {
                    a = a + 12;
                }
                break;

            case "am":
                if(a == 12) {
                    a = 0;
                }
                break;

            default:
                System.out.println("Invalid");
        }

        String pattern = "HH:mm:ss";


        dateH = LocalDateTime.of(1997,12,20, a, b, c);
        return (dateH.format(DateTimeFormatter.ofPattern(pattern)));

    }
}
