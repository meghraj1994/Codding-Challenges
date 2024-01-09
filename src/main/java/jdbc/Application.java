package jdbc;

import jdbc.dao.StudentDao;
import jdbc.entity.Student;

public class Application {

    public static void main(String[] args) {

        StudentDao studentDao = new StudentDao();

        Student student = new Student("Meghraj", "7619437296", "Irving");
        Student student1 = new Student("Sukanya", "7619437297", "Chikkamagaluru");
        Student student2 = new Student("Anwesha", "761943729", "Hyderabad");

        //save student
//        System.out.println(studentDao.saveStudent(student));
//        System.out.println(studentDao.saveStudent(student1));
//        System.out.println(studentDao.saveStudent(student2));

        //delete student
//        System.out.println(studentDao.deteleStudent(1));

        //display name
        studentDao.displayStudent();


    }
}
