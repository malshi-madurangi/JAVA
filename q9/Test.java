package q9;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner prm = new Scanner(System.in);
        String option = null;
        do {
            try {
                System.out.println("Do you want to find Swedish characters by using Unicode? (Yes(enter 1) or No(enter 0) : ");
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
                System.out.println(e);

            }

        }while (!Objects.equals(option, "0"));
    }

    private static void runStaticGenerator() {
        String unicode = getInputs();
        FindSwedishChar obj = new FindSwedishChar(unicode);
        String character = obj.findSwedishChar();
        displayOutput(character);

    }

    private static String getInputs() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Unicode: ");

        return obj.nextLine();
    }

    private static void displayOutput(String character) {
        System.out.println("Character: " + character);

    }
}

