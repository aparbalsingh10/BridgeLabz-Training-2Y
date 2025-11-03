// import java.util.*;
class Employeedetail {
    String name;
    int id;
    double salary;

    Employeedetail(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employeedetail("Aparbal", 101, 45000.50);
        e1.displayDetails();
    }
}
