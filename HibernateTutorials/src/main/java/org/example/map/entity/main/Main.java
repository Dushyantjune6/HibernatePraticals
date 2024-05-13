package org.example.map.entity.main;

import org.example.entity.Student;
import org.example.map.entity.Answer;
import org.example.map.entity.Question;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

//        Answer answer = new Answer();
//        answer.setAnswer("Dushyant Malviya!");
//        answer.setId(1);
//
//        Question question = new Question();
//        question.setQuestion("What is your name");
//        question.setId(2);
//
//        session.save(question);
//        session.save(answer);
//        tx.commit();

        Question question1 = (Question) session.get(Question.class, 1);

        System.out.println("Newly created question object:\n" + question1.getQuestion() + question1.getId() + question1.getAnswer());
        factory.close();


    }
}
