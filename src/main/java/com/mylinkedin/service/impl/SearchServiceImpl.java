/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service.impl;

import com.mylinkedin.dao.UserDao;
import com.mylinkedin.domain.User;
import com.mylinkedin.service.SearchService;
import java.util.List;

/**
 *
 * @author superman90
 */
public class SearchServiceImpl implements SearchService {
    
    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> searchUsers(String fnlike, String lnlike, String sumlike, String loclike, String unilike, String skilike, String comlike, String lanlike) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> simpleSearch(String searchstr) {
        return this.searchUsers(searchstr, searchstr, searchstr, searchstr, searchstr, searchstr, searchstr, searchstr);
    }
    
    
    
}
