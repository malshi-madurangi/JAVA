package assignment3;

import java.util.Scanner;

public class Assignmnet3 {
    public int min(int [] array) {
        int min = array[0];

        for(int i = 0; i < array.length; i++ ) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public int max(int [] array) {
        int max = array[0];

        for(int i = 0; i < array.length; i++ ) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public float average(int [] array) {
        float avg, sum = 0;
        float count = array.length;

        for(int i = 0; i < array.length; i++ ) {
            sum = sum + array[i];
        }
        avg = sum/count;
        return avg;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);  //Creating object for scanner
        System.out.println("Numbers : ");

        String numbers = obj.nextLine();
        String[] stringArray = numbers.split("\\s+");     //split integers from white space and storing in a string array
        int[] intArray = new int[stringArray.length];        //declared int array to store int from string array

        int i;
        for(i=0; i < stringArray.length; i++){
            String numberAsString = stringArray[i];    //creating a dummy string for storing integer from string array
            intArray[i] = Integer.parseInt(numberAsString);    //storing dummy string as a integer
        }

        Assignmnet3 method = new Assignmnet3();
        System.out.println("Min : " + method.min(intArray));
        System.out.println("Max : " + method.max(intArray));
        System.out.println("Avg : " + method.average(intArray));
    }
}
