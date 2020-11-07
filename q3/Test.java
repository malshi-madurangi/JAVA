package q3;
import q2.StaticGenerator;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        runStaticGenerator();
    }

    private static void runStaticGenerator(){
        Scanner prm = new Scanner(System.in);
        int option;
        do{
            System.out.println("Do you want find min, max and average? (Yes(enter 1) or No(enter 0) :");
            option = prm.nextInt();
            if(option == 1){
                String str = getInput();
                StaticsGenerator objGen = new StaticsGenerator();
                int[] arr = objGen.split(str);
                displayOutput(objGen.getMin(arr), objGen.getMax(arr), objGen.getAvg(arr));
            }else {
                System.out.println("Thank you!!");
            }
        }while (option == 1);

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
