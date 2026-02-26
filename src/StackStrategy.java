public class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String word) {
        int n = word.length();
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (int i = 0; i < n / 2; i++) {
            stack.push(word.charAt(i));
        }

        int start = (n + 1) / 2;

        for (int i = start; i < n; i++) {
            if (stack.pop() != word.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}