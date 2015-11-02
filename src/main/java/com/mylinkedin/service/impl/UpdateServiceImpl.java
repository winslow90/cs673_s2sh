/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service.impl;

import com.mylinkedin.dao.UpdateDao;
import com.mylinkedin.dao.UserDao;
import com.mylinkedin.service.UpdateService;

/**
 *
 * @author superman90
 */
public class UpdateServiceImpl implements UpdateService {
    UpdateDao updateDao;
    UserDao userDao;

    public void setUpdateDao(UpdateDao updateDao) {
        this.updateDao = updateDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    
}
