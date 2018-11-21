package strings;



/**
 * Created by USER on 21/11/2018.
 */
public class ReverseString {

    public static void main(String[] args) {

        String s1="Java";
        String s2="Java8";

        System.out.println(" Initial string is "+s1+" | reverse Using StringBuffer "+ reverseUsingStringBuffer(s1));
        System.out.println(" Initial string is "+s1+" | reverse Using StringBuffer "+ reverseUsingStringBuffer(s2));

        System.out.println(" Initial string is "+s1+" | reverse  "+ reverseString(s1));
        System.out.println(" Initial string is "+s1+" | reverse  "+ reverseString(s2));
    }

    private static String reverseString(String input) {

        char[] chars = input.toCharArray();


        for (int i = 0, j=chars.length-1; i < (chars.length / 2); i++, j--) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

        return new String(chars);
    }

    private static String reverseUsingStringBuffer(String input) {
        return new StringBuffer(input).reverse().toString();
    }
}
