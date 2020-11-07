package q4;
import q3.StaticsGenerator;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        runStaticGenerator();
    }

    private static void runStaticGenerator(){
        Scanner prm = new Scanner(System.in);
        int option;
        do{
            System.out.println("Do you want find lucky number? (Yes(enter 1) or No(enter 0) :");
            option = prm.nextInt();
            if(option == 1){
                int number = getInput();
                StaticGenerator gen = new StaticGenerator();
                displayOutput(gen.luckyNum(number));
            }else {
                System.out.println("Thank you!!");
            }
        }while (option == 1);
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
