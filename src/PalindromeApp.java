import java.util.Random;
import java.util.Scanner;

public class PalindromeApp {
    static void welcomeMessage(){
        System.out.println("\nWelcome to Palindrome Checker Management System!!!\n");
        System.out.println("Author: NamanRai64\nVersion: 1.0\nSystem Initialized Successfully\n");
    }
    static void desc(boolean description){
        if(description==true){
            System.out.println("\nThe objective of the PalindromeChecker App is to design and implement a console-based Java application that validates whether a given\n" +
                    " string is a palindrome under different conditions, while strengthening core programming fundamentals and data structure concepts.");
        }
    }
    public static int getRandomInt(int min, int max) {
        // Formula for inclusive range [min, max]
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
    static void hardCodedCheck(){
        String[] palindromes = {"madam","racecar","radar","level","rotor","civic","noon","kayak","refer","stats"};
        String[] noPalindromes = {"mango","tuple","radio","pen","apple","call","moon","earth","referee","statue"};
        System.out.println("Example 1:");
        exampleCheck(noPalindromes[getRandomInt(0, noPalindromes.length-1)]);
        System.out.println("\nExample 2:");
        exampleCheck(palindromes[getRandomInt(0,palindromes.length-1)]);
    }
    static void exampleCheck(String exampleWord){
        System.out.println("Input text: "+exampleWord);
        for(int i=0,n=exampleWord.length();i<n-1;i++){
            if(exampleWord.charAt(i)!=exampleWord.charAt(n-i-1)){
                System.out.println(exampleWord + " is it a palindrome");
                return;
            }
        }
        System.out.println(exampleWord + " is a palindrome");
    }
    public static void main(String[] args) {
        System.out.println();
        for(int i = 0 ; i < 80 ; i++){
            System.out.print("=-");
        }
        welcomeMessage();
        desc(true);
        for(int i = 0 ; i < 80 ; i++){
            System.out.print("=-");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("would you like a demo? (true or false)");
        boolean demo=sc.nextBoolean();
        if (demo) {
            hardCodedCheck();
        }

    }
}
