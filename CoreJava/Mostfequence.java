import java.util.*;
public class Mostfrequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string ");
        String str = sc.nextLine();

        int[] freq = new int[256];
        for (char c : str.toCharArray()) {
            freq[c]++;
        }
        int max = -1;
        char result = ' ';
        for (char c : str.toCharArray()) {
            if (freq[c] > max) {
                max = freq[c];
                result = c;
            }
        }

        System.out.println("Most Frequent Character " + result);
    }
}
