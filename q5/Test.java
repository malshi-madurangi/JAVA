package q5;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("CamelCase text : ");
        String str = obj.nextLine();

        StaticGenerator gen = new StaticGenerator();
        System.out.println("Sentence : " + gen.camelToString(str));
    }
}
