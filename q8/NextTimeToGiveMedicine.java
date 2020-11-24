package q8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Integer.parseInt;

public class NextTimeToGiveMedicine {
    private static String givenTime;
    private  static String dosesDuration;

    public NextTimeToGiveMedicine(String time, String duration) {
        givenTime = time;
        dosesDuration = duration;
    }

    public static String findNextTimeToGiveMedicine() throws ParseException {
        SimpleDateFormat givenTime24h = new SimpleDateFormat("HH:mm");
        SimpleDateFormat givenTime12h = new SimpleDateFormat("hh:mm a");
        Date time = givenTime12h.parse(givenTime);
        givenTime = givenTime24h.format(time);

        String[] timeArray = givenTime.split(":");
        int hourGiven = parseInt(timeArray[0]);
        int minGiven = parseInt(timeArray[1]);

        String[] dosesArray = dosesDuration.split(":");
        int hourDoses = parseInt(dosesArray[0]);
        int minDoses = parseInt(dosesArray[1]);

        int nextHour = hourGiven + hourDoses ;
        int nextMin = minGiven + minDoses ;
        String nextDosesTime  = nextHour + ":" + nextMin ;

        SimpleDateFormat nextDosesTime24h = new SimpleDateFormat("HH:mm");
        SimpleDateFormat nextDosesTime12h = new SimpleDateFormat("hh:mm a");
        Date nTime = nextDosesTime24h.parse(nextDosesTime);
        String nextDoses12h = nextDosesTime12h.format(nTime);

        return nextDoses12h;
    }
}
