class SumUtil {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for(Number n : list) sum += n.doubleValue();
        return sum;
    }
}

public class TestSum {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3);
        List<Double> dblList = Arrays.asList(1.5,2.5);

        System.out.println(SumUtil.sumNumbers(intList));
        System.out.println(SumUtil.sumNumbers(dblList));
    }
}
