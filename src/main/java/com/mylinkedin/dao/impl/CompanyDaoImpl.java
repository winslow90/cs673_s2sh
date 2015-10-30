/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.dao.impl;

import com.mylinkedin.dao.CompanyDao;
import com.mylinkedin.domain.Company;
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
public class CompanyDaoImpl extends HibernateDaoSupport implements CompanyDao {

    @Override
    public Long createCompany(Company company) {
        return (Long) this.getHibernateTemplate().save(company);
    }

    @Override
    public void updateCompany(Company company) {
        this.getHibernateTemplate().update(company);
    }

    @Override
    public List<Company> listCompanies() {
        return (List<Company>) this.getHibernateTemplate().execute(
                new HibernateCallback(){

                @Override
                public Object doInHibernate(Session session) throws HibernateException, SQLException {
                    Query query = session.createQuery("from Company");
                    return query.list();
                }
            }
        );
    }

    @Override
    public void test() {
        
    }
    
    
    
}
