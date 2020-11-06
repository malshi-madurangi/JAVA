package q4;

public class Test {
    public static void main(String[] args) {
        GetValues getValues = new GetValues();
        int number = getValues.getInputs();

        StaticGenerator gen = new StaticGenerator();
        System.out.print("Lucky number : " + gen.luckyNum(number));
    }
}
