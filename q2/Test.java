package q2;

public class Test {
    public static void main(String[] args) {
        GetValues getValues = new GetValues();
        String[] arr = getValues.getInputs();

        Generator gen = new Generator();
        System.out.println("Answer : " + gen.calculation(Float.parseFloat(arr[0]), Float.parseFloat(arr[1]),arr[2].charAt(0)));
    }
}
