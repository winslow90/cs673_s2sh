/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service;

import com.mylinkedin.action.bean.Page;
import com.mylinkedin.domain.User;
import java.util.List;

/**
 *
 * @author superman90
 */
public interface SearchService {
    public List<User> searchUsers(
            
            String fnlike,
            String lnlike,
            String sumlike,
            String loclike,
            
            String unilike,
            String skilike,
            String comlike,
            String lanlike,
            boolean andcondition
            );
    public List<User> simpleSearch(String searchstr);
    public Page<User> searchUsers_p(
            
            String fnlike,
            String lnlike,
            String sumlike,
            String loclike,
            
            String unilike,
            String skilike,
            String comlike,
            String lanlike,
            boolean andcondition,
            int pageNum
            );
    public Page<User> simpleSearch_p(String searchstr, int pageNum);
    
}
