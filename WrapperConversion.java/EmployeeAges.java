import java.util.*;
public class EmployeeAges {
    public static void main(String[] args) {
        int[] ages = {21, 32, 28, 45};

        ArrayList<Integer> list = new ArrayList<>();

        for (int a : ages)
            list.add(a); 

        System.out.println("Youngest = " + Collections.min(list));
        System.out.println("Oldest   = " + Collections.max(list));
    }
}
