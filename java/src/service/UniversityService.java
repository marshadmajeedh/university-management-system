package service;

import model.Course;
import model.Professor;
import model.Student;
import uni_service.UniversityAddAndPrint;

public class UniversityService {
    private final UniversityAddAndPrint university;

    public UniversityService(UniversityAddAndPrint university) {
        this.university = university;
    }

    public void addStudent(Student s) {

        university.addStudent(s);
    }
    public void addProfessor(Professor p)
    {
        university.addProfessor(p);
    }
    public void addCourse(Course c) {

        university.addCourse(c);
    }

    public void enrollStudentToCourse(Student s, Course c){
        s.register(c);
        c.enrollStudent(s);
    }

    public void assignProfessorToCourse(Professor p, Course c){
        p.teachCourse(c);
    }



    public void printReport() {
        university.printReport();
    }

}
