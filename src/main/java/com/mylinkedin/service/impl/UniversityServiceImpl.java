/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service.impl;

import com.mylinkedin.dao.UniversityDao;
import com.mylinkedin.dao.UserDao;
import com.mylinkedin.domain.University;
import com.mylinkedin.domain.User;
import com.mylinkedin.service.UniversityService;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;

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

    @Override
    public List<University> listUniversities() {
        return universityDao.listUniversities();
    }

    @Override
    public List<University> listUniversitiesbyUid(Serializable uid) {
        return universityDao.listUniversitiesbyUid(uid);
    }

    @Override
    public void updateUniversitiesbyUniName(Serializable uid, String[] uniNames) {
        User me = userDao.getUserbyId(uid);
        
        HashSet<University> unis = new HashSet();
        
        for (String unin: uniNames){
            University uni = universityDao.getUniversitybyName(unin);
            if ((uni!=null)&&(!unis.contains(uni))){
                unis.add(uni);
            }
        }
        me.setUniversities(unis);
        userDao.updateUser(me);
    }
    
}
