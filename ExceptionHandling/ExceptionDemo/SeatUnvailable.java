class SeatUnavailable extends Exception {
    public SeatUnavailableException(String msg) {
        super(msg);
    }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) {
        super(msg);
    }
}

public class FlightBooking {

    public static void checkSeatAvailability(boolean available) throws SeatUnavailableException {
        if (!available)
            throw new SeatUnavailableException("Seat unavailable!");
    }

    public static void processPayment(boolean paid) throws PaymentFailedException {
        if (!paid)
            throw new PaymentFailedException("Payment failed!");
    }

    public static void bookTicket(boolean available, boolean paid) throws Exception {
        checkSeatAvailability(available);
        processPayment(paid);
        System.out.println("Ticket Booked!");
    }

    public static void main(String[] args) {
        try {
            bookTicket(true, false);
        } catch (SeatUnavailableException e) {
            System.out.println(e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown: " + e.getMessage());
        } finally {
            System.out.println("Thank you for booking with us!");
        }
    }
}
