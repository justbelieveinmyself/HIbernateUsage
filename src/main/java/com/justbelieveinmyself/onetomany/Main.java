package com.justbelieveinmyself.onetomany;

import com.justbelieveinmyself.HibernateUtil;
import com.justbelieveinmyself.onetomany.entity.Laptop2;
import com.justbelieveinmyself.onetomany.entity.Student2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();


        Student2 arsen = Student2.builder().mark(2).name("Arsen").build();
        Laptop2 macbook = Laptop2.builder().student2(arsen).name("Macbook").build();
        Laptop2 asus = Laptop2.builder().student2(arsen).name("Asus").build();
        List<Laptop2> laptop2 = arsen.getLaptop2();
        laptop2.add(macbook);
        laptop2.add(asus);
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.persist(arsen);
        session.persist(asus);
        session.persist(macbook);

        session.getTransaction().commit();
    }
}
