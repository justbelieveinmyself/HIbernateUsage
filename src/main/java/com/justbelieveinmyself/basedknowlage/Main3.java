package com.justbelieveinmyself.basedknowlage;

import com.justbelieveinmyself.HibernateUtil;
import com.justbelieveinmyself.basedknowlage.entity.Employee;
import com.justbelieveinmyself.basedknowlage.entity.EmployeeName;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main3 {
    public static void main(String[] args) {
        EmployeeName eName = EmployeeName.builder().fName("Vadim").mName("Alexsandrovich").sName("Karpenko").build();
        Employee employee = Employee.builder().eName(eName).age(19).salary(167809.1).build();
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(employee);
        session.getTransaction().commit();
    }
}
