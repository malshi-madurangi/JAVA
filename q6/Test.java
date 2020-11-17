package q6;

import java.util.Objects;
import java.util.Scanner;

class InvalidFormatException extends Exception{
    InvalidFormatException(String s) {
        super(s);
    }
}

public class Test {
    static void validate(String str) throws InvalidFormatException{
        if(!(str.matches("\\d.\\d.\\d{2}"))){
            throw new InvalidFormatException("not valid");

        }

    }

    public static void main(String[] args) throws InvalidFormatException {
        Scanner prm = new Scanner(System.in);
        String option = null;
        do{
            try {
                System.out.println("Do you want to find next version number? (Yes(enter 1) or No(enter 0) : ");
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
                System.out.println("Invalid Format version number!");

            }

        }while (!Objects.equals(option, "0"));

    }

    private static void runStaticGenerator() throws InvalidFormatException {
        String[] arr = getInput();
        StaticGenerator gen = new StaticGenerator();
        displayOutput(gen.findNextVersionNumber(arr[0], arr[1].charAt(0)));

    }

    private static String[] getInput() throws InvalidFormatException {
        Scanner obj = new Scanner(System.in);
        System.out.print("Current version : ");
        String version = obj.nextLine();
        validate(version);
        System.out.print("Type of change (i for minor, j for major, n for non-backward compatible) : ");
        String type = obj.nextLine();
        String[] arr = new String[2];
        arr[0] = version;
        arr[1] = type;
        return arr;

    }

    private static void displayOutput(String str){
        System.out.println("Next version : " + str);

    }
}
