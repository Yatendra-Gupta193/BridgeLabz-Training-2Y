public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Alice", 12345, 5000);
        b.deposit(2000);
        b.withdraw(3000);
        b.display();
    }
}
