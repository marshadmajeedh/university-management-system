package model;

import java.util.ArrayList;

public class Course implements PrintDetails, Enroll {
    private String courseCode;
    private String title ;
    private Professor assignedProfessor;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseCode, String title, Professor assignedProfessor) {
        this.courseCode = courseCode;
        this.title = title;
        this.assignedProfessor = assignedProfessor;
        this.enrolledStudents = new ArrayList<>();
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAssignedProfessor(Professor assignedProfessor) {
        this.assignedProfessor = assignedProfessor;
    }

    public String getCourseCode() {
        return courseCode;
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
