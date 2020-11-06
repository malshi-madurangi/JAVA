package q2;
import java.util.Scanner;

public class GetValues {
    static String[] getInputs(){
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
}
