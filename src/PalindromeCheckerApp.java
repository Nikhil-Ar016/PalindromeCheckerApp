public class PalindromeCheckerApp {

    // Node class for singly linked list
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        String word = "level";

        // Step 1: Convert string to linked list
        Node head = createLinkedList(word);

        // Step 2: Check palindrome
        boolean isPalindrome = isPalindromeLinkedList(head);

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }

    // Create singly linked list from string
    public static Node createLinkedList(String word) {
        Node head = null;
        Node tail = null;
        for (char c : word.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    // Check palindrome using fast/slow pointer & reverse
    public static boolean isPalindromeLinkedList(Node head) {
        if (head == null || head.next == null) return true;

        // Find middle using fast & slow
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverseList(slow.next);

        // Compare first and second halves
        Node firstHalf = head;
        Node secondHalfCopy = secondHalf; // to restore later if needed
        boolean isPalindrome = true;
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // Optional: restore list
        slow.next = reverseList(secondHalfCopy);

        return isPalindrome;
    }

    // Reverse linked list
    public static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}