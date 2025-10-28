public class BankAccount {
    // Static variable shared across all accounts
    private static String bankName = "National Bank of India";
    private static int totalAccounts = 0;

    // Final variable: cannot be changed once assigned
    private final String accountNumber;

    // Instance variable
    private String accountHolderName;
    private double balance;

    // Constructor using 'this' to resolve ambiguity
    public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber; // 'this' not needed here as no ambiguity
        this.balance = initialBalance;
        totalAccounts++; // Increment total accounts
    }

    // Static method to display total number of accounts
    public static void getTotalAccounts() {
        System.out.println("🏦 Total Bank Accounts: " + totalAccounts);
    }

    // Method to display account details using instanceof
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("💳 Account Details:");
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.printf("Balance: ₹%.2f\n", balance);
        } else {
            System.out.println("❌ Invalid account object.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Ravi Kumar", "IN001", 15000.00);
        BankAccount acc2 = new BankAccount("Sneha Mehta", "IN002", 22000.00);

        acc1.displayAccountDetails();
        System.out.println();
        acc2.displayAccountDetails();
        System.out.println();

        BankAccount.getTotalAccounts();
    }
}