package service;

import model.Enroll;
import model.Student;

import java.util.ArrayList;

public class EnrollService {
    private Enroll enroll;

    public EnrollService(Enroll enroll) {
        this.enroll = enroll;
    }

    public void enrollStudent(Student student) {
        enroll.enrollStudent(student);
    }
}
