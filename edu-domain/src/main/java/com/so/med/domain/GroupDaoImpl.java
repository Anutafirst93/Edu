/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.med.domain;

import com.so.med.Groups;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Нюта
 */
public class GroupDaoImpl implements GroupDao {
    
      @Override
    public void getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateGroup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getGroupsList() {
        String req = "select g.id as id, g.namegroup as namegroup, u.firstname as firstname, u.lastname as lastname " +
"from users u, groups g " +
"where g.menthorid = u.id";
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Groups> grouplist;
        // select * from users
        grouplist = session.createSQLQuery(req).addEntity(Groups.class).list();
        return grouplist;
    }

    @Override
    public void deleteId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
