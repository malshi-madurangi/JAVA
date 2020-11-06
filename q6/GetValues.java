package q6;

import java.util.Scanner;

public class GetValues {
    static String[] getInputs(){
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
}
