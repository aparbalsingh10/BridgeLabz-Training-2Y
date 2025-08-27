import java.util.*;
class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt(); 
        int y = sc.nextInt(); 
        if (m == 1) {
            m = 13;
            y--;
        } else if (m == 2) {
            m = 14;
            y--;
        }
        int K = y % 100;
        int J = y / 100; 
        int h = (d + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) + (5 * J)) % 7;
        int dayOfWeek = (h + 6) % 7;
        System.out.println(dayOfWeek);
    }
}
