package q4;

public class StaticGenerator {
    static int realLucky(int x) {
        if (x / 10 == 0) {
            return x;
        } else {
            int number = x;
            return luckyNum(number);
        }
    }

    static int luckyNum(int number) {
        if (number == 0) {
            return 0;
        } else {
            int x = ((number % 10) + luckyNum((number/10)));
            int luckyNum = realLucky(x);
            return luckyNum;
        }
    }
}
