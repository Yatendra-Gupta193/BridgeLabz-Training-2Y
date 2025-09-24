import java.util.*;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public abstract double calculateInterest();

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan application for $" + amount + " submitted for savings account");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 5;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan application for $" + amount + " submitted for current account");
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 3;
    }
}

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        
        accounts.add(new SavingsAccount("SAV001", "John Doe", 5000));
        accounts.add(new CurrentAccount("CUR001", "Jane Smith", 10000));
        accounts.add(new SavingsAccount("SAV002", "Bob Johnson", 7500));
        accounts.add(new CurrentAccount("CUR002", "Alice Brown", 15000));
        
        for (BankAccount account : accounts) {
            double interest = account.calculateInterest();
            System.out.println("Account: " + account.getAccountNumber());
            System.out.println("Holder: " + account.getHolderName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest: " + interest);
            
            if (account instanceof Loanable) {
                double loanEligibility = ((Loanable) account).calculateLoanEligibility();
                System.out.println("Loan Eligibility: " + loanEligibility);
                ((Loanable) account).applyForLoan(loanEligibility / 2);
            }
            
            System.out.println("-------------------");
        }
    }
}
