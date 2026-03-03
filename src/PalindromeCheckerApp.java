public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String word = "radar";

        // Check palindrome using recursion
        boolean isPalindrome = isPalindromeRecursive(word, 0, word.length() - 1);

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }

    // Recursive method
    public static boolean isPalindromeRecursive(String word, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // Compare first and last characters
        if (word.charAt(start) != word.charAt(end)) {
            return false;
        }

        // Recursive call for substring excluding first and last characters
        return isPalindromeRecursive(word, start + 1, end - 1);
    }
}