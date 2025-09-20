import java.util.*;
class Coursee {
    private String courseName;
    private Professor professor;
    private List<Student> students = new ArrayList<>();

    public Coursee(String courseName) {
        this.courseName = courseName;
    }

    public void assignProfessor(Professor p) {
        this.professor = p;
        p.addCourse(this);
    }

    public void enrollStudent(Student s) {
        students.add(s);
    }
    public void showCoursee() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Taught by: " + professor.getName());
        }
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}
class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void enrollCoursee(Course c) {
        courses.add(c);
        c.enrollStudent(this);
        System.out.println(name + " enrolled in " + c.getCourseName());
    }

    public void showCourses() {
        System.out.println("Student: " + name + " enrolled courses:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}
class Professor {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void showCourses() {
        System.out.println("Professor: " + name + " teaches:");
        for (Course c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}
public class UniversityDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Riya");
        Student s2 = new Student("Aman");

        Professor p1 = new Professor("Dr. Sharma");

        Course c1 = new Coursee("Mathematics");
        Course c2 = new Coursee("Computer Science");
        c1.assignProfessor(p1);
        c2.assignProfessor(p1);
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s2.enrollCourse(c2);
        c1.showCourse();
        c2.showCourse();
        s1.showCourses();
        s2.showCourses();
        p1.showCourses();
    }
}
