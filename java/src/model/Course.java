package model;

import java.util.ArrayList;

public class Course implements PrintDetails, Enroll {
    private final String courseCode;
    private final String title ;
    private final Professor assignedProfessor;
    private final ArrayList<Student> enrolledStudents;

    public Course(String courseCode, String title,Professor assignedProfessor) {
        this.courseCode = courseCode;
        this.title = title;
        this.assignedProfessor = assignedProfessor;
        this.enrolledStudents = new ArrayList<>();
    }
    public String getTitle() {
        return title;
    }

    public Professor getAssignedProfessor() {
        return assignedProfessor;
    }

    @Override
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    @Override
    public void printDetails() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Title: " + title);
        System.out.println("Assigned Professor: " + assignedProfessor.getName());
        System.out.println("Enrolled Students : ");
        for (Student student : enrolledStudents) {
            System.out.println("Student name : " + student.getName());
        }
    }
}
