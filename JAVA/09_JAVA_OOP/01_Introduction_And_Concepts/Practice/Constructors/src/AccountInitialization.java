
/**
 * Demonstrates object initialization through constructor.
 * Class: Account
 */
class Account {
    int accountNumber;
    String holderName;
    double balance;

    // Constructor to initialize object
    Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void displayInfo() {
        System.out.println("Account No : " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance    : $" + balance);
    }
}

public class AccountInitialization {
    public static void main(String[] args) {
        Account acc = new Account(123456, "Ravi Timsina", 15000.75);
        acc.displayInfo();
    }
}
