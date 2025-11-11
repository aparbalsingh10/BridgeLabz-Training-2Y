import java.util.*;

class InvalidSeat extends Exception {
    public InvalidSeatException(String msg) {
        super(msg);
    }
}

class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String msg) {
        super(msg);
    }
}

public class MovieTicketBooking {

    static Map<Integer, Boolean> seats = new HashMap<>();

    static {
        for (int i = 1; i <= 10; i++)
            seats.put(i, false);
    }

    public static void bookSeat(int seatNo)
            throws InvalidSeatException, SeatAlreadyBookedException {

        if (!seats.containsKey(seatNo))
            throw new InvalidSeatException("Seat does not exist!");

        if (seats.get(seatNo))
            throw new SeatAlreadyBookedException("Seat already booked!");

        seats.put(seatNo, true);
        System.out.println("Seat booked successfully!");
    }

    public static void main(String[] args) {
        try {
            bookSeat(5);
            bookSeat(5);  // second time
        } catch (InvalidSeatException | SeatAlreadyBookedException e) {
            System.out.println("Booking failed: " + e.getMessage());
        }
    }
}
