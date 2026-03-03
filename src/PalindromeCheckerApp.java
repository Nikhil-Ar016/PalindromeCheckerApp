public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // Input as per the requirement example
        String input = "racecar";

        // Create an instance of the service (Encapsulation)
        PalindromeService service = new PalindromeService();

        // Call the service method
        boolean isPalindrome = service.checkPalindrome(input);

        // Output results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}


class PalindromeService {

   
    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }
        return true; // Is a palindrome
    }
}
}
