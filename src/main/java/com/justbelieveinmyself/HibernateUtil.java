package com.justbelieveinmyself;


import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try{
                Configuration configuration = new Configuration();
                configuration.configure();
                sessionFactory = configuration.buildSessionFactory();


            }catch(HibernateException exception){
                System.out.println("Error: Can't build session factory!");
            }
        }
        return sessionFactory;
    }
}
