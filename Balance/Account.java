package Balance; // Declaring the package

public class Account {
    private double balance;

    // Constructor to initialize balance
    public Account(double balance) {
        this.balance = balance;
    }

    // Method to display account balance
    public void Display_Balance() {
        System.out.println("Account Balance: $" + balance);
    }
}
