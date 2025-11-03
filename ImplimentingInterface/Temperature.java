import java.util.function.Predicate;

public class Temperature {
    public static void main(String[] args) {
        Predicate<Double> highTemp = t -> t > 40.0;

        double temp = 42.5;
        if (highTemp.test(temp))
            System.out.println("Alert! High Temperature!");
        else
            System.out.println("Temperature Normal");
    }
}
