import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtil {
    static String format(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}

class DateUtil {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(DateUtil.format(d, "dd/MM/yyyy"));
    }
}
