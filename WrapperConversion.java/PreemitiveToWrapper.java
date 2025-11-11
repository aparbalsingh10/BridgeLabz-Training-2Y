import java.util.*;
public class PreemitiveToWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int num = sc.nextInt();

        Integer obj = Integer.valueOf(num);

        System.out.println("Primitive = " + num);
        System.out.println("Wrapper = " + obj);
    }
}
