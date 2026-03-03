import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static boolean checkUsingSimpleReverse(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return word.equals(reversed);
    }


    public static void main(String[] args) {

        System.out.println(checkUsingSimpleReverse("abba"));
    }
}