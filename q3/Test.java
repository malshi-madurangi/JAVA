package q3;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        runStaticGenerator();

    }

    private static void runStaticGenerator(){
        String str = getInput();
        StaticsGenerator objGen = new StaticsGenerator();
        int[] arr = objGen.split(str);
        displayOutput(objGen.getMin(arr), objGen.getMax(arr), objGen.getAvg(arr));
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
