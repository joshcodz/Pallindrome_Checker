/**
 * PalindromeChecker Application
 * 
 * This console-based Java application validates whether a given string is a palindrome
 * under different conditions, strengthening core programming fundamentals and data structure concepts.
 * 
 * UC1: Application Entry & Welcome Message
 * UC2: Print a Hardcoded Palindrome Result
 * UC3: Palindrome Check Using String Reverse
 * UC4: Character Array Based Palindrome Check
 * UC5: Stack-Based Palindrome Checker
 * UC6: Queue + Stack Based Palindrome Check
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
        
        // UC3: Palindrome Check Using String Reverse
        System.out.println("\n--- UC3: Palindrome Check Using String Reverse ---");
        
        // Test word for UC3
        String testWord2 = "racecar";
        
        // Reverse the string using a for loop
        String reversedString = reverseStringUsingLoop(testWord2);
        
        // Display the reversed string
        System.out.println("Original string: \"" + testWord2 + "\"");
        System.out.println("Reversed string: \"" + reversedString + "\"");
        
        // Compare original and reversed using equals() method
        boolean isPalindromeUC3 = checkPalindromeByReverse(testWord2);
        
        // Display result
        if (isPalindromeUC3) {
            System.out.println("Result: \"" + testWord2 + "\" is a palindrome!");
        } else {
            System.out.println("Result: \"" + testWord2 + "\" is NOT a palindrome.");
        }
        
        // UC4: Character Array Based Palindrome Check
        System.out.println("\n--- UC4: Character Array Based Palindrome Check ---");
        String testWord3 = "level";
        boolean isPalindromeUC4 = checkPalindromeUsingCharArray(testWord3);
        if (isPalindromeUC4) {
            System.out.println("The word \"" + testWord3 + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + testWord3 + "\" is NOT a palindrome.");
        }

        // UC5: Stack-Based Palindrome Checker
        System.out.println("\n--- UC5: Stack-Based Palindrome Check ---");
        String testWord4 = "refer";
        boolean isPalindromeUC5 = checkPalindromeUsingStack(testWord4);
        if (isPalindromeUC5) {
            System.out.println("The word \"" + testWord4 + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + testWord4 + "\" is NOT a palindrome.");
        }

        // UC6: Queue + Stack Based Palindrome Check
        System.out.println("\n--- UC6: Queue + Stack Based Palindrome Check ---");
        String testWord5 = "noon";
        boolean isPalindromeUC6 = checkPalindromeUsingQueueAndStack(testWord5);
        if (isPalindromeUC6) {
            System.out.println("The word \"" + testWord5 + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + testWord5 + "\" is NOT a palindrome.");
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
        // Convert to lowercase for case-insensitive comparison
        String lowerCaseWord = word.toLowerCase();
        

        String reversedWord = new StringBuilder(lowerCaseWord).reverse().toString();
        

        return lowerCaseWord.equals(reversedWord);
    }
    
    /**
     * Reverses a string using a for loop (UC3)
     * 
     * Key Concepts Demonstrated:
     * - Loop (for loop): Iterates through characters in reverse order
     * - String Immutability: String objects cannot be modified; each concatenation creates a new String
     * - String Concatenation (+): Builds reversed string character by character
     *   Note: This approach is less efficient due to String immutability - each + operation
     *   creates a new String object in memory, making this O(n²) time complexity
     * - charAt() method: Accesses individual characters at specific indices
     * 
     * Algorithm:
     * 1. Start with empty string
     * 2. Loop from last character to first (index from length-1 to 0)
     * 3. Concatenate each character to build reversed string
     * 4. Return the reversed string
     * 
     * Data Structure: String
     * 
     * @param str The string to reverse
     * @return The reversed string
     */
    private static String reverseStringUsingLoop(String str) {
        // Convert to lowercase for case-insensitive comparison
        String lowerStr = str.toLowerCase();
        
        // Initialize empty string for reversed result
        // String Immutability: This will be recreated multiple times in the loop
        String reversed = "";
        
        // Loop (for loop) - Iterate through characters in reverse order
        // Start from last character (length - 1) and go to first character (0)
        for (int i = lowerStr.length() - 1; i >= 0; i--) {
            // String Concatenation (+) - Build reversed string character by character
            // Note: Each concatenation creates a NEW String object due to immutability
            // This demonstrates the drawback of using + for string building in loops
            reversed = reversed + lowerStr.charAt(i);
        }
        
        return reversed;
    }
    
    /**
     * Checks if a string is a palindrome by reversing it using a for loop (UC3)
     * 
     * Key Concepts Demonstrated:
     * - equals() Method: Compares the actual content of two String objects
     *   (not memory references like == would do)
     * - String comparison for palindrome validation
     * - Integration of reverse logic with comparison
     * 
     * Algorithm:
     * 1. Reverse the string using for loop
     * 2. Compare original with reversed using equals()
     * 3. Return true if equal (palindrome), false otherwise
     * 
     * @param str The string to check
     * @return true if palindrome, false otherwise
     */
    private static boolean checkPalindromeByReverse(String str) {
        // Convert to lowercase for case-insensitive comparison
        String lowerStr = str.toLowerCase();
        
        // Reverse the string using loop
        String reversedStr = reverseStringUsingLoop(str);
        
        // equals() Method - Compare actual content of two String objects
        // This checks if the characters are the same, not memory addresses
        return lowerStr.equals(reversedStr);
    }
    
    /**
     * Checks if a string is a palindrome using a character array and two pointers (UC4)
     *
     * Key Concepts Demonstrated:
     * - Character Array (char[]): Index-based access to characters
     * - Array Indexing: Access elements using 0-based indices
     * - Two-Pointer Technique: Compare from both ends toward the center
     * - Time Complexity Awareness: O(n) without creating extra reversed strings
     *
     * @param input The string to check
     * @return true if palindrome, false otherwise
     */
    private static boolean checkPalindromeUsingCharArray(String input) {
        String lower = input.toLowerCase();
        char[] chars = lower.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }

    /**
     * Checks if a string is a palindrome using a Stack (UC5)
     *
     * Key Concepts Demonstrated:
     * - Stack (LIFO): Last In First Out data structure
     * - Push Operation: Insert characters into the stack
     * - Pop Operation: Remove characters in reverse order
     * - Reversal Logic: Stack naturally reverses character order
     *
     * @param input The string to check
     * @return true if palindrome, false otherwise
     */
    private static boolean checkPalindromeUsingStack(String input) {
        String lower = input.toLowerCase();
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (int i = 0; i < lower.length(); i++) {
            stack.push(lower.charAt(i));
        }

        for (int i = 0; i < lower.length(); i++) {
            if (stack.pop() != lower.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Checks if a string is a palindrome using both Queue and Stack (UC6)
     *
     * Key Concepts Demonstrated:
     * - Queue (FIFO): First In First Out data structure
     * - Enqueue Operation: Insert characters into the queue
     * - Dequeue Operation: Remove characters from the queue in original order
     * - Stack vs Queue: Demonstrates behavioral difference between LIFO and FIFO
     * - Logical Comparison: Matching dequeue output with pop output validates palindrome
     *
     * Algorithm:
     * 1. Enqueue all characters into a queue (FIFO)
     * 2. Push all characters into a stack (LIFO)
     * 3. Compare dequeue (original order) with pop (reversed order)
     * 4. If all match, the string is a palindrome
     *
     * Data Structures: Queue, Stack
     *
     * @param input The string to check
     * @return true if palindrome, false otherwise
     */
    private static boolean checkPalindromeUsingQueueAndStack(String input) {
        String lower = input.toLowerCase();
        
        // Queue - FIFO (First In First Out)
        java.util.Queue<Character> queue = new java.util.LinkedList<>();
        
        // Stack - LIFO (Last In First Out)
        java.util.Stack<Character> stack = new java.util.Stack<>();
        
        // Enqueue characters into queue and push characters into stack
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            queue.add(ch);    // Enqueue operation
            stack.push(ch);   // Push operation
        }
        
        // Compare dequeue (FIFO - original order) vs pop (LIFO - reverse order)
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();  // Dequeue operation (first character)
            char fromStack = stack.pop();     // Pop operation (last character)
            
            // Logical Comparison - if characters don't match, not a palindrome
            if (fromQueue != fromStack) {
                return false;
            }
        }
        
        return true;
    }
}