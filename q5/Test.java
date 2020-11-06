package q5;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        runStaticGenerator();

    }

    private static void runStaticGenerator(){
        String str = getInput();
        StaticGenerator gen = new StaticGenerator();
        displayOutput(gen.camelToString(str));
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
