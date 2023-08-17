package com.justbelieveinmyself.manytomany;

import com.justbelieveinmyself.HibernateUtil;
import com.justbelieveinmyself.manytomany.entity.Laptop3;
import com.justbelieveinmyself.manytomany.entity.Student3;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student3 alex = Student3.builder().mark(4).name("Alex").build();
        Student3 vadim = Student3.builder().mark(5).name("Vadim").build();
        Laptop3 asus = Laptop3.builder().student3(List.of(alex, vadim)).name("Asus").build();
        alex.getLaptop3().add(asus);
        vadim.getLaptop3().add(asus);

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(alex);
        session.persist(vadim);
        session.persist(asus);
        session.getTransaction().commit();

    }
}
