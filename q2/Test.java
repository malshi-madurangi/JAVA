package q2;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Number 1 : ");
        float number1 = obj.nextFloat();
        System.out.println("Number 2 : ");
        float number2 = obj.nextFloat();
        System.out.println("Operation : ");
        char operation = obj.next().charAt(0);

        Generator gen = new Generator();
        System.out.println("Answer : " + gen.calculation(number1, number2, operation));
    }
}
