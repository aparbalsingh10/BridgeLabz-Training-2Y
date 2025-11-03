import java.util.*;
import java.util.function.Function;

class Invoice {
    String transactionId;

    public Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    public String toString() {
        return "Invoice for Transaction: " + transactionId;
    }
}

public class InvoiceCreator {
    public static void main(String[] args) {
        List<String> txn = Arrays.asList("TXN100", "TXN200", "TXN300");

        Function<String, Invoice> invoiceConstructor = Invoice::new;

        txn.stream()
                .map(invoiceConstructor)
                .forEach(System.out::println);
    }
}
