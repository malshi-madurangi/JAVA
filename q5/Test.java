package q5;

import java.util.Objects;
import java.util.Scanner;

class InvalidPatternException extends Exception {
    InvalidPatternException(String s) {
        super(s);
    }
}

public class Test {

    static void validate(String str) throws InvalidPatternException {
        if(!(str.matches("^[a-z]+([A-Z][a-z0-9]+)+"))) {
            throw new InvalidPatternException("not valid");

        }

    }

    public static void main(String[] args) throws InvalidPatternException {
        Scanner prm = new Scanner(System.in);
        String option = null;
        do {
            try {
                System.out.println("Do you want convert Camel Case string to a sentence? (Yes(enter 1) or No(enter 0) : ");
                option = prm.nextLine();

                switch (option) {
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
            } catch (Exception e) {
                System.out.println("Invalid Input! This is not a Camel Case String.");

            }

        } while (!Objects.equals(option, "0"));
    }

    private static void runStaticGenerator() throws InvalidPatternException {
        String str = getInput();
        StaticGenerator gen = new StaticGenerator();
        displayOutput(gen.camelToString(str));

    }

    private static String getInput() throws InvalidPatternException {
        Scanner obj = new Scanner(System.in);
        System.out.print("CamelCase text : ");
        String str = obj.nextLine();
        validate(str);
        return (str);

    }

    private static void displayOutput(String str) {
        System.out.println("Sentence : " + str);

    }
}
