package com.springboothibernate.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;

public class FetchDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("project started");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        //we fetch data via 2 methods get and load
        //fetch student data
        Student st2=(Student) session.get(Student.class, 1);
        System.out.println(st2);
        Student st3=(Student)session.load(Student.class,1);
        System.out.println(st3);

        //fetch address data
        Address ad1=(Address) session.get(Address.class,1);
        System.out.println(ad1);
        session.get(Address.class,2);
Address ad2=session.get(Address.class,2);
        System.out.println(ad2.getStreet()+""+ ad1.getCity());
    }
}
