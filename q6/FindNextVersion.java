package q6;

public class FindNextVersion {
    static String findNextVersionNumber(String version, char type) {
        String[] versionNum = version.split("\\.");
        int[] intNum = new int[versionNum.length];
        int i;
        for (i = 0; i < versionNum.length; i++) {
            String sNum = versionNum[i];
            intNum[i] = Integer.parseInt(sNum);
        }
        switch (type) {
            case 'i':
                intNum[2] = ++intNum[2];
                break;
            case 'j':
                intNum[1] = ++intNum[1];
                intNum[2] = 0;
                break;
            case 'n':
                intNum[0] = ++intNum[0];
                intNum[2] = 0;
                intNum[1] = 0;
                break;
            default:
                System.out.println("Invalid Type! Please try again.");
                break;
        }
        return (intNum[0] + "." + intNum[1] + "." + intNum[2]);
    }
}
