package q2;

public class Calculate {
    private static String[] array;
    public Calculate(String[] arr) {
        array = arr;

    }

    static double calculation() {
        double result = 0.0;
        switch (array[2].charAt(0)){
            case '+':
                result = (Float.parseFloat(array[0]) + Float.parseFloat(array[1]));
                break;
            case '-':
                result = (Float.parseFloat(array[0]) - Float.parseFloat(array[1]));
                break;
            case '*':
                result = (Float.parseFloat(array[0]) * Float.parseFloat(array[1]));
                break;
            case '/':
                result = (Float.parseFloat(array[0]) / Float.parseFloat(array[1]));
                break;
            default:
                System.out.println("Invalid Operation!!");
                break;
        }
        return result;
    }
}
