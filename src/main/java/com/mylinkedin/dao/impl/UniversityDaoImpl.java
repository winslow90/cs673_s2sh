/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.dao.impl;

import com.mylinkedin.dao.UniversityDao;
import com.mylinkedin.domain.University;
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
public class UniversityDaoImpl extends HibernateDaoSupport implements UniversityDao {

    @Override
    public Long creatUniversity(University university) {
        return (Long) this.getHibernateTemplate().save(university);
    }

    @Override
    public void updateUniversity(University university) {
        this.getHibernateTemplate().save(university);
    }

    @Override
    public List<University> listUniversities() {
        return (List<University>) this.getHibernateTemplate().execute(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.createQuery("from University");
                return query.list();
            }
        });
    }

    @Override
    public List<University> listUniversitiesbyUid(Serializable uid) {
        
        final Serializable myuid = uid;
        
        return (List<University>) this.getHibernateTemplate().execute(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.createQuery("from University uni join fetch uni.users us where us.uid=:theuid");
                query.setParameter("theuid", myuid);
                return (List<University>) query.list();
            }
            
        });
    }

    @Override
    public University getUniversitybyId(Serializable uniid) {
        return this.getHibernateTemplate().get(University.class, uniid);
    }

    @Override
    public University getUniversitybyName(String uniname) {
        
        final String myuniname = uniname;
        
        return (University) this.getHibernateTemplate().execute(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.createQuery("from University uni where uni.uni_name=:theuniname");
                query.setParameter("theuniname", myuniname);
                
                return (University) query.uniqueResult();
                
            }
            
        });
        
    }
    
    
    @Override
    public void test() {
        
    }    
    
}
