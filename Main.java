import Balance.Account; // Importing the Account class from the Balance package

public class Main {
    public static void main(String[] args) {
        // Creating an Account object with a balance of 5000.75
        Account myAccount = new Account(5000.75);
        
        // Displaying the balance
        myAccount.Display_Balance();
    }
}
