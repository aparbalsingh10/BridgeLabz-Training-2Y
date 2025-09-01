import java.util.*;
class BMICalculate20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons ");
        int n = sc.nextInt();
        double[][] personData = new double[n][3]; 
        String[] weightStatus = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Person " + (i + 1) + " ---");
            double height;
            do {
                System.out.print("Enter height (m): ");
                height = sc.nextDouble();
                if (height <= 0) System.out.println("Height must be positive. Try again.");
            } while (height <= 0);
            double weight;
            do {
                System.out.print("Enter weight (kg): ");
                weight = sc.nextDouble();
                if (weight <= 0) System.out.println("Weight must be positive. Try again.");
            } while (weight <= 0);
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = weight / (height * height); 
            if (personData[i][2] < 18.5) weightStatus[i] = "Underweight";
            else if (personData[i][2] < 25) weightStatus[i] = "Normal";
            else if (personData[i][2] < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }
        System.out.println("\n--- BMI Report ---");
        System.out.println("Person\tHeight(m)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}
