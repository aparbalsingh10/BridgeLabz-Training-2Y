abstract class JobRole { }
class SoftwareEngineer extends JobRole { }
class DataScientist extends JobRole { }
class ProductManager extends JobRole { }

class Resume<T extends JobRole> {
    T role;
    public Resume(T role) { this.role = role; }
}

class ScreeningUtil {
    public static void processRoles(List<? extends JobRole> roles) {
        for (JobRole r : roles)
            System.out.println("Processing: " + r.getClass().getSimpleName());
    }
}

public class TestResumeScreening {
    public static void main(String[] args) {
        List<DataScientist> ds = Arrays.asList(new DataScientist());
        ScreeningUtil.processRoles(ds);
    }
}
