/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.dao.impl;

import com.mylinkedin.dao.LanguageDao;
import com.mylinkedin.domain.Language;
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
    public Long createLanguage(Language language) {
        return (Long) this.getHibernateTemplate().save(language);
    }

    @Override
    public void updateLanguage(Language language) {
        this.getHibernateTemplate().update(language);
    }

    @Override
    public List<Language> listLanguage() {
        return (List<Language>) this.getHibernateTemplate().execute(
                new HibernateCallback(){

                    @Override
                    public Object doInHibernate(Session session) throws HibernateException, SQLException {
                        Query query = session.createQuery("from Company");
                        return query.list();
                    }
                    
                 });
    }

    @Override
    public List<Language> listLanguagesbyUid(Serializable uid) {
        final Serializable myuid = uid;
        
        return (List<Language>) this.getHibernateTemplate().execute(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.createQuery("from Language lang join fetch lang.users us where us.uid=:theuid");
                query.setParameter("theuid", myuid);
                return (List<Language>) query.list();
            }
            
        });
    }

    @Override
    public Language getLanguagebyId(Serializable langid) {
        return this.getHibernateTemplate().get(Language.class, langid);
    }

    @Override
    public Language getLanguagebyName(String langname) {
        
        final String mylangname = langname;
        
        return (Language) this.getHibernateTemplate().execute(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.createQuery("from Language lang where lang.lang_name=:thelangname");
                query.setParameter("thelangname", mylangname);
                
                return (Language) query.uniqueResult();
                
            }
            
        });
    }
    

    @Override
    public void test() {
        
    }
    
}
