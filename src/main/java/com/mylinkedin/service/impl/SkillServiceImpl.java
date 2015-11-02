/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service.impl;

import com.mylinkedin.dao.SkillDao;
import com.mylinkedin.dao.UserDao;
import com.mylinkedin.service.SkillService;

/**
 *
 * @author superman90
 */
public class SkillServiceImpl implements SkillService {
    UserDao userDao;
    SkillDao skillDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setSkillDao(SkillDao skillDao) {
        this.skillDao = skillDao;
    }
    
    
    
}
