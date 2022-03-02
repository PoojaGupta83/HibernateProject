package com.springboothibernate.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Student student1 = new Student();
        student1.setName("Ankit Tiwari");
        student1.setCity("DELHI");
        Certificate c1 = new Certificate();
        c1.setCourse("Android");
        c1.setDuration("2 months");
        student1.setCerti(c1);
        Student student2 = new Student();
        student2.setName("Ravi Tiwari");
        student2.setCity("DELHI");
        Certificate c2 = new Certificate();
        c2.setCourse("Kotlin");
        c2.setDuration(" 1.5months");
        student2.setCerti(c2);
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(student1);
        session.save(student2);
        tx.commit();
        session.close();
        factory.close();
    }
}
