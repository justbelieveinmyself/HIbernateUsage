package com.justbelieveinmyself.basedknowlage;

import com.justbelieveinmyself.HibernateUtil;
import com.justbelieveinmyself.basedknowlage.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class Main2{
    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        System.out.println("+---UPDATE USER---+");
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        // 1 way
        session.createQuery("update User set name='updated' where id=3").executeUpdate();
        // 2 way
//        User user = session.get(User.class, 1);
//        user.setPassword("updatedpass");

        session.getTransaction().commit();
        List<User> userList = new UserHelper().getUserList();
        System.out.println(userList);
        System.out.println("-------------------------------------------");
        System.out.println("+---DELETE USER---+");
        session.beginTransaction();

        // 1 way
//        session.createQuery("Delete User where id = 4").executeUpdate();
        // 2 way
        User user = session.get(User.class, 2); //not necessary take it before from delete. just need instance
        session.remove(user);
        session.getTransaction().commit();

        userList = new UserHelper().getUserList();
        System.out.println(userList);

    }
}
