public class PalindromeChecker {
    // Attribute
    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedText = new StringBuilder(cleanedText).reverse().toString();
        return cleanedText.equals(reversedText);
    }

    // Method to display the result
    public void displayResult() {
        System.out.println("Original Text: " + text);
        if (isPalindrome()) {
            System.out.println("Result: It's a palindrome!");
        } else {
            System.out.println("Result: Not a palindrome.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        PalindromeChecker checker1 = new PalindromeChecker("Madam");
        PalindromeChecker checker2 = new PalindromeChecker("Hello, World!");

        checker1.displayResult();
        System.out.println(); // For spacing
        checker2.displayResult();
    }
}