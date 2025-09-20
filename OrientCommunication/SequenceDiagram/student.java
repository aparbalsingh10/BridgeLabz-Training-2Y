class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        System.out.println(name + " is enrolling in " + course.getCourseName());
        course.addStudent(this);
    }
}

class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
    public void addStudent(Student student) {
        System.out.println(student.getName() + " has been added to " + courseName);
    }
}
public class Rule1Demo {
    public static void main(String[] args) {
        Student student1 = new Student("Aman");
        Course mathCourse = new Course("Mathematics");

        student1.enrollInCourse(mathCourse);
    }
}
