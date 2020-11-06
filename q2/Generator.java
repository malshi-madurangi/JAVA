package q2;

public class Generator {
    static double calculation(float number1, float number2, char operation){
        double result = 0.0;
        switch (operation){
            case '+':
                result = (number1+number2);
                break;
            case '-':
                result = (number1-number2);
                break;
            case '*':
                result = (number1*number2);
                break;
            case '/':
                result = (number1/number2);
                break;
            default:
                System.out.println("Invalid Operation!!");
                break;
        }
        return result;
    }
}
