import java.util.*;

class InvalidStudent extends Exception {
    public InvalidStudentException(String msg) {
        super(msg);
    }
}

public class OnlineExam {

    public static void validateStudent(boolean isValid) throws InvalidStudentException {
        if (!isValid)
            throw new InvalidStudentException("Student is invalid!");
    }

    public static void submitExam(boolean isValid)
            throws InvalidStudentException, IOException {

        validateStudent(isValid);

        throw new IOException("Error while submitting exam!");
    }

    public static void main(String[] args) {
        try {
            submitExam(false);
        } catch (InvalidStudentException e) {
            System.out.println("Student error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
        } finally {
            System.out.println("Exam submission process completed.");
        }
    }
}
