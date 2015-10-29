/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service.impl;

import com.mylinkedin.dao.UserDao;
import com.mylinkedin.domain.User;
import com.mylinkedin.service.UserService;

/**
 *
 * @author superman90
 */
public class UserServiceImpl implements UserService {
    
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    
}
