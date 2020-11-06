package q4;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        runStaticGenerator();

    }

    private static void runStaticGenerator(){
        int number = getInput();
        StaticGenerator gen = new StaticGenerator();
        displayOutput(gen.luckyNum(number));
    }

    private static int getInput(){
        Scanner obj = new Scanner(System.in);
        System.out.print("Number : ");
        return obj.nextInt();
    }

    private static void displayOutput(int luckyNum){
        System.out.print("Lucky number : " + luckyNum);
    }
}
