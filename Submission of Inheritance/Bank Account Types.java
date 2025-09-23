import java.util.ArrayList;
import java.util.List;

class BankAccount {
    protected String accountNumber;
    protected double balance;
    
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }
    
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;
    
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    public void applyInterest() {
        balance += balance * interestRate;
    }
    
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;
    
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount <= balance && amount <= withdrawalLimit) {
            balance -= amount;
        }
    }
    
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int termMonths;
    private double fixedInterestRate;
    
    public FixedDepositAccount(String accountNumber, double balance, int termMonths, double fixedInterestRate) {
        super(accountNumber, balance);
        this.termMonths = termMonths;
        this.fixedInterestRate = fixedInterestRate;
    }
    
    public void matureAccount() {
        balance += balance * fixedInterestRate * (termMonths / 12.0);
    }
    
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Term: " + termMonths + " months");
        System.out.println("Fixed Interest Rate: " + (fixedInterestRate * 100) + "%");
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        
        SavingsAccount savings = new SavingsAccount("SA001", 5000, 0.02);
        CheckingAccount checking = new CheckingAccount("CA001", 3000, 1000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD001", 10000, 12, 0.05);
        
        accounts.add(savings);
        accounts.add(checking);
        accounts.add(fixedDeposit);
        
        for (BankAccount account : accounts) {
            if (account instanceof SavingsAccount) {
                ((SavingsAccount) account).displayAccountType();
            } else if (account instanceof CheckingAccount) {
                ((CheckingAccount) account).displayAccountType();
            } else if (account instanceof FixedDepositAccount) {
                ((FixedDepositAccount) account).displayAccountType();
            }
            account.displayBalance();
            System.out.println();
        }
        
        savings.deposit(1000);
        savings.applyInterest();
        checking.withdraw(500);
        fixedDeposit.matureAccount();
        
        System.out.println("After transactions:");
        savings.displayAccountType();
        savings.displayBalance();
        System.out.println();
        
        checking.displayAccountType();
        checking.displayBalance();
        System.out.println();
        
        fixedDeposit.displayAccountType();
        fixedDeposit.displayBalance();
    }
}
