import java.util.*;

class FriendsState {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3]; 
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " (e.g., in cm): ");
            heights[i] = sc.nextDouble();
        }
        int minAge = ages[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) minAge = ages[i];
        }
        List<String> youngest = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (ages[i] == minAge) youngest.add(names[i]);
        }
        double maxHeight = heights[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) maxHeight = heights[i];
        }
        List<String> tallest = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (heights[i] == maxHeight) tallest.add(names[i]);
        }
        System.out.println("Youngest friend(s) " + String.join(", ", youngest) + " with age " + minAge);
        System.out.println("Tallest friend(s) " + String.join(", ", tallest) + " with height " + maxHeight);
    }
}
