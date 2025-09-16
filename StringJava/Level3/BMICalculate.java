import java.util.*;

public class BMICalculate {
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0; 

        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";

        return new String[]{String.valueOf(weight), String.valueOf(heightCm), String.valueOf(bmi), status};
    }
    public static String[][] processBMI(double[][] data) {
        int n = data.length;
        String[][] result = new String[n][4];

        for (int i = 0; i < n; i++) {
            result[i] = calculateBMI(data[i][0], data[i][1]);
        }
        return result;
    }
    public static void displayTable(String[][] result) {
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-8s %-10s %-10s %-10s %-15s\n", "Person", "Weight", "Height", "BMI", "Status");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-8d %-10s %-10s %-10s %-15s\n", (i + 1), result[i][0], result[i][1], result[i][2], result[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " weight kg ");
            data[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " height cm ");
            data[i][1] = sc.nextDouble();
        }
        String[][] result = processBMI(data);
        displayTable(result);
    }
}
