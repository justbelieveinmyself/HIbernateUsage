package com.justbelieveinmyself.onetomany;

import com.justbelieveinmyself.HibernateUtil;
import com.justbelieveinmyself.onetomany.entity.Laptop2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Laptop2> laptop = session.createQuery("from Laptop2 where id = 1").setCacheable(true).getResultList();
        for (Laptop2 l : laptop) {
            System.out.println("id= " + l.getLid() + " name= " + l.getName());
        }

        // TEST CACHE FOR HQL
        Session session2 = sessionFactory.openSession();
        List<Laptop2> laptop2 = session2.createQuery("from Laptop2 where id = 1").setCacheable(true).getResultList();
        for (Laptop2 l : laptop2) {
            System.out.println("id= " + l.getLid() + " name= " + l.getName());
        }

    }
}
