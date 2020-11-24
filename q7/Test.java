package q7;

import java.util.Objects;
import java.util.Scanner;

public class Test {
    static void validate(String str) throws InvalidTimeException {
        if(!(str.matches("([0][1-9]|[1][0-2]):([0-5][0-9]):([0-5][0-9])+\\s+([ap][m])"))){
            throw new InvalidTimeException("Invalid Time");

        }

    }

    public static void main(String[] args) throws InvalidTimeException{
        Scanner prm = new Scanner(System.in);
        String option = null;
        do {
            try {
                System.out.println("Do you want to convert 12-hour clock format to 24- hour clock format? (Yes(enter 1) or No(enter 0) : ");
                option = prm.nextLine();

                switch(option) {
                    case "0":
                        System.out.println("Thank you!!");
                        break;

                    case "1":
                        runStaticGenerator();
                        break;

                    default:
                        System.out.println("Invalid Input! Please try again.");
                        break;
                }
            }catch(Exception e) {
                System.out.println("invalid Time Format!");

            }

        }while (!Objects.equals(option, "0"));

    }

    private static void runStaticGenerator() throws InvalidTimeException{
        String time = getInput();
        ConvertTimeTo24hFormat convertor = new ConvertTimeTo24hFormat(time);
        displayOutput(convertor.convertTimeTo24hFormat());
    }

    private static String getInput() throws InvalidTimeException{
        Scanner obj = new Scanner(System.in);
        System.out.println("Time in 12-hour format: ");
        String time = obj.nextLine();
        validate(time);
        return time;
    }

    private static void displayOutput(String dateConverted) {
        System.out.println("Time in 24-hour format: "+ dateConverted);

    }
}
