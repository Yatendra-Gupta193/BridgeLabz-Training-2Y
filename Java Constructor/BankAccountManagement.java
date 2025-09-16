class BankAccountManagement {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }
    public void displayAccountDetails() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1001, "Amit", 5000);
        acc.displayAccountDetails();
        acc.deposit(2000);
        acc.displayAccountDetails();
        acc.withdraw(3000);
        acc.displayAccountDetails();
    }
}
