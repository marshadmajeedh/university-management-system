package uni_service;

import model.Course;
import model.Professor;
import model.Student;

public class UniversityService {
    private Add add;

    public UniversityService(Add add) {
        this.add = add;
    }

    public void addStudent(Student s) {
        add.addStudent(s);
    }
    public void addProfessor(Professor p) {
        add.addProfessor(p);
    }
    public void addCourse(Course c) {
        add.addCourse(c);
    }
}
