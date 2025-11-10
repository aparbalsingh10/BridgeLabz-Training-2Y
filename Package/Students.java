package college.student;

public class Students {
    private String name;
    private int rollNo;

    public Students(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number : " + rollNo);
    }
}
