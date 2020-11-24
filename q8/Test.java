package q8;

import java.text.ParseException;
import java.util.Objects;
import java.util.Scanner;

public class Test {
    static void validate(String str) throws InvalidTimeGivenException {
        if(!(str.matches("([1-9]|[1][0-2]):([0-5][0-9])+\\s+([ap][m])"))){
            throw new InvalidTimeGivenException("Invalid Time");

        }
    }
    static void validateDoses(String str) throws InvalidTimeGivenException {
        if(!(str.matches("\\d{1,2}:([0-5][0-9])"))){
            throw new InvalidTimeGivenException("Invalid Doses Time");

        }
    }

    public static void main(String[] args) {
        Scanner prm = new Scanner(System.in);
        String option = null;
        do {
            try {
                System.out.println("Do you want find to next time to give medicine? (Yes(enter 1) or No(enter 0) : ");
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
                System.out.println("invalid Time!");

            }

        }while (!Objects.equals(option, "0"));

    }

    private static void runStaticGenerator() throws ParseException, InvalidTimeGivenException {
        String timeGiven = getInputPreviousDoseTime();
        String dosesDuration = getInputDosesDuration();
        NextTimeToGiveMedicine obj = new NextTimeToGiveMedicine(timeGiven,dosesDuration);
        displayOutput(obj.findNextTimeToGiveMedicine());

    }

    private static String getInputPreviousDoseTime() throws InvalidTimeGivenException {
        Scanner obj = new Scanner(System.in);
        System.out.println("Previous does time: ");
        String timeStr = obj.nextLine();
        validate(timeStr);
        return timeStr;

    }

    public static String getInputDosesDuration() throws InvalidTimeGivenException {
        Scanner obj = new Scanner(System.in);
        System.out.println("Time duration between doses: ");
        String timeDoses= obj.nextLine();
        validateDoses(timeDoses);
        return timeDoses;

    }

    private static void displayOutput(String nextTime) {
        System.out.println("Next does time: " + nextTime);

    }
}
