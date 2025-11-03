import java.util.*;
public class Problem1 {
    static Random rand = new Random();
    
    public static int generateGuess(int low, int high) {
        return rand.nextInt(high - low + 1) + low;
    }
    public static String getFeedback(Scanner sc) {
        System.out.print("Enter feedback (high/low/correct): ");
        return sc.next().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int low = 1, high = 100;
        String feedback = "";
        System.out.println("Think of a number between 1 and 100!");

        while (!feedback.equals("correct")) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);

            feedback = getFeedback(sc);

            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (!feedback.equals("correct")) {
                System.out.println("Invalid feedback! Use: high/low/correct");
            }
        }
        System.out.println("Computer guessed correctly!");
        sc.close();
    }
}
