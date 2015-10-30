/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.dao.impl;

import com.mylinkedin.dao.SkillDao;
import com.mylinkedin.domain.Skill;
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
    public void test() {
        List<Skill> ls = listSkills();
    }
    
}
