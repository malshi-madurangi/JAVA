package q10;

public class FindWord {
    private static String unicodeStr;
    public FindWord (String code) {
        unicodeStr = code;
    }

    public static String findWord() {
        String[] strArray = unicodeStr.split("\\\\u");

        String[] newArray = new String[strArray.length];

        int i;
        for(i = 0; i<strArray.length; i++) {
            if(i == 0){
                if(strArray[0].equals("")) {
                    continue;

                }else if(strArray[0].matches("(^[a-z]+)+")) {
                    newArray[i] = strArray[0];

                }

            }else {
                String res = strArray[i];
                if (res.contains("196")) {
                    newArray[i] = res.replace("196", "Ä");

                } else if (res.contains("197")) {
                    newArray[i] = res.replace("197", "Å");

                } else if (res.contains("214")) {
                    newArray[i] = res.replace("214", "Ö");

                } else if (res.contains("228")) {
                    newArray[i] = res.replace("228", "ä");

                } else if (res.contains("229")) {
                    newArray[i] = res.replace("229", "å");

                } else if (res.contains("246")) {
                    newArray[i] = res.replace("246", "ö");

                } else {
                    throw new IllegalStateException("Unexpected Unicode!");

                }
            }
        }

        String word = "";
        for(String res : newArray) {
            if (res != null){
                word = word + res;
            }

        }

        return word;
    }
}
