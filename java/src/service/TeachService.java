package service;

import model.Course;
import model.Teach;

import java.util.ArrayList;

public class TeachService {
    private Teach teach;

    public TeachService(Teach teach) {
        this.teach = teach;
    }
    public void teachCourse(Course course) {
        teach.teachCourse(course);
    }
}
