package objectorientedprogramming.fundamentals.level2;

/*
 * Program: Palindrome Checker
 * Description: Checks whether a given string
 * is a palindrome or not.
 */
public class PalindromeChecker {

    // Text to be checked
    String text;

    // Method to check palindrome
    boolean isPalindrome() {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        return text.equals(reversed);
    }

    // Method to display result
    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a Palindrome");
        } else {
            System.out.println(text + " is not a Palindrome");
        }
    }

    public static void main(String[] args) {
        // Creating object
        PalindromeChecker checker = new PalindromeChecker();

        // Assigning value
        checker.text = "madam";

        // Displaying result
        checker.displayResult();
    }
}
