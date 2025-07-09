import model.*;
import service.EnrollService;
import service.RegisterService;
import service.TeachService;
import uni_service.UniversityService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Creating objects and assigning values
        Student student1 = new Student("IT24102580","Ahamed a.m.m","Marshadahamedh@gmail.com");
        Student student2 = new Student("IT24102380","Marshad ahamedh","IT24102580@my.sliit.lk");

        Professor p1 = new Professor("P1","Mahima weerasinghe","mahima@my.sliit.lk");
        Professor p2 = new Professor("P2","Thilini jayalth","jayalath@my.sliit.lk");

        Course c1 = new Course("SE1020","Software engineering",p2);
        Course c2 = new Course("IT2030","Discrete maths",p1);

        ArrayList<Register> registers = new ArrayList<>();
        registers.add(student1);
        registers.add(student2);

        ArrayList<Enroll> enrolls = new ArrayList<>();
        enrolls.add(c1);
        enrolls.add(c2);

        ArrayList<Teach> teaches = new ArrayList<>();
        teaches.add(p1);
        teaches.add(p2);

        //Register to course
        RegisterService rs1 = new RegisterService(registers.get(0));
        rs1.register(c1);

        RegisterService rs2 = new RegisterService(registers.get(1));
        rs2.register(c2);

        //Assign to course
        TeachService ts1 = new TeachService(teaches.get(0));
        ts1.teachCourse(c2);

        TeachService ts2 = new TeachService(teaches.get(1));
        ts2.teachCourse(c1);

        //Enroll student
        EnrollService es1  = new EnrollService(enrolls.get(0));
        es1.enrollStudent(student1);

        EnrollService es2 = new EnrollService(enrolls.get(1));
        es2.enrollStudent(student2);

        //University object
        University university = new University();

        UniversityService us1 = new UniversityService(university);
        us1.addStudent(student1);
        us1.addStudent(student2);

        us1.addCourse(c1);
        us1.addCourse(c2);

        us1.addProfessor(p1);
        us1.addProfessor(p2);

        university.printReport();

    }
}
