package q4;
import q3.StaticsGenerator;

import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        runStaticGenerator();
    }

    private static void runStaticGenerator(){
        Scanner prm = new Scanner(System.in);
        String option;
        do{
            System.out.println("Do you want find lucky number? (Yes(enter 1) or No(enter 0) : ");
            option = prm.nextLine();
            switch(option){
                case "0":
                    System.out.println("Thank you!!");
                    break;

                case "1":
                    int number = getInput();
                    StaticGenerator gen = new StaticGenerator();
                    displayOutput(gen.luckyNum(number));
                    break;
                default:
                    System.out.println("Invalid Input! Please try again.");
                    break;
            }
        }while (!Objects.equals(option, "0"));
    }

    private static int getInput(){
        Scanner obj = new Scanner(System.in);
        System.out.print("Number : ");
        return obj.nextInt();
    }

    private static void displayOutput(int luckyNum){
        System.out.println("Lucky number : " + luckyNum);
    }
}
