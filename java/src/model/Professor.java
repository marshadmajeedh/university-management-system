package model;

import java.util.ArrayList;

public class Professor extends Person implements PrintDetails,Teach {

    private ArrayList<Course> assignedCourses;

    public Professor(String id, String name, String email) {
        super(id, name, email);
        this.assignedCourses = new ArrayList<>();
    }

    @Override
    public void teachCourse(Course course) {
        assignedCourses.add(course);
    }

    @Override
    public void printDetails() {
        System.out.println("ID : "+getId());
        System.out.println("Name : " + getName());
        System.out.println("Email : " + getEmail());
        System.out.println("Teaching courses : ");
        for (Course course : assignedCourses) {
            System.out.println("Course title : " + course.getTitle());
        }

    }
}
