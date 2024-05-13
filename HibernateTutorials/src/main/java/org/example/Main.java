package org.example;
import jakarta.transaction.*;
import org.example.entity.Address;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.Transaction;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws HeuristicRollbackException, SystemException, HeuristicMixedException, RollbackException {


       Configuration cfg = new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory = cfg.buildSessionFactory();

//        Student student = new Student();
//        student.setCity("Sohagpur");
//        student.setId(1L);
//        student.setFirstName("Dushyant");
//        student.setLastName("Malviya");

        Address address = new Address();
        address.setCity("Sohagpur");
        address.setStreet("Raghuwanshipura");
        address.setOpen(true);
        address.setDateAdded(new Date());
        address.setX(11);

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(address);
        tx.commit();
        session.close();



    }
}