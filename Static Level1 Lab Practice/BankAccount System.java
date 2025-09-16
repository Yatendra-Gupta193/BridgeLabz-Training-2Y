class BankAccountSystem {
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;

    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }
    public void displayDetails() {
        System.out.println("Bank: " + bankName +
                           ", Account No: " + accountNumber +
                           ", Holder: " + accountHolderName +
                           ", Balance: " + balance);
    }
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001, "Ravi", 5000);
        BankAccount acc2 = new BankAccount(1002, "Amit", 8000);

        if (acc1 instanceof BankAccount) {
            acc1.displayDetails();
        }
        if (acc2 instanceof BankAccount) {
            acc2.displayDetails();
        }
        BankAccount.getTotalAccounts();
    }
}
