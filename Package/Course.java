package com.university.department.cse;

public class Course {
    private String courseName;
    private int duration;   // in months

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void display() {
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " months");
    }
}


// /// main java
import com.university.department.cse.Course;

public class MainApp {
    public static void main(String[] args) {
        Course c = new Course("B.Tech CSE", 48);
        c.display();
    }
}