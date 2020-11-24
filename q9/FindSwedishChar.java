package q9;

public class FindSwedishChar {
    private static String unicode;
    public FindSwedishChar (String code) {
        unicode = code;
    }

    public static String findSwedishChar() throws IllegalStateException {
        String sChar ;
        switch (unicode) {
            case "0196":
                sChar="\u00C4";
                break;

            case "0197":
                sChar = "\u00C5";
                break;

            case "0214":
                sChar = "\u00D6";
                break;

            case "0228":
                sChar = "\u00E4";
                break;

            case "0229":
                sChar = "\u00E5";
                break;

            case "0246":
                sChar = "\u00F6";
                break;

            default:
                throw new IllegalStateException("Unexpected Unicode: " + unicode);
        }

        return sChar;
    }
}
