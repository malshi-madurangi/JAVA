package q2;

import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws NumberFormatException {
        Scanner prm = new Scanner(System.in);
        String option = null;
        do{
            try {
                System.out.println("Do you want to do calculations ? (Yes(enter 1) or No(enter 0) :");
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
            }catch(NumberFormatException e) {
                System.out.println("invalid number");

            }

        }while (!Objects.equals(option, "0"));
    }

    private static void runStaticGenerator() {
        String[] arr = getInput();
        Calculate gen = new Calculate(arr);
        displayOutput(gen.calculation());

    }

    private static String[] getInput() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Number 1 : ");
        String number1 = obj.nextLine();
        System.out.println("Number 2 : ");
        String number2 = obj.nextLine();
        System.out.println("Operation : ");
        String operation = obj.nextLine();
        String[] arr = new String[3];
        arr[0] = number1;
        arr[1] = number2;
        arr[2] = operation;
        return arr;

    }

    private static void displayOutput(double result) {
        System.out.println("Answer: " + result);

    }
}
