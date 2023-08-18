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

        //ADD STUDENTS, LAPTOPS to tables
//        Student2 arsen = Student2.builder().mark(2).name("Arsen").build();
//        Laptop2 macbook = Laptop2.builder().student2(arsen).name("Macbook").build();
//        Laptop2 asus = Laptop2.builder().student2(arsen).name("Asus").build();
//        List<Laptop2> laptop2 = arsen.getLaptop2();
//        laptop2.add(macbook);
//        laptop2.add(asus);
        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//
//        session.persist(arsen);
//        session.persist(asus);
//        session.persist(macbook);
//
//        session.getTransaction().commit();

        //TEST FOR FETCH MODES (EAGER, EASY)

        Student2 student2 = session.get(Student2.class, 1);
        System.out.println(student2.getName());
        List<Laptop2> laptop2 = student2.getLaptop2();
        for (Laptop2 l : laptop2) {
            System.out.println(l.getLid());
            System.out.println(l.getName());
        }


        //TEST FOR CACHING
        //First level caching
//        Student2 student = session.get(Student2.class, 1);
//        System.out.println(student.getName());
//        List<Laptop2> laptop = student.getLaptop2();
//        for (Laptop2 l : laptop) {
//            System.out.println(l.getLid());
//            System.out.println(l.getName());
//        }

        //Second level caching (look into classes @Cacheable, Cache(
        System.out.println("+---SESSION 2---+");
        Session session2 = sessionFactory.openSession();
        Student2 theSameStudent2 = session2.get(Student2.class, 1);
        System.out.println(theSameStudent2.getName());

//
//        List<Laptop2> theSameLaptop2 = theSameStudent2.getLaptop2();
//        for (Laptop2 l : theSameLaptop2) {
//            System.out.println(l.getLid());
//            System.out.println(l.getName());
//        }
    }
}
