package q10;

import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main (String[] args) {
        Scanner prm = new Scanner(System.in);
        String option = null;

        do {
            try {
                System.out.println("Do you want to convert text with unicode to word which Swedish words contain word: ");
                option = prm.nextLine();
                
                switch(option) {
                    case "0":
                        System.out.println("Thank you!!");
                        break;

                    case "1":
                        runStaticGenerator();
                        break;

                    default:
                        throw new IllegalStateException("Unexpected option!");
                }
                
            }catch(Exception e) {
                    System.out.println(e); 
                    
            }
        
        }while (!Objects.equals(option, "0"));

    }
    
    private static void runStaticGenerator() {
        String unicodeStr = getInputs();
        FindWord obj = new FindWord(unicodeStr);
        String word = obj.findWord();
        displayOutput(word);

    }

    private static String getInputs() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Text with Unicode: ");

        return obj.nextLine();
    }

    private static void displayOutput(String word) {
        System.out.println("Output: " + word);

    }
}

    
