/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.dao.impl;

import com.mylinkedin.dao.NotificationDao;
import com.mylinkedin.domain.Notification;
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
public class NotificationDaoImpl extends HibernateDaoSupport implements NotificationDao {

    @Override
    public Long createNotification(Notification notification) {
        return (Long) this.getHibernateTemplate().save(notification);
    }

    @Override
    public void updateNotification(Notification notification) {
        this.getHibernateTemplate().update(notification);
    }

    @Override
    public List<Notification> listNotifications() {
        return (List<Notification>)this.getHibernateTemplate().execute(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.createQuery("from Notifications");
                return query.list();
            }
            
        });
    }

    @Override
    public void test() {
        
    }

    
    
}
