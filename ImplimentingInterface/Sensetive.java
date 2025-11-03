interface Sensetive {}

class BankDetails implements Sensitive {
    String accNo;
    public BankDetails(String accNo) { this.accNo = accNo; }
}

public class MarkerDemo {
    public static void main(String[] args) {
        BankDetails b = new BankDetails("12345");
        if (b instanceof Sensitive) {
            System.out.println("Encrypt this data");
        }
    }
}
