package q5;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        GetValues getValues = new GetValues();
        String str = getValues.getInputs();

        StaticGenerator gen = new StaticGenerator();
        System.out.println("Sentence : " + gen.camelToString(str));
    }
}
