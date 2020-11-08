package q5;
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
            System.out.println("Do you want convert Camel Case string to a sentence? (Yes(enter 1) or No(enter 0) : ");
            option = prm.nextLine();
            switch(option){
                case "0":
                    System.out.println("Thank you!!");
                    break;

                case "1":
                    String str = getInput();
                    StaticGenerator gen = new StaticGenerator();
                    displayOutput(gen.camelToString(str));
                    break;
                default:
                    System.out.println("Invalid Input! Please try again.");
                    break;
            }
        }while (!Objects.equals(option, "0"));
    }

    private static String getInput(){
        Scanner obj = new Scanner(System.in);
        System.out.print("CamelCase text : ");
        return (obj.nextLine());
    }

    private static void displayOutput(String str){
        System.out.println("Sentence : " + str);
    }
}
