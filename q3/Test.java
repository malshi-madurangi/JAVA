package q3;
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
            System.out.println("Do you want find min, max and average ? (Yes(enter 1) or No(enter 0) :");
            option = prm.nextLine();
            switch(option){
                case "0":
                    System.out.println("Thank you!!");
                    break;

                case "1":
                    String str = getInput();
                    StaticsGenerator objGen = new StaticsGenerator();
                    int[] arr = objGen.split(str);
                    displayOutput(objGen.getMin(arr), objGen.getMax(arr), objGen.getAvg(arr));
                    break;
                default:
                    System.out.println("Invalid Input! Please try again.");
                    break;
            }
        }while (!Objects.equals(option, "0"));
    }

    private static String getInput(){
        Scanner obj = new Scanner(System.in);  //Creating object for scanner
        System.out.println("Numbers : ");
        return obj.nextLine();
    }

    private static void displayOutput(int min, int max, double avg){
        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
        System.out.println("Avg : " + avg);
    }
}
