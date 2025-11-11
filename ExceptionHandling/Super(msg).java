import java.util.*;
class OutOfStockException extends Exception {
    public OutOfStockException(String msg) {
        super(msg);
    }
}
class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) {
        super(msg);
    }
}
public class OnlineOrderProcessing {

    public static void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random r = new Random();
        int n = r.nextInt(3);

        switch (n) {
            case 0:
                throw new OutOfStockException("Product is out of stock!");
            case 1:
                throw new PaymentFailedException("Payment failed! Please retry.");
            default:
                System.out.println(" Order placed successfully!");
        }
    }

    public static void main(String[] args) {

        try {
            placeOrder();
        } catch (OutOfStockException e) {
            System.out.println(" Order Error: " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println(" Payment Error: " + e.getMessage());
        }
    }
}
