/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.dao.impl;

import com.mylinkedin.dao.UpdateDao;
import com.mylinkedin.domain.Updates;
import java.io.Serializable;
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
    public void updateUpdate(Updates update) {
        this.getHibernateTemplate().update(update);
    }

    @Override
    public List<Updates> listUpdates() {
        return (List<Updates>) this.getHibernateTemplate().execute(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.createQuery("from Updates");
                return query.list();
            }
            
        });
                
                
    }

    @Override
    public List<Updates> listUpdatebyUid(Serializable uid) {
        
        final Serializable myuid = uid;
        return (List<Updates>) this.getHibernateTemplate().execute(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query= session.createQuery("from Updates up join fetch up.user u where u.uid =:theuid and up.up_read=false");
                
                query.setParameter("theuid", myuid);
                
                return (List<Updates>) query.list();
            }
            
        });
    }

    @Override
    public void invalidateUpdate(Updates ntf) {
        
        ntf.setUp_read(true);
        
        this.getHibernateTemplate().update(ntf);
        
    }

    @Override
    public List<Updates> listValidUpdatebyUid(Serializable uid) {
        
        final Serializable myuid = uid;
        
        return (List<Updates>) this.getHibernateTemplate().execute(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query= session.createQuery("from Updates up join fetch up.user u where u.uid =:theuid and up.up_read=false");
                
                query.setParameter("theuid", myuid);
                
                return (List<Updates>) query.list();
            }
            
        });
        
    }
    
    
    @Override
    public void test() {
        
    }
    
}
