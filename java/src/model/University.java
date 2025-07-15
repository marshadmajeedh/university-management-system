package model;
import uni_service.UniversityAddAndPrint;

import java.util.ArrayList;

public class University implements UniversityAddAndPrint {
    ArrayList<Student> students;
    ArrayList<Professor> professors;
    ArrayList<Course> courses;

    public University() {
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    @Override
    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public void printReport() {
        System.out.println ("Student details :");
        for (Student student : students) {
            student.printDetails();
            System.out.println();
        }
        System.out.println ();
        System.out.println ("Professor details :");
        for (Professor professor : professors) {
            professor.printDetails();
            System.out.println();
        }
        System.out.println ();

        System.out.println ("Course details :");
        for (Course course : courses) {
            course.printDetails();
            System.out.println();
        }

    }

}