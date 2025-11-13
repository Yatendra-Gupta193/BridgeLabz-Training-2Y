import java.util.Scanner;
// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}
class ATM {
    int balance = 10000; 
  
    void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal Failed: Insufficient Balance.");
        }
        balance -= amount;
        System.out.println("Withdrawal Successful! Remaining Balance: ₹" + balance);
    }
}
public class ATMProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        System.out.print("Enter amount to withdraw: ");
        int amt = sc.nextInt();

        try {
            atm.withdraw(amt);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
