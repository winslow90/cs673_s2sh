/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service.impl;

import com.mylinkedin.dao.LanguageDao;
import com.mylinkedin.dao.UserDao;
import com.mylinkedin.domain.Languages;
import com.mylinkedin.domain.User;
import com.mylinkedin.service.LanguageService;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;

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

    @Override
    public List<Languages> listLanguages() {
        return languageDao.listLanguage();
    }

    @Override
    public List<Languages> listLanguagesUid(Serializable uid) {
        return languageDao.listLanguagesbyUid(uid);
    }

    @Override
    public void updateLanguagesbyLangName(Serializable uid, String[] langNames) {
        User me = userDao.getUserbyId(uid);
        HashSet<Languages> langs= new HashSet();
        
        for (String langname : langNames){
            Languages lang= languageDao.getLanguagebyName(langname);
            if ((lang!=null)&&(!langs.contains(lang))){
                langs.add(lang);
            }
        }
        
        me.setLanguages(langs);
        
        userDao.updateUser(me);
        
    }
    
}
