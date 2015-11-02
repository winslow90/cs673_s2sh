/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service.impl;

import com.mylinkedin.dao.LanguageDao;
import com.mylinkedin.dao.UserDao;
import com.mylinkedin.service.LanguageService;

/**
 *
 * @author superman90
 */
public class LanguageServiceImpl implements LanguageService {
    LanguageDao languageDao;
    UserDao userDao;

    public void setLanguageDao(LanguageDao languageDao) {
        this.languageDao = languageDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    
}
