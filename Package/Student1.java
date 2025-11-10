package college.student;

public class Student1 {
    private String name;
    private int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
    }
}

////// main 
import college.student.Student;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student("Aparbal", 101);
        s.display();
    }
}

