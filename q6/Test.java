package q6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Current version : ");
        String version = obj.nextLine();
        System.out.print("Type of change (i for minor, j for major, n for non-backward compatible) : ");
        char type = obj.next().charAt(0);

        StaticGenerator gen = new StaticGenerator();
        System.out.print("Next version : " + gen.findNextVersionNumber(version, type));
    }
}
