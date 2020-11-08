package q2;
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
            System.out.println("Do you want to calculate value? (Yes(enter 1) or No(enter 0) :");
            option = prm.nextLine();
            switch(option){
                case "0":
                    System.out.println("Thank you!!");
                    break;

                case "1":
                    String[] arr = getInput();
                    StaticGenerator gen = new StaticGenerator();
                    displayOutput(gen.calculation(Float.parseFloat(arr[0]), Float.parseFloat(arr[1]),arr[2].charAt(0)));
                    break;
                default:
                    System.out.println("Invalid Input! Please try again.");
                    break;
            }
        }while (!Objects.equals(option, "0"));

    }

    private static String[] getInput(){
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

    private static void displayOutput(double result){
        System.out.println("Answer: " + result);

    }
}
