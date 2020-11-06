package q6;

public class Test {
    public static void main(String[] args) {
        GetValues getValues = new GetValues();
        String[] arr = getValues.getInputs();

        StaticGenerator gen = new StaticGenerator();
        System.out.print("Next version : " + gen.findNextVersionNumber(arr[0], arr[1].charAt(0)));
    }
}
