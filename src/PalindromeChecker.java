/**
 * PalindromeChecker Application
 * 
 * This console-based Java application validates whether a given string is a palindrome
 * under different conditions, strengthening core programming fundamentals and data structure concepts.
 * 
 * UC1: Application Entry & Welcome Message
 * UC2: Print a Hardcoded Palindrome Result
 * 
 * @author Josh
 * @version 1.0
 * @since 2026-02-27
 */
public class PalindromeChecker {
    
    // Application constants
    private static final String APP_NAME = "Palindrome Checker App";
    private static final String APP_VERSION = "1.0";
    private static final String APP_AUTHOR = "Josh";
    

    public static void main(String[] args) {
        // UC1: Display welcome message and app details
        displayWelcomeMessage();
        
        // UC2: Print a Hardcoded Palindrome Result
        System.out.println("\n--- UC2: Hardcoded Palindrome Check ---");
        
        // String Literal - hardcoded string to be checked
        String testWord = "madam";
        
        // Check if the hardcoded string is a palindrome
        boolean isPalindrome = checkPalindrome(testWord);
        
        // Conditional Statement (if-else) - Display result based on condition
        if (isPalindrome) {
            System.out.println("The word \"" + testWord + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + testWord + "\" is NOT a palindrome.");
        }
        
        // Program exits
        System.out.println("\nProgram execution completed.");
    }
    

    private static void displayWelcomeMessage() {
        System.out.println("========================================");
        System.out.println("  " + APP_NAME);
        System.out.println("========================================");
        System.out.println("Version: " + APP_VERSION);
        System.out.println("Author: " + APP_AUTHOR);
        System.out.println("========================================");
        System.out.println("\nWelcome to the Palindrome Checker!");
        System.out.println("This application validates whether a given");
        System.out.println("string is a palindrome under different conditions.");
        System.out.println("========================================");
    }
    

    private static boolean checkPalindrome(String word) {

        String lowerCaseWord = word.toLowerCase();
        

        String reversedWord = new StringBuilder(lowerCaseWord).reverse().toString();
        

        return lowerCaseWord.equals(reversedWord);
    }
}
