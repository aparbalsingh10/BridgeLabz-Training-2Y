import java.util.*;
class InvalidRating extends Exception {
    public InvalidRatingException(String msg) {
        super(msg);
    }
}

class EmptyReviewException extends Exception {
    public EmptyReviewException(String msg) {
        super(msg);
    }
}

public class ProductReview {

    public static void submitReview(int rating, String comment)
            throws InvalidRatingException, EmptyReviewException {

        if (rating < 1 || rating > 5)
            throw new InvalidRatingException("Rating must be 1 to 5!");

        if (comment == null || comment.trim().isEmpty())
            throw new EmptyReviewException("Review cannot be empty!");

        System.out.println("Review submitted!");
    }

    public static void main(String[] args) {
        try {
            submitReview(6, "Nice!");
        } catch (InvalidRatingException e) {
            System.out.println("Invalid Rating: " + e.getMessage());
        } catch (EmptyReviewException e) {
            System.out.println("Empty Comment: " + e.getMessage());
        }
    }
}
