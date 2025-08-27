import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int maths = sc.nextInt();
        int total = physics + chemistry + maths;
        double percentage = total / 3.0;
        System.out.println("Average Marks = " + percentage);
        if (percentage >= 90) {
            System.out.println("Grade: A+ |  Excellent");
        } else if (percentage >= 75) {
            System.out.println("Grade: A |  Very Good");
        } else if (percentage >= 60) {
            System.out.println("Grade: B |  Good");
        } else if (percentage >= 50) {
            System.out.println("Grade: C |  Pass");
        } else {
            System.out.println("Grade: F |  Fail");
        }
    }
}
