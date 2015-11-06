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
        
        if (!fnlike.trim().isEmpty()){
            String str[]= {"u.fname",fnlike};
            paras.put("myfname", str);
        }
        if (!lnlike.trim().isEmpty()){
            String str[]= {"u.lname",lnlike};
            paras.put("mylname", str);
        }
        if (!sumlike.trim().isEmpty()){
            String str[]= {"u.summary",sumlike};
            paras.put("mysummary", str);
        }
        if (!loclike.trim().isEmpty()){
            String str[]= {"u.location",loclike};
            paras.put("mylocation", str);
        }
        if (!unilike.trim().isEmpty()){
            String str[]= {"uni.uni_name",unilike};
            paras.put("myuni_name", str);
        }
        if (!skilike.trim().isEmpty()){
            String str[]= {"sk.sk_name",skilike};
            paras.put("mysk_name", str);
        }
        if (!comlike.trim().isEmpty()){
            String str[]= {"cp.cp_name",comlike};
            paras.put("mycp_name", str);
        }
        if (!lanlike.trim().isEmpty()){
            String str[]= {"lang.lang_name",lanlike};
            paras.put("mylang_name", str);
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
