package com.justbelieveinmyself.onetoone;

import com.justbelieveinmyself.HibernateUtil;
import com.justbelieveinmyself.onetoone.entity.Laptop;
import com.justbelieveinmyself.onetoone.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {
        Student vadim = Student.builder().mark(4).name("Dmitry").build();
        Laptop acer = Laptop.builder().student(vadim).name("Lenovo").build();
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(vadim);
        session.persist(acer);
        session.getTransaction().commit();
    }
}
