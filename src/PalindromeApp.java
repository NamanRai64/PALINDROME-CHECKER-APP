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
    static void runPerformanceTest(String word) {

        System.out.println("\n--- UC13: Performance Comparison ---");

        PalindromeStrategy[] strategies = {
                new StackStrategy(),
                new DequeStrategy()
        };

        String[] strategyNames = {
                "Stack Strategy",
                "Deque Strategy"
        };

        int iterations = 100000;

        System.out.println("Running " + iterations + " iterations...\n");

        for (int i = 0; i < strategies.length; i++) {

            long startTime = System.nanoTime();

            for (int j = 0; j < iterations; j++) {
                strategies[i].isPalindrome(word);
            }

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            long avgTime = duration / iterations;

            System.out.println(strategyNames[i] + ":");
            System.out.println("Total Time   = " + duration + " ns");
            System.out.println("Average Time = " + avgTime + " ns\n");
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
                System.out.println(exampleWord + " is NOT a palindrome");
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
        System.out.println("Would you like a demo? (true or false)");
        boolean demo=sc.nextBoolean();
        sc.nextLine();
        if (demo) {
            hardCodedCheck();
        }
        System.out.println("\nWould you like to try?\nEnter a word:");
        String word = sc.nextLine();

        if (!word.isEmpty()) {
            PalindromeVerifier pv = new PalindromeVerifier();
            System.out.println("\n--- Method 1: Iterative Check ---");
            pv.checkPalindrome(word);

            System.out.println("\n--- Method 2: Stack Check ---");
            pv.stackCheck(word);

            System.out.println("\n--- Method 3: Array Check ---");
            pv.stackCheck(word);

            System.out.println("\n--- Method 4: Queue-Stack Check ---");
            pv.queueStackCheck(word);

            System.out.println("\n--- Method 5: Deque Check ---");
            pv.checkPalindromeUC7(word);

            System.out.println("\n--- Method 6: Reverse Check ---");
            pv.checkPalindromeUC3(word);

            System.out.println("\n--- Method 7: Linked List Reverse Check ---");
            pv.LLcheck(word);

            System.out.println("\n--- Method 8: Recursive Check ---");
            pv.RecursiveChecker(word);

            System.out.println("\n--- Method 9: Case Insensitive Array Check ---");
            pv.caseInsensitiveCheck(word);

            System.out.println("\n--- Method 10: Case Insensitive Array Check ---");
            pv.caseInsensitiveCheck(word);

            System.out.println("\n--- Method 11: Strategy Pattern ---");

            PalindromeContext context = new PalindromeContext(new StackStrategy());
            context.executeStrategy(word);

            System.out.println("\nSwitching to Deque Strategy...");
            context.setStrategy(new DequeStrategy());
            context.executeStrategy(word);

            runPerformanceTest(word);
        }
    }
}
