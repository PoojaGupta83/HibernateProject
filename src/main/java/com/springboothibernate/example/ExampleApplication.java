package com.springboothibernate.example;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

public class ExampleApplication {

    public static void main(String[] args) throws IOException {
        System.out.println("project started");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory.toString());
        System.out.println(factory.isClosed());
        //creating object of student class
        Student st = new Student();
        st.setName("Smith");
        st.setCity("Delhi");

        //Creating object of Address class
        Address ad=new Address();
        ad.setStreet("STREET1");
        ad.setCity("DELHI");
        ad.isOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(23.877);

        //Reading image
//           FileInputStream stream = new FileInputStream("/src/main/resources/gurgaon.png");
//       byte[] data=new byte[stream.available()];
//           stream.read(data);
//       ad.setImage(data);


        Session session = factory.openSession();
		Transaction tx=session.beginTransaction();
        session.save(st);
session.save(ad);
		tx.commit();
        session.close();
    }

}
