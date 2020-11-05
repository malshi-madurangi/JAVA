package assignment2;

import java.util.Scanner;

public class ReadingInputs {
    static void calculation(float number1, float number2, char operation){
        switch (operation){
            case '+':
                System.out.println("Answer : " + (number1+number2));
                break;
            case '-':
                System.out.println("Answer : " + (number1-number2));
                break;
            case '*':
                System.out.println("Answer : " + (number1*number2));
                break;
            default:
                System.out.println("Answer : " + (number1/number2));
                break;
        }
    }

    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        Scanner obj2 = new Scanner(System.in);
        Scanner obj3 = new Scanner(System.in);

        System.out.println("Number 1 : ");
        float number1 = obj1.nextFloat();
        System.out.println("Number 2 : ");
        float number2 = obj2.nextFloat();
        System.out.println("Operation : ");
        char operation = obj3.next().charAt(0);

        calculation(number1, number2, operation);
    }
}
