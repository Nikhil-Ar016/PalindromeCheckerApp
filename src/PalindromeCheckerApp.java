import java.util.Scanner;

public class PalindromeCheckerApp {

    // Approach 1: Using StringBuilder reverse
    public static boolean isPalindromeUsingStringBuilder(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Approach 2: Using two-pointer technique
    public static boolean isPalindromeTwoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Approach 3: Recursive approach
    public static boolean isPalindromeRecursive(String str) {
        return checkPalindromeRecursive(str, 0, str.length() - 1);
    }

    private static boolean checkPalindromeRecursive(String str, int left, int right) {
        if (left >= right) return true;
        if (str.charAt(left) != str.charAt(right)) return false;
        return checkPalindromeRecursive(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Palindrome Checker Performance Comparison ===");
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine().replaceAll("\\s+", "").toLowerCase(); // remove spaces & lowercase

        // Run and measure Approach 1
        long start1 = System.nanoTime();
        boolean result1 = isPalindromeUsingStringBuilder(input);
        long end1 = System.nanoTime();

        // Run and measure Approach 2
        long start2 = System.nanoTime();
        boolean result2 = isPalindromeTwoPointer(input);
        long end2 = System.nanoTime();

        // Run and measure Approach 3
        long start3 = System.nanoTime();
        boolean result3 = isPalindromeRecursive(input);
        long end3 = System.nanoTime();

        // Display results
        System.out.println("\nResults:");
        System.out.println("1. StringBuilder Reverse: " + result1 + " (Time: " + (end1 - start1) + " ns)");
        System.out.println("2. Two-Pointer Method: " + result2 + " (Time: " + (end2 - start2) + " ns)");
        System.out.println("3. Recursive Method: " + result3 + " (Time: " + (end3 - start3) + " ns)");

        scanner.close();
    }
}