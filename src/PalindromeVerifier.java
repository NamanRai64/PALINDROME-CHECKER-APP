public class PalindromeVerifier {
    private void checkPalindrome(String Word){
        System.out.println("Input text: "+ Word);
        for(int i=0,n=Word.length();i<n-1;i++){
            if(Word.charAt(i)!=Word.charAt(n-i-1)){
                System.out.println(Word + " is it a palindrome");
                return;
            }
        }
        System.out.println(Word + " is a palindrome");
    }

}
