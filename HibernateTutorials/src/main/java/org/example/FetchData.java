package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.example.entity.Student;

public class FetchData {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").
                buildSessionFactory();

//        Student student = new Student();
//        student.setCity("Bhopal");
//        student.setId(2L);
//        student.setFirstName("Dushyant");
//        student.setLastName("Malviya");

        Session session = factory.openSession();
        Student s1 = (Student) session.get(Student.class, 1);

        System.out.println(s1);
        session.close();


    }
}
