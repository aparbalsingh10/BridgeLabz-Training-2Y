import java.util.*;
class StudentGrade1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students ");
        int n = sc.nextInt();
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        String[] grade = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Student " + (i + 1));
            System.out.print("Enter Physics marks: ");
            physics[i] = sc.nextInt();
            while (physics[i] < 0) {
                System.out.print("Invalid! Enter positive marks ");
                physics[i] = sc.nextInt();
            }
            System.out.print("Enter Chemistry marks ");
            chemistry[i] = sc.nextInt();
            while (chemistry[i] < 0) {
                System.out.print("Invalid! Enter positive marks ");
                chemistry[i] = sc.nextInt();
            }
            System.out.print("Enter Maths marks");
            maths[i] = sc.nextInt();
            while (maths[i] < 0) {
                System.out.print("Invalid! Enter positive marks ");
                maths[i] = sc.nextInt();
            }
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 75) grade[i] = "B";
            else if (percentage[i] >= 50) grade[i] = "C";
            else grade[i] = "F";
        }
        System.out.println("\n--- Student Report ---");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t\t%s\n",
                    (i + 1), physics[i], chemistry[i], maths[i], percentage[i], grade[i]);
        }
    }
}
