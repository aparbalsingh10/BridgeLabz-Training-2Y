import java.util.*;
import java.util.function.Predicate;
class Alert {
    String message;
    String type;

    public Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
                new Alert("High fever!", "Emergency"),
                new Alert("Low BP", "Medium"),
                new Alert("Normal Checkup", "General")
        );
        Predicate<Alert> emergencyFilter = a -> a.type.equals("Emergency");

        System.out.println("Filtered Alerts:");
        alerts.stream()
        .filter(emergencyFilter)
        .forEach(a -> System.out.println(a.message + " - " + a.type));
    }
}
