import java.util.Random;
// Custom Exceptions
class NegativeAmountException extends Exception { 
    public NegativeAmountException(String m){ super(m);} 
}
class InsufficientFundsException extends Exception { 
    public InsufficientFundsException(String m){ super(m);} 
}
class NetworkFailureException extends Exception { 
    public NetworkFailureException(String m){ super(m);} 
}
class Transaction {
    int balance = 5000;
    Random r = new Random();
    void process(int amount) throws NegativeAmountException,
                                   InsufficientFundsException,
                                   NetworkFailureException {

        int event = r.nextInt(3);  

        if (event == 0)
            throw new NegativeAmountException("Negative amount not allowed!");

        else if (event == 1 && amount > balance)
            throw new InsufficientFundsException("Not enough balance!");

        else if (event == 2)
            throw new NetworkFailureException("Network issue occurred!");
      
        balance -= amount;
        System.out.println("Transaction successful. New Balance: " + balance);
    }
}
public class BankingTransactionShort {
    public static void main(String[] args) {
        Transaction t = new Transaction();

        try {
            t.process(3000);
        }
        catch (NegativeAmountException | 
               InsufficientFundsException | 
               NetworkFailureException e) {

            System.out.println("Transaction Failed: " + e.getMessage());
        }
    }
}
