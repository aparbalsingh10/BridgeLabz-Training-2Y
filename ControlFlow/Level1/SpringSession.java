import java.util.*;
class SpringSession {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            System.out.println("It's a Spring Session");
        } else {
            System.out.println("Not a Spring Session");
        }
    }
}