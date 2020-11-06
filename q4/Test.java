package q4;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Number : ");
        int number = obj.nextInt();

        StaticGenerator gen = new StaticGenerator();
        System.out.print("Lucky number : " + gen.luckyNum(number));
    }
}
