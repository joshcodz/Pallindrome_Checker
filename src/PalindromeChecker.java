
public class PalindromeChecker {
    

    private static final String APP_NAME = "Palindrome Checker App";
    private static final String APP_VERSION = "1.0";
    private static final String APP_AUTHOR = "Josh";
    

    public static void main(String[] args) {

        displayWelcomeMessage();
        

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
}
