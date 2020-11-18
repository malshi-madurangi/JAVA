package q4;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws InputMismatchException {
        Scanner prm = new Scanner(System.in);
        String option = null;
        do {
            try {
                System.out.println("Do you want find lucky number? (Yes(enter 1) or No(enter 0) : ");
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
            }catch(InputMismatchException e) {
                System.out.println("invalid Input");

            }

        }while (!Objects.equals(option, "0"));
    }

    private static void runStaticGenerator() {
        int number = getInput();
        LuckyNumber gen = new LuckyNumber();
        displayOutput(gen.luckyNum(number));

    }

    private static int getInput() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Number : ");
        return obj.nextInt();

    }

    private static void displayOutput(int luckyNum) {
        System.out.println("Lucky number : " + luckyNum);

    }
}
