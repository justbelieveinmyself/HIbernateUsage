package com.justbelieveinmyself;


import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
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