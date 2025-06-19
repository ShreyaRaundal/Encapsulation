package BankAccountApp;

public class BankAccount {
    private String username;
    private String bankname;
    private long accno;
    private int pin;
    private String ifsc;
    private double balance;

    public BankAccount(String username, String bankname, long accno, int pin, String ifsc, double balance) {
        this.username = username;
        this.bankname = bankname;
        this.accno = accno;
        this.pin = pin;
        this.ifsc = ifsc;
        this.balance = balance;
    }

    public double getBalance(long accno, int pin) {
        if (this.accno == accno && this.pin == pin)
            return balance;
        System.out.println("Invalid credentials.");
        return -1;
    }

    public void credit(long accno, int pin, double amt) {
        if (this.accno == accno && this.pin == pin && amt > 0) {
            balance += amt;
            System.out.println("Amount credited.");
        } else {
            System.out.println("Invalid credentials or amount.");
        }
    }

    public void debit(long accno, int pin, double amt) {
        if (this.accno == accno && this.pin == pin) {
            if (amt > 0 && balance - amt >= 1000) {
                balance -= amt;
                System.out.println("Amount debited.");
            } else {
                System.out.println("Invalid amount or insufficient balance.");
            }
        } else {
            System.out.println("Invalid credentials.");
        }
    }

    public void checkBalance(long accno, int pin) {
        if (this.accno == accno && this.pin == pin)
            System.out.println("Current Balance: ₹" + balance);
        else
            System.out.println("Invalid credentials.");
    }

    public void setPin(long accno, int oldPin, int newPin) {
        if (this.accno == accno && this.pin == oldPin) {
            this.pin = newPin;
            System.out.println("PIN changed successfully.");
        } else {
            System.out.println("Invalid credentials. PIN not changed.");
        }
    }
}
