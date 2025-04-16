class BankAccount {
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Not enough balance.");
        }
    }
}

class SavingsAccount extends BankAccount {
    double interestRate = 5.0; // 5% interest

    void addInterest() {
        double interest = (balance * interestRate) / 100;
        balance = balance + interest;
    }
}
public class BankMain {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount();

        acc.deposit(1000);               // Deposit ₹1000
        acc.withdraw(200);               // Withdraw ₹200
        acc.addInterest();               // Add 5% interest

        System.out.println("Final Balance: " + acc.balance);
    }
}
