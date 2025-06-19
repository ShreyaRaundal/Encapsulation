package BankAccountApp;

public class BankAccountDriver {
    public static void main(String[] args) {
        // Creating a new bank account object
        BankAccount b1 = new BankAccount("Shreya", "ICICI", 8180839977L, 1234, "ICIC4e556", 5000.0);

        // Check balance using getBalance()
        System.out.println("Balance is: ₹" + b1.getBalance(8180839977L, 1234));

        // Credit ₹1000
        b1.credit(8180839977L, 1234, 1000);

        // Debit ₹500
        b1.debit(8180839977L, 1234, 500);

        // Print current balance
        b1.checkBalance(8180839977L, 1234);

        // Change the PIN
        b1.setPin(8180839977L, 1234, 9876);

        // Debit ₹1000 using new PIN
        b1.debit(8180839977L, 9876, 1000);

        // Final balance
        System.out.println("Final Balance: ₹" + b1.getBalance(8180839977L, 9876));
    }
}
