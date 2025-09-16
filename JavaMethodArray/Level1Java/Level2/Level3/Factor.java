import java.util.*;
class Factor{
    public static int[] findFactor(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factor[index++] = i;
            }
        }
        return factor;
    }
    public static int greatestFactor(int[] factor) {
        int max = factor[0];
        for (int f : factor) {
            if (f > max) max = f;
        }
        return max;
    }
    public static int sumOfFactors(int[] factor) {
        int sum = 0;
        for (int f : factor) sum += f;
        return sum;
    }
    public static long productOfFactors(int[] factor) {
        long product = 1;
        for (int f : factor) product *= f;
        return product;
    }
    public static long productOfCubes(int[] factor) {
        long product = 1;
        for (int f : factor) {
            product *= Math.pow(f, 3);
        }
        return product;
    }
}

public class Factor {
    public static void main(String[] args) {
        int number = 12;  

        int[] factor = Factor.findFactors(number);
        System.out.println("Number " + number);
        System.out.println("Factors" + Arrays.toString(factor));

        System.out.println("Greatest Factor" + Factor.greatestFactor(factor));
        System.out.println("Sum of Factors" + Factor.sumOfFactors(factor));
        System.out.println("Product of Factor " + Factor.productOfFactors(factor));
        System.out.println("Product of Cubes of Factor " + Factor.productOfCubes(factor));
    }
}



