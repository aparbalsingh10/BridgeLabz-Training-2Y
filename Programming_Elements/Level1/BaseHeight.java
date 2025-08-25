import java.util.*;

class BaseHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double baseCm = sc.nextDouble();
        double heightCm = sc.nextDouble();
        double areaCm2 = 0.5 * baseCm * heightCm;
        double areaIn2 = areaCm2 / (2.54 * 2.54);
        System.out.println( areaCm2 );
        System.out.println( areaIn2 );
    }
}