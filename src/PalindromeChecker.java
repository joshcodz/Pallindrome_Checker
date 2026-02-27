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
 * UC7: Deque-Based Optimized Palindrome Checker
 * UC8: Linked List Based Palindrome Checker
 * UC9: Recursive Palindrome Checker
 * UC10: Case-Insensitive & Space-Ignored Palindrome
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

        // UC7: Deque-Based Optimized Palindrome Checker
        System.out.println("\n--- UC7: Deque-Based Optimized Palindrome Check ---");
        String testWord6 = "civic";
        boolean isPalindromeUC7 = checkPalindromeUsingDeque(testWord6);
        if (isPalindromeUC7) {
            System.out.println("The word \"" + testWord6 + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + testWord6 + "\" is NOT a palindrome.");
        }

        // UC8: Linked List Based Palindrome Checker
        System.out.println("\n--- UC8: Linked List Based Palindrome Check ---");
        String testWord7 = "radar";
        boolean isPalindromeUC8 = checkPalindromeUsingLinkedList(testWord7);
        if (isPalindromeUC8) {
            System.out.println("The word \"" + testWord7 + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + testWord7 + "\" is NOT a palindrome.");
        }

        // UC9: Recursive Palindrome Checker
        System.out.println("\n--- UC9: Recursive Palindrome Check ---");
        String testWord8 = "rotator";
        boolean isPalindromeUC9 = checkPalindromeRecursive(testWord8);
        if (isPalindromeUC9) {
            System.out.println("The word \"" + testWord8 + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + testWord8 + "\" is NOT a palindrome.");
        }

        // UC10: Case-Insensitive & Space-Ignored Palindrome
        System.out.println("\n--- UC10: Case-Insensitive & Space-Ignored Palindrome Check ---");
        String testPhrase = "A man a plan a canal Panama";
        boolean isPalindromeUC10 = checkPalindromeIgnoringSpacesAndCase(testPhrase);
        System.out.println("Original phrase: \"" + testPhrase + "\"");
        if (isPalindromeUC10) {
            System.out.println("Result: This is a palindrome (ignoring spaces and case)!");
        } else {
            System.out.println("Result: This is NOT a palindrome.");
        }

        // Program exits
        System.out.println("\nProgram execution completed.");
    }

    /**
     * Node class for singly linked list (UC8)
     * Represents a single node with character data and reference to next node
     */
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
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

    /**
     * Checks if a string is a palindrome using Deque (UC7)
     *
     * Key Concepts Demonstrated:
     * - Deque (Double Ended Queue): Data structure allowing insertion/deletion from both ends
     * - Front and Rear Access: Direct comparison of first and last characters
     * - Optimized Data Handling: No need for separate reversal structures
     * - addLast() method: Insert character at the rear of the deque
     * - removeFirst() method: Remove and return character from the front
     * - removeLast() method: Remove and return character from the rear
     *
     * Algorithm:
     * 1. Insert all characters into deque using addLast()
     * 2. While deque has more than 1 element:
     *    a. Remove first character (removeFirst)
     *    b. Remove last character (removeLast)
     *    c. Compare them - if different, not a palindrome
     * 3. If all comparisons match, it's a palindrome
     *
     * Data Structure: Deque
     *
     * @param input The string to check
     * @return true if palindrome, false otherwise
     */
    private static boolean checkPalindromeUsingDeque(String input) {
        String lower = input.toLowerCase();

        // Deque - Double Ended Queue (insertion/deletion from both ends)
        java.util.Deque<Character> deque = new java.util.LinkedList<>();

        // Insert characters into deque (add at rear)
        for (int i = 0; i < lower.length(); i++) {
            deque.addLast(lower.charAt(i));  // Add to rear of deque
        }

        // Compare first and last elements until deque is empty or has 1 element
        while (deque.size() > 1) {
            char first = deque.removeFirst();  // Remove from front
            char last = deque.removeLast();    // Remove from rear

            // Front and Rear Access - compare first vs last
            if (first != last) {
                return false;  // Not a palindrome
            }
        }

        // If we reach here, all comparisons matched
        return true;
    }

    /**
     * Checks if a string is a palindrome using a singly linked list (UC8)
     *
     * Key Concepts Demonstrated:
     * - Singly Linked List: Dynamic data structure with node references
     * - Node Traversal: Sequential access using next references
     * - Fast and Slow Pointer Technique: Find middle of list efficiently
     * - In-Place Reversal: Reverse second half without extra memory
     *
     * Algorithm:
     * 1. Convert string to linked list
     * 2. Use fast/slow pointers to find middle
     * 3. Reverse the second half of the list
     * 4. Compare first half with reversed second half
     * 5. If all nodes match, it's a palindrome
     *
     * Data Structure: Singly Linked List
     *
     * @param input The string to check
     * @return true if palindrome, false otherwise
     */
    private static boolean checkPalindromeUsingLinkedList(String input) {
        String lower = input.toLowerCase();

        if (lower.length() == 0) {
            return true;
        }

        // Step 1: Convert string to linked list
        Node head = new Node(lower.charAt(0));
        Node current = head;
        for (int i = 1; i < lower.length(); i++) {
            current.next = new Node(lower.charAt(i));
            current = current.next;
        }

        // Step 2: Find middle using fast and slow pointer technique
        Node slow = head;
        Node fast = head;

        // Fast pointer moves 2 steps, slow moves 1 step
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 3: Reverse the second half (in-place reversal)
        Node secondHalf = reverseLinkedList(slow);
        Node firstHalf = head;

        // Step 4: Compare first half with reversed second half
        Node secondHalfCopy = secondHalf; // Keep reference for restoration
        boolean isPalindrome = true;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return isPalindrome;
    }

    /**
     * Helper method to reverse a linked list in-place (UC8)
     * 
     * @param head The head of the linked list to reverse
     * @return The new head of the reversed linked list
     */
    private static Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;  // Save next node
            current.next = prev;            // Reverse the link
            prev = current;                 // Move prev forward
            current = nextNode;             // Move current forward
        }

        return prev;  // New head of reversed list
    }

    /**
     * Checks if a string is a palindrome using recursion (UC9)
     *
     * Key Concepts Demonstrated:
     * - Recursion: Method calls itself to solve smaller subproblems
     * - Base Condition: Terminates recursion when start >= end
     * - Call Stack: Memory structure managing recursive method calls
     *
     * Algorithm:
     * 1. Base case: if start >= end, return true (palindrome)
     * 2. Compare characters at start and end positions
     * 3. If they don't match, return false
     * 4. Recursively check remaining substring (start+1, end-1)
     *
     * Data Structure: Call Stack
     *
     * @param input The string to check
     * @return true if palindrome, false otherwise
     */
    private static boolean checkPalindromeRecursive(String input) {
        String lower = input.toLowerCase();
        return isPalindromeRecursiveHelper(lower, 0, lower.length() - 1);
    }

    /**
     * Helper method for recursive palindrome check (UC9)
     * 
     * Key Concepts:
     * - Recursion: Method calls itself with modified parameters
     * - Base Condition: Prevents infinite recursion
     * - Call Stack: Each recursive call is pushed onto the call stack
     * 
     * @param str The string being checked
     * @param start Starting index
     * @param end Ending index
     * @return true if substring is a palindrome, false otherwise
     */
    private static boolean isPalindromeRecursiveHelper(String str, int start, int end) {
        // Base Condition - terminates recursion
        // If start >= end, we've checked all pairs
        if (start >= end) {
            return true;
        }

        // Compare characters at start and end positions
        if (str.charAt(start) != str.charAt(end)) {
            return false;  // Not a palindrome
        }

        // Recursive call - check remaining substring
        // Move start forward and end backward
        // This creates a new call on the Call Stack
        return isPalindromeRecursiveHelper(str, start + 1, end - 1);
    }

    /**
     * Checks if a string is a palindrome ignoring spaces and case (UC10)
     *
     * Key Concepts Demonstrated:
     * - String Preprocessing: Normalize string by removing unwanted characters
     * - Regular Expressions: Use replaceAll() to remove spaces
     * - toLowerCase(): Convert to lowercase for case-insensitive comparison
     * - Two-Pointer Technique: Efficient comparison after preprocessing
     *
     * Algorithm:
     * 1. Remove all spaces using regular expression
     * 2. Convert to lowercase for case-insensitive comparison
     * 3. Use two-pointer technique to compare characters
     * 4. Return true if all characters match
     *
     * Data Structure: String (preprocessed) / char array
     *
     * @param input The string/phrase to check
     * @return true if palindrome (ignoring spaces and case), false otherwise
     */
    private static boolean checkPalindromeIgnoringSpacesAndCase(String input) {
        // String Preprocessing - remove spaces using regular expression
        // \\s+ matches one or more whitespace characters
        String normalized = input.replaceAll("\\s+", "");
        
        // Convert to lowercase for case-insensitive comparison
        normalized = normalized.toLowerCase();
        
        // Convert to char array for efficient access
        char[] chars = normalized.toCharArray();
        
        // Two-pointer technique to compare characters
        int left = 0;
        int right = chars.length - 1;
        
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;  // Not a palindrome
            }
            left++;
            right--;
        }
        
        return true;  // All characters matched - it's a palindrome
    }
}