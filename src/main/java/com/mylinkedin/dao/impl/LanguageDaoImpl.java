/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.dao.impl;

import com.mylinkedin.dao.LanguageDao;
import com.mylinkedin.domain.Languages;
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
public class LanguageDaoImpl extends HibernateDaoSupport implements LanguageDao {

    @Override
    public Long createLanguage(Languages language) {
        return (Long) this.getHibernateTemplate().save(language);
    }

    @Override
    public void updateLanguage(Languages language) {
        this.getHibernateTemplate().update(language);
    }

    @Override
    public List<Languages> listLanguage() {
        return (List<Languages>) this.getHibernateTemplate().execute(
                new HibernateCallback(){

                    @Override
                    public Object doInHibernate(Session session) throws HibernateException, SQLException {
                        Query query = session.createQuery("from Languages");
                        return query.list();
                    }
                    
                 });
    }

    @Override
    public List<Languages> listLanguagesbyUid(Serializable uid) {
        final Serializable myuid = uid;
        
        return (List<Languages>) this.getHibernateTemplate().execute(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.createQuery("from Languages lang join fetch lang.users us where us.uid=:theuid");
                query.setParameter("theuid", myuid);
                return (List<Languages>) query.list();
            }
            
        });
    }

    @Override
    public Languages getLanguagebyId(Serializable langid) {
        return this.getHibernateTemplate().get(Languages.class, langid);
    }

    @Override
    public Languages getLanguagebyName(String langname) {
        
        final String mylangname = langname;
        
        return (Languages) this.getHibernateTemplate().execute(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.createQuery("from Languages lang where lang.lang_name=:thelangname");
                query.setParameter("thelangname", mylangname);
                
                return (Languages) query.uniqueResult();
                
            }
            
        });
    }
    

    @Override
    public void test() {
        
    }
    
}
