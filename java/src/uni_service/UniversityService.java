package uni_service;

import model.Course;
import model.Professor;
import model.Student;
import model.University;

public class UniversityService {
    private final Add university;

    public UniversityService(Add university) {
        this.university = university;
    }

    public void addStudent(Student s) {
        university.addStudent(s);
    }
    public void addProfessor(Professor p) {
        university.addProfessor(p);
    }
    public void addCourse(Course c) {
        university.addCourse(c);
    }

    public void printReport() {
        if (university instanceof PrintReport) {
            ((PrintReport) university).printReport();
        }
    }

}
