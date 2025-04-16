import java.util.Scanner;

class BankAccount {
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }
}

class SavingsAccount extends BankAccount {
    void addInterest() {
        double interest = (balance * 10) / 100; // 5% interest
        balance = balance + interest;
    }
}
 class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount acc = new SavingsAccount();

        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        acc.deposit(dep);

        System.out.print("Enter withdraw amount: ");
        double wd = sc.nextDouble();
        acc.withdraw(wd);

        acc.addInterest();

        System.out.println("Final Balance: " + acc.balance);
    }
}
