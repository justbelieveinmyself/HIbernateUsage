package com.justbelieveinmyself.hql;

import com.justbelieveinmyself.HibernateUtil;
import com.justbelieveinmyself.hql.entity.Alien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
//        insertValues(session);
        List<Alien> aliens = session.createQuery("from Alien").getResultList();
//        List<Alien> aliens = session.createQuery("from Alien where id = 4").getResultList();
//        List<Alien> aliens = session.createQuery("from Alien where age > 300").getResultList();
//        List<Alien> aliens = session.createQuery("from Alien a where a.age > 300").getResultList();
//        printAliens(aliens);
        
//        Object[] objs = (Object[]) session.createQuery("select name, color, age from Alien where id = 4").uniqueResult();
//        printObjects(objs);

//        List<Object[]> objList = (List<Object[]>) session.createQuery("select color, age from Alien").getResultList();
//        List<Object> objList = (List<Object>) session.createQuery("select sum(age) from Alien where age < 300").getResultList();
//        printObjectList(objList);

//        int a = 300;
//        Object objList =  session.createQuery("select sum(age) from Alien where age < " + a).uniqueResult();
//        System.out.println(objList);

//        Object objList =  session.createQuery("select sum(age) from Alien where age < :a").setParameter("a", 300).uniqueResult();
//        System.out.println(objList);

        //select table, delete table, update table, insert table
    }


    private static void printAliens(List<Alien> aliens){
        for (Alien a : aliens) {
            System.out.println(a);
        }
    }
    public static void printObjects(Object[] objects){
        for (Object o : objects) {
            System.out.print(o.toString() + " ");
        }
        System.out.println();
    }
    public static void printObjects(List<Object[]> objects){
        for (Object[] object : objects) {
            printObjects(object);
        }
    }
    public static void printObjectList(List<Object> objects){
        for (Object o : objects) {
            System.out.println(o);
        }
    }


    public static void insertValues(Session session){
        Random random = new Random();
        session.beginTransaction();
        for (int i = 0; i < 50; i++) {
            Alien alien = Alien.builder().name("Alien#" + (i+1)).age(random.nextInt(1000)).color("Color" + random.nextInt(100, 1000)).build();
            session.persist(alien);
            if(i == 0) {
                alien.setColor("ha-ha its not color!");
            }
        }
        session.getTransaction().commit();
    }
}
