import java.util.*;
import java.util.stream.Collectors;
public class InvoiceCreation {
    static class Invoice {
        String transactionId;
        
        Invoice(String transactionId) {
            this.transactionId = transactionId;
        }      
        public String toString() {
            return "Invoice: " + transactionId;
        }
    }  
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("T100", "T101", "T102", "T103");
        
        List<Invoice> invoices = transactionIds.stream()
                                              .map(Invoice::new)
                                              .collect(Collectors.toList());
        
        invoices.forEach(System.out::println);
    }
}
