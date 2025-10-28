interface SensitiveData {} 

class BankAccount implements SensitiveData {
    String accNo = "123456";
}
public class SensitiveDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        if (acc instanceof SensitiveData)
            System.out.println("This data needs encryption!");
        else
            System.out.println("Normal data.");
    }
}
