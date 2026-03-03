public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "level";


        PalindromeStrategy strategy = new StackStrategy();


        boolean isPalindrome = strategy.check(input);

        // Output results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}


interface PalindromeStrategy {
    boolean check(String input);
}


class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();


        for (char c : input.toCharArray()) {
            stack.push(c);
        }


        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
