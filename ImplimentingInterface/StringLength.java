import java.util.function.Function;

public class StringLength {
    public static void main(String[] args) {
        Function<String, Integer> lengthFn = s -> s.length();

        String msg = "Hello World!";
        System.out.println("Length = " + lengthFn.apply(msg));
    }
}
