/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.dao.impl;

import com.mylinkedin.dao.UpdateDao;
import com.mylinkedin.domain.Updates;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author superman90
 */
public class UpdateDaoImpl extends HibernateDaoSupport implements UpdateDao {

    @Override
    public Long createUpdate(Updates update) {
        return (Long) this.getHibernateTemplate().save(update);
    }

    @Override
    public void updateUPdate(Updates update) {
        this.getHibernateTemplate().update(update);
    }

    @Override
    public List<Updates> listupdates() {
        return (List<Updates>) this.getHibernateTemplate().execute(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.createQuery("from Update");
                return query.list();
            }
            
        });
                
                
    }

    @Override
    public void test() {
        
    }
    
    
}
