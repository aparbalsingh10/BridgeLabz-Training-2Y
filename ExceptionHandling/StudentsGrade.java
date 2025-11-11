import java.util.*;
public class StudentsGrade {
    public static void main(String[] args) {
        String[] grades = {"90", "A+", "85", "70", "B", "100"};

        for (String g : grades) {
            try {
                int num = Integer.parseInt(g);   // Try converting
                System.out.println("Valid grade: " + num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade input: " + g);
            }
        }
    }
}
