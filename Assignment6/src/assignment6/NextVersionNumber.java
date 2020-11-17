package assignment6;
import java.util.Scanner;

public class NextVersionNumber {

    static void findNextVersionNumber(String version, char type){
        String[] versionNum = version.split("\\.");
        int[] intNum = new int[versionNum.length];
        int i;
        for (i=0; i < versionNum.length; i++){
            String sNum = versionNum[i];
            intNum[i] = Integer.parseInt(sNum);
        }
        switch (type){
            case 'i':
                intNum[2] = ++intNum[2];
                break;
            case 'j':
                intNum[1] = ++intNum[1];
                intNum[2] = 00;
                break;
            case 'n':
                intNum[0] = ++intNum[0];
                intNum[2] = 0;
                intNum[1] = 0;
                break;
        }
        System.out.print("Next version : " + intNum[0] + "." + intNum[1] + "." + intNum[2]);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Current version : ");
        String version = obj.nextLine();
        System.out.print("Type of change (i for minor, j for major, n for non-backward compatible) : ");
        char type = obj.next().charAt(0);
        findNextVersionNumber(version, type);
    }
}
