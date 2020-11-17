package findluckynum;
import java.util.Scanner;

public class FindLuckyNum {

    public int realLucky(int x) {
        if (x / 10 == 0) {
            return x;
        } else {
            int number = x;
            return luckyNum(number);
        }
    }

    public int luckyNum(int number) {
        if (number == 0) {
            return 0;
        } else {
            int x = ((number % 10) + luckyNum((number/10)));
            int luckyNum = realLucky(x);
            return luckyNum;
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Number : ");
        int number = obj.nextInt();

        FindLuckyNum method = new FindLuckyNum();
        System.out.print("Lucky number : " + method.luckyNum(number));
    }
}
