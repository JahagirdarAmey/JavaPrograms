package numbers;

/**
 * Created by USER on 21/11/2018.
 */
public class ReverseNumber {

    public static void main(String[] args) {

        int number1 = 12345;
        int number2 = 1234;
        int number3 = -1234;
        int number4 = 0;
        int number = -0;

        System.out.println(" Input is "+number  +" Output is "+reverseNumber(number));
        System.out.println(" Input is "+number1  +" Output is "+reverseNumber(number1));
        System.out.println(" Input is "+number2  +" Output is "+reverseNumber(number2));
        System.out.println(" Input is "+number3  +" Output is "+reverseNumber(number3));
        System.out.println(" Input is "+number4  +" Output is "+reverseNumber(number4));
    }

    private static int reverseNumber(int number) {

        int reverse = 0, reminder=0;

        while(number>0){
            reminder = number%10;
            number = number / 10;
            reverse = reverse*10+reminder;
        }

        return reverse;
    }
}
