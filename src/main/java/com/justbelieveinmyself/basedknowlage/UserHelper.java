package com.justbelieveinmyself.basedknowlage;

import com.justbelieveinmyself.HibernateUtil;
import com.justbelieveinmyself.basedknowlage.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class UserHelper {
    private SessionFactory sessionFactory;
    public UserHelper(){
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }
    public List<User> getUserList(){
        Session session = sessionFactory.openSession();
//        CriteriaBuilder cb = session.getCriteriaBuilder();
//        CriteriaQuery cq = cb.createQuery();
//        Root<User> root = cq.from(User.class);
////        cq.select(root); //необязательный когда нужно получить все значения
//        Query query = session.createQuery(cq);
//        List<User> userList = query.getResultList();
        List<User> userList = session.createQuery("from User").getResultList();
        session.close();
        return userList;
    }
    public User getUserById(int id){
        Session session = sessionFactory.openSession();
        return session.get(User.class, id);
    }
    public List<User> getUsersByName(String name){
        Session session = sessionFactory.openSession();
        List<User> userList = session.createQuery("from User where name='" + name + "'").getResultList(); //we can use and/or
        return userList;
    }

    public void saveUser(User user){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(user);
        session.getTransaction().commit();
        session.close();
    }
}
