class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String m){ super(m); }
}
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String m){ super(m); }
}
public class BankManager {

    static void verifyAccount(String acc) throws AccountNotFoundException {
        if(!acc.equals("12345"))
            throw new AccountNotFoundException("Account not found!");
    }
    static void processTransaction(int bal) throws InsufficientFundsException {
        if(bal < 1000)
            throw new InsufficientFundsException("Not enough balance!");
    }
    static void executeTransaction() throws Exception {
        verifyAccount("11111");
        processTransaction(500);
    }
    public static void main(String[] args) {
        try {
            executeTransaction();
        }
        catch(AccountNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Unknown error");
        }
        finally {
            System.out.println("Transaction complete.");
        }
    }
}
