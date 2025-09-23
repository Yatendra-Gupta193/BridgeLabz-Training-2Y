import java.util.ArrayList;

// Bank class
class Bank {
    private String bankName;
    private ArrayList<Customer> customers;  // Association relationship
    
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }
    
    // Open account for customer (association method)
    public void openAccount(Customer customer, double initialBalance) {
        customers.add(customer);
        customer.setBankAccount(this, initialBalance);
        System.out.println(customer.getName() + " opened an account with " + bankName);
    }
    
    public String getBankName() {
        return bankName;
    }
    
    // Display all customers
    public void displayCustomers() {
        System.out.println("\nCustomers of " + bankName + ":");
        for (Customer customer : customers) {
            System.out.println("  - " + customer.getName() + 
                             " | Balance: $" + customer.getBalance());
        }
    }
}

// Customer class
class Customer {
    private String name;
    private Bank bank;        // Association relationship
    private double balance;
    
    public Customer(String name) {
        this.name = name;
        this.balance = 0.0;
    }
    
    // Set bank account (association)
    public void setBankAccount(Bank bank, double initialBalance) {
        this.bank = bank;
        this.balance = initialBalance;
    }
    
    // View balance
    public void viewBalance() {
        if (bank != null) {
            System.out.println(name + "'s balance in " + bank.getBankName() + 
                             ": $" + balance);
        } else {
            System.out.println(name + " has no bank account");
        }
    }
    
    // Deposit money
    public void deposit(double amount) {
        if (bank != null && amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " to " + name + "'s account");
        }
    }
    
    // Getters
    public String getName() {
        return name;
    }
    
    public double getBalance() {
        return balance;
    }
}

// Main class to demonstrate association
public class AssociationExample {
    public static void main(String[] args) {
        // Create banks
        Bank bank1 = new Bank("State Bank");
        Bank bank2 = new Bank("City Bank");
        
        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");
        Customer customer3 = new Customer("Charlie");
        
        // Establish association between banks and customers
        bank1.openAccount(customer1, 1000.0);
        bank1.openAccount(customer2, 500.0);
        
        bank2.openAccount(customer3, 2000.0);
        bank2.openAccount(customer1, 1500.0);  
        customer1.viewBalance();
        customer2.viewBalance();
        customer3.viewBalance();
        
        // Perform transactions
        customer1.deposit(200.0);
        customer1.viewBalance();
        
        // Display bank customers
        bank1.displayCustomers();
        bank2.displayCustomers();
    }
}
