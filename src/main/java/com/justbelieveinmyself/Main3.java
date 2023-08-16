package com.justbelieveinmyself;

import com.justbelieveinmyself.entity.Employee;
import com.justbelieveinmyself.entity.EmployeeName;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main3 {
    public static void main(String[] args) {
        EmployeeName eName = EmployeeName.builder().fName("Dmitry").mName("Ilyich").sName("Pushkin").build();
        Employee employee = Employee.builder().eName(eName).age(15).salary(16789.1).build();
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(employee);
        session.getTransaction().commit();
    }
}
