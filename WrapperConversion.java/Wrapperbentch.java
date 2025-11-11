import java.util.*;

public class Wrapperbentch {
    public static void main(String[] args) {

        int n = 1_000_000;
        long t1 = System.currentTimeMillis();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i;
        long sum1 = 0;
        for (int x : arr) sum1 += x;
        long t2 = System.currentTimeMillis();
        System.out.println("int[] time = " + (t2 - t1) + "ms");
        long t3 = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(i);
        long sum2 = 0;
        for (int x : list) sum2 += x;
        long t4 = System.currentTimeMillis();
        System.out.println("ArrayList<Integer> time = " + (t4 - t3) + "ms");
    }
}
