package uni_service;

import model.Course;
import model.Professor;
import model.Student;
import model.Teach;

public interface Add {
    void addStudent(Student s);
    void addProfessor(Professor p);
    void addCourse(Course c);

}
