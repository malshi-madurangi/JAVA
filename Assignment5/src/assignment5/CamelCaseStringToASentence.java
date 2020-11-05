package assignment5;
import java.util.Scanner;

public class CamelCaseStringToASentence {
    static String camelToString(String str){
        int i;
        String sentence = "";
        char c1 = str.charAt(0);
        sentence = sentence + Character.toUpperCase(c1);
        for (i=1; i < str.length(); i++){
            char character = str.charAt(i);
            if(Character.isUpperCase(character)){
                sentence = sentence + ' ';
                sentence = sentence + Character.toLowerCase(character);
            }else {
                sentence = sentence + character;
            }
        }
        return sentence;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("CamelCase text : ");
        String str = obj.nextLine();

        System.out.println("Sentence : " + camelToString(str));
    }
}
