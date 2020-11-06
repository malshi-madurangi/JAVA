package q3;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class StaticsGenerator {
    static int[] split(String str){

        String[] stringArray = str.split("\\s+");     //split integers from white space and storing in a string array
        int[] intArray = new int[stringArray.length];        //declared int array to store int from string array

        int i;
        for(i=0; i < stringArray.length; i++){
            String numberAsString = stringArray[i];    //creating a dummy string for storing integer from string array
            intArray[i] = Integer.parseInt(numberAsString);    //storing dummy string as a integer
        }
        return intArray;
    }
    public int getMin(int[] arr){
        return Arrays.stream(arr).min().getAsInt();
    }
    public int getMax(int[] arr){
        return Arrays.stream(arr).max().getAsInt();
    }
    public double getAvg(int[] arr){
        return Arrays.stream(arr).average().getAsDouble();
    }
}
