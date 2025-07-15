import model.*;
import service.UniversityService;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("IT24102580","Ahamed","Ahamed@gmail.com");
        Student student2 = new Student("IT23101380","Marshad","Marshad@gmail.com");

        Professor p1 = new Professor("P1","Mahima","Mahima@my.sliit.lk");
        Professor p2 = new Professor("P2","Thilina jayalath","Thilina@my.sliit.lk");

        Course c1 = new Course("SE1020","Software engineering",p2);
        Course c2 = new Course("IT4020","Discrete maths",p1);

        University university = new University();

        UniversityService us = new UniversityService(university);
        us.addStudent(student1);
        us.addStudent(student2);

        us.addCourse(c1);
        us.addCourse(c2);

        us.addProfessor(p1);
        us.addProfessor(p2);

        us.enrollStudentToCourse(student1,c1);
        us.enrollStudentToCourse(student2,c2);

        us.assignProfessorToCourse(p1,c1);
        us.assignProfessorToCourse(p2,c2);

        us.printReport();

    }
}
