import java.util.Stack;

class PalindromeChecker {

    // Private constructor not needed since all methods are instance methods
    // Internal data structures are hidden
    private Stack<Character> stack;

    public PalindromeChecker() {
        stack = new Stack<>();
    }

    // Public method to check palindrome
    public boolean checkPalindrome(String word) {

        // Clear stack if reused
        stack.clear();

        // Push all characters into the stack
        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                return false; // Not a palindrome
            }
        }

        return true; // Palindrome
    }
}

// Main application class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        String word1 = "radar";
        String word2 = "hello";

        System.out.println("Checking: " + word1);
        if (checker.checkPalindrome(word1)) {
            System.out.println(word1 + " is a Palindrome.");
        } else {
            System.out.println(word1 + " is NOT a Palindrome.");
        }

        System.out.println("\nChecking: " + word2);
        if (checker.checkPalindrome(word2)) {
            System.out.println(word2 + " is a Palindrome.");
        } else {
            System.out.println(word2 + " is NOT a Palindrome.");
        }
    }
}