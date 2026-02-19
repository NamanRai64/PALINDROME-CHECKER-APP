import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class PalindromeVerifier {
    protected void checkPalindrome(String word) {
        int n = word.length();
        for (int i = 0; i < n / 2; i++) {
            if (word.charAt(i) != word.charAt(n - i - 1)) {
                System.out.println(word + " is NOT a palindrome");
                return;
            }
        }
        System.out.println(word + " IS a palindrome");
    }

    protected void stackCheck(String word) {
        int n = word.length();
        Stack s = new Stack(n);

        for (int i = 0; i < n / 2; i++) {
            s.push(word.charAt(i));
        }

        int startOfSecondHalf = (n + 1) / 2;
        for (int i = startOfSecondHalf; i < n; i++) {
            if (s.pop() != word.charAt(i)) {
                System.out.println(word + " is NOT a palindrome");
                return;
            }
        }
        System.out.println(word + " IS a palindrome");
    }

    protected void arrayCheck(String word) {

        char[] charArray = word.toCharArray();
        for (int i = 0, n = word.length(); i < n - 1; i++) {
            if (charArray[i] != charArray[n - i - 1]) {
                System.out.println(word + " is NOT a palindrome");
                return;
            }
        }
        System.out.println(word + " is a palindrome");
    }


    public void queueStackCheck(String word) {
        // 1. Handle edge cases
        if (word == null || word.isEmpty()) {
            System.out.println("Empty string is a palindrome");
            return;
        }

        int n = word.length();
        // Use Character wrapper instead of char
        Stack s = new Stack(n);

        // 2. Push the first half onto the stack
        for (int i = 0; i < n / 2; i++) {
            s.push(word.charAt(i));
        }

        int startOfSecondHalf = (n + 1) / 2;

        // 4. Compare stack with the second half
        for (int i = startOfSecondHalf; i < n; i++) {
            if (s.pop() != word.charAt(i)) {
                System.out.println(word + " is NOT a palindrome");
                return;
            }
        }

        System.out.println(word + " IS a palindrome");
    }

    public void checkPalindromeUC3(String word) {
        // 1. Initialise an empty string to store the reverse
        String reversed = "";
        int n = word.length();

        // 2. Loop: Iterate through the string in reverse order
        for (int i = n - 1; i >= 0; i--) {
            // String Concatenation (+): Creating a new string object each time
            reversed = reversed + word.charAt(i);
        }

        // 3. Compare: Use equals() to check content, not memory address (==)
        if (word.equalsIgnoreCase(reversed)) {
            System.out.println(word + " IS a palindrome.");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }
    }

    public void checkPalindromeUC7(String word) {
        // 1. Initialize Deque
        Deque<Character> deque = new LinkedList<>();

        // 2. Insert characters into deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        boolean isPalindrome = true;

        // 3. Remove first & last and compare until empty or 1 element remains
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // 4. Display result
        if (isPalindrome) {
            System.out.println(word + " IS a palindrome");
        } else {
            System.out.println(word + " is NOT a palindrome");
        }
    }
}
