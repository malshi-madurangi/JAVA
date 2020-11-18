package q5;

public class CamelToStringConvertor {
    private static String str;
    public CamelToStringConvertor(String s) {
        str = s;

    }

    static String camelToString(){
        int i;
        StringBuilder sentence = new StringBuilder();
        char c1 = str.charAt(0);
        sentence.append(Character.toUpperCase(c1));
        for (i=1; i < str.length(); i++){
            char character = str.charAt(i);
            if(Character.isUpperCase(character)){
                sentence.append(' ');
                sentence.append(Character.toLowerCase(character));
            }else {
                sentence.append(character);
            }
        }
        return sentence.toString();
    }
}
