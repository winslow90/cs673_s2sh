/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service.impl;

import com.mylinkedin.dao.UserDao;
import com.mylinkedin.domain.User;
import com.mylinkedin.service.SearchService;
import java.util.ArrayList;
import java.util.HashMap;
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
    public List<User> searchUsers(String fnlike, String lnlike, String sumlike, 
                String loclike, String unilike, String skilike, 
                String comlike, String lanlike, boolean andcondition) {
        
        HashMap<String, String[]> paras= new HashMap();
        List<User> result;
        
        if (fnlike!=null){
            String str[]= {"u.fname",fnlike};
            paras.put("fname", str);
        }
        if (lnlike!=null){
            String str[]= {"u.lname",lnlike};
            paras.put("lname", str);
        }
        if (sumlike!=null){
            String str[]= {"u.summary",sumlike};
            paras.put("summary", str);
        }
        if (loclike!=null){
            String str[]= {"u.location",loclike};
            paras.put("location", str);
        }
        if (unilike!=null){
            String str[]= {"uni.uni_name",unilike};
            paras.put("uni_name", str);
        }
        if (skilike!=null){
            String str[]= {"sk.sk_name",skilike};
            paras.put("sk_name", str);
        }
        if (comlike!=null){
            String str[]= {"cp.cp_name",comlike};
            paras.put("cp_name", str);
        }
        if (lanlike!=null){
            String str[]= {"lang.lang_name",lanlike};
            paras.put("lang_name", str);
        }
        
        
        if (paras.size()>0){
            result=userDao.searchUserLike(paras, andcondition);
        }else{
            result= new ArrayList();
        }
                
        return result;
    }

    @Override
    public List<User> simpleSearch(String searchstr) {
        return this.searchUsers(searchstr, searchstr, searchstr, searchstr, searchstr, searchstr, searchstr, searchstr,false);
    }
    
    
    
}
