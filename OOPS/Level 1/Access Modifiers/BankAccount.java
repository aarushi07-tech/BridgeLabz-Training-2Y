public class BankAccount {
    // Access modifiers
    public String accountNumber;       // Public: accessible anywhere
    protected String accountHolder;    // Protected: accessible in subclasses
    private double balance;            // Private: accessible only within this class

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }

    // Public method to set balance
    public void setBalance(double amount) {
        if (amount >= 0) {
            this.balance = amount;
        } else {
            System.out.println("❌ Invalid balance amount. Must be non-negative.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("🏦 Bank Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.printf("Balance: ₹%.2f\n", balance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        BankAccount account = new BankAccount("IN9876543210", "Meera Joshi", 10000.00);

        account.displayAccountDetails();
        System.out.println();

        // Modify balance
        account.setBalance(12000.00);
        System.out.printf("Updated Balance: ₹%.2f\n", account.getBalance());
    }
}