/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service.impl;

import com.mylinkedin.dao.UniversityDao;
import com.mylinkedin.dao.UserDao;
import com.mylinkedin.service.UniversityService;

/**
 *
 * @author superman90
 */
public class UniversityServiceImpl implements UniversityService {
    
    UniversityDao universityDao;
    UserDao userDao;

    public void setUniversityDao(UniversityDao universityDao) {
        this.universityDao = universityDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    
}
