import java.util.*;

public class SensorLogger {

    static ArrayList<Double> data = new ArrayList<>();

    public static void log(double d) {  
        data.add(d);  
    }

    public static void log(Double d) {  
        data.add(d);
    }

    public static void main(String[] args) {

        log(25.5);
        log(Double.valueOf(28.9));

        for (Double d : data) {
            double v = d; 
            System.out.println(v);
        }
    }
}
