package service;

import model.Course;
import model.Register;

import java.util.ArrayList;

public class RegisterService {
    private Register reg;

    public RegisterService(Register reg) {
        this.reg = reg;
    }

    public void register(Course course) {
       reg.register(course);
    }
}
