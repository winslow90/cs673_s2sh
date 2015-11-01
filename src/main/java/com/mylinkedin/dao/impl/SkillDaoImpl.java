/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.dao.impl;

import com.mylinkedin.dao.SkillDao;
import com.mylinkedin.domain.Skill;
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
public class SkillDaoImpl extends HibernateDaoSupport implements SkillDao {

    @Override
    public Long createSkill(Skill skill) {
        return (Long) this.getHibernateTemplate().save(skill);
    }

    @Override
    public void updateSkill(Skill skill) {
        this.getHibernateTemplate().update(skill);
    }

    @Override
    public List<Skill> listSkills() {
        return (List<Skill>) this.getHibernateTemplate().execute(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.createQuery("from Skill");
                return query.list();
            }
            
        });
    }
    
    @Override
    public List<Skill> listSkillsbyUid(Serializable uid) {
        final Serializable myuid = uid;
        
        return (List<Skill>) this.getHibernateTemplate().execute(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.createQuery("from Skill sk join fetch sk.users us where us.uid=:theuid");
                query.setParameter("theuid", myuid);
                return (List<Skill>) query.list();
            }
            
        });
    }

    @Override
    public Skill getSkillbyId(Serializable skid) {
        return this.getHibernateTemplate().get(Skill.class, skid);
    }

    @Override
    public Skill getSkillbyName(String skname) {
        final String myskname = skname;
        
        return (Skill) this.getHibernateTemplate().execute(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.createQuery("from Skill sk where sk.sk_name=:theskname");
                query.setParameter("theskname", myskname);
                
                return (Skill) query.uniqueResult();
                
            }
            
        });
    }
    
    @Override
    public void test() {
        List<Skill> ls = listSkills();
    }
    
}
