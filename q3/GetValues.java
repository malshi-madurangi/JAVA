package q3;
import java.util.Scanner;

public class GetValues {
   static String getValues(){
       Scanner obj = new Scanner(System.in);  //Creating object for scanner
       System.out.println("Numbers : ");
       String numbers = obj.nextLine();
       return numbers;
   }
}
