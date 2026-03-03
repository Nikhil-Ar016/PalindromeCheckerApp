public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "A man a plan a canal Panama";

        // Step 1: Normalize string
        String normalized = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Check palindrome using two-pointer logic
        boolean isPalindrome = isPalindrome(normalized);

        // Step 3: Display result
        if (isPalindrome) {
            System.out.println("\"" + word + "\" is a Palindrome (case & spaces ignored).");
        } else {
            System.out.println("\"" + word + "\" is NOT a Palindrome.");
        }
    }

    // Two-pointer palindrome check
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}