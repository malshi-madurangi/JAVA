package q6;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        runStaticGenerator();

    }

    private static void runStaticGenerator(){
        String[] arr = getInput();
        StaticGenerator gen = new StaticGenerator();
        displayOutput(gen.findNextVersionNumber(arr[0], arr[1].charAt(0)));
    }

    private static String[] getInput(){
        Scanner obj = new Scanner(System.in);
        System.out.print("Current version : ");
        String version = obj.nextLine();
        System.out.print("Type of change (i for minor, j for major, n for non-backward compatible) : ");
        String type = obj.nextLine();
        String[] arr = new String[2];
        arr[0] = version;
        arr[1] = type;
        return arr;
    }

    private static void displayOutput(String str){
        System.out.print("Next version : " + str);
    }
}
