package model;

import java.util.ArrayList;

public class Student extends Person implements PrintDetails,Register {
    private final ArrayList<Course> registeredCourses;
    public Student(String id, String name, String email) {
        super(id, name, email);
        this.registeredCourses = new ArrayList<>();
    }

    @Override
    public void register(Course course) {
        registeredCourses.add(course);
    }

    @Override
    public void printDetails() {
        System.out.println("ID : " + getId());
        System.out.println("Name : " + getName());
        System.out.println("Email : " + getEmail());
        System.out.println("Registered courses : ");
        for (Course course : registeredCourses) {
            System.out.println("Course title : " + course.getTitle());
        }
    }
}
