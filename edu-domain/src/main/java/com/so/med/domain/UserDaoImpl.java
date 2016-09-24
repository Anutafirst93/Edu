/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.med.domain;

import com.so.med.domain.HibernateUtil;
import com.so.med.Users;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author Нюта
 */
public class UserDaoImpl implements UserDao{
     private final Session session; 
    public UserDaoImpl(){
        //создание и открытие сессии
        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public int addUser(Users u) {
        session.beginTransaction();
        int id = -1;
        try{
            id = (int)session.save(u);
            session.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        return id;
    }

    @Override
    public boolean updateUser(Users u) {        
        String query = "update users set login=:login, "
                + " firstname=:firstname, lastname=:lastname, "
                + "roles=:roles, email=:email where id=:id";
        int rows = 0;
        session.beginTransaction();
        try{
            Query q = session.createSQLQuery(query).setParameter("login", u.getLogin())
                    .setParameter("firstname", u.getFirstname())
                    .setParameter("lastname", u.getLastname())
                    .setParameter("roles", u.getRoles())
                    .setParameter("email", u.getEmail())
                    .setParameter("id", u.getId());
            System.out.println("update request");
            System.out.println(q.toString());
            rows= q.executeUpdate();
            session.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace();
            session.getTransaction().rollback();
        }
        return (rows > 0);
    }

    @Override
    public Users getUser(int id) {
        Users u = (Users)session.get(Users.class, id);
        return u;
    }

    /*@Override
    public boolean deleteUser(int id) {
        boolean resalt = true;
        session.beginTransaction();
        try{
            session.createSQLQuery("delete from users where id = :id").addEntity(Users.class).setParameter("id", id).executeUpdate();
            session.getTransaction().commit();
            resalt = true;
        }catch(Exception ex){
            resalt = false;
        }
        return resalt;
    }

    @Override
    public List<Users> userList() {
        List<Users> userlist;
        // select * from users
        userlist = session.createSQLQuery("select * from users").addEntity(Users.class).list();
        return userlist;
    }

    @Override
    public List<Users> getMentors(int start, int offset) {
        String query = "select * from users where roles = :role order by id asc limit :start, :offset";
        return session.createSQLQuery(query)
                .addEntity(Users.class)
                .setParameter("start", start)
                .setParameter("offset", offset)
                .setParameter("role", Users.Roles.MENTOR.name())
                .list();
    }

    @Override
    public int getUsersCount(String role) {
        String query = "select * from users where roles = :role";
        return session.createSQLQuery(query)
                .addEntity(Users.class)
                .setParameter("role", role)
                .list().size();
    }
    */

    @Override
    public boolean deleteUser(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Users> userList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Users> getMentors(int start, int offset) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getUsersCount(String role) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
