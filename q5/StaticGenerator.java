package q5;

public class StaticGenerator {
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
}
