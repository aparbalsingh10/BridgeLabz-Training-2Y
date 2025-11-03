import java.util.*;
interface PaymentProcessor {
    void process();

    default void refund(double amount) {
        System.out.println("Default Refund: ₹" + amount);
    }
}
class PayTM implements PaymentProcessor {
    public void process() {
        System.out.println("PayTM processing...");
    }
}
public class PaymentGatewayDemo {
    public static void main(String[] args) {
        PaymentProcessor p = new PayTM();
        p.process();
        p.refund(500);
    }
}
