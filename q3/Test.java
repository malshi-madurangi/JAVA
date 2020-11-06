package q3;

public class Test {
    public static void main(String[] args) {
        GetValues objGetVal = new GetValues();
        String str = objGetVal.getValues();

        StaticsGenerator objGen = new StaticsGenerator();
        int[] arr = objGen.split(str);

        System.out.println("Min : " + objGen.getMin(arr));
        System.out.println("Max : " + objGen.getMax(arr));
        System.out.println("Avg : " + objGen.getAvg(arr));
    }
}
