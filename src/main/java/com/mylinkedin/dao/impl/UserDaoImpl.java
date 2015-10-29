/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.dao.impl;

import com.mylinkedin.dao.UserDao;
import com.mylinkedin.domain.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author superman90
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    @Override
    public Long createUser(User user) {
        return (Long) this.getHibernateTemplate().save(user);
    }

    
}
