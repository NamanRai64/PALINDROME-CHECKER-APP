public class PalindromeContext {

    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(String word) {
        if (strategy.isPalindrome(word)) {
            System.out.println(word + " IS a palindrome");
        } else {
            System.out.println(word + " is NOT a palindrome");
        }
    }
}