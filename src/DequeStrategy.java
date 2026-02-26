import java.util.Deque;
import java.util.LinkedList;

public class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean isPalindrome(String word) {
        Deque<Character> deque = new LinkedList<>();

        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}