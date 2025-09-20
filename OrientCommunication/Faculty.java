import java.util.*;
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void showFaculty() {
        System.out.println("Faculty: " + name);
    }
}

class Department {
    private String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public void showDepartment() {
        System.out.println("Department: " + deptName);
    }
}
class University {
    private String uniName;
    private List<Department> departments = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();

    public University(String uniName) {
        this.uniName = uniName;
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void addFaculty(Faculty f) {
        faculties.add(f);
    }

    public void showUniversity() {
        System.out.println("University: " + uniName);
        System.out.println("Departments:");
        for (Department d : departments) {
            d.showDepartment();
        }
        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.showFaculty();
        }
    }
}
public class Problem2Demo {
    public static void main(String[] args) {
        University uni = new University("Delhi University");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Physics");

        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Prof. Mehta");

        uni.addDepartment(d1);
        uni.addDepartment(d2);

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showUniversity();
        uni = null;
        System.gc(); 
    }
}
