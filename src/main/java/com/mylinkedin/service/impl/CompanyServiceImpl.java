/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service.impl;

import com.mylinkedin.dao.CompanyDao;
import com.mylinkedin.dao.UserDao;
import com.mylinkedin.domain.Company;
import com.mylinkedin.domain.User;
import com.mylinkedin.service.CompanyService;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author superman90
 */
public class CompanyServiceImpl implements CompanyService {
    CompanyDao companyDao;
    UserDao userDao;

    public void setCompanyDao(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<Company> listCompanies() {
        return companyDao.listCompanies();
    }

    @Override
    public List<Company> listCompaniesbyUid(Serializable uid) {
        return companyDao.listCompaniesbyUid(uid);
    }

    @Override
    public void updateCompaniesbyCpName(Serializable uid, String[] cpNames) {
        User me = userDao.getUserbyId(uid);
        HashSet<Company> cps = new HashSet();
        
        for (String cpname: cpNames){
            Company cp = companyDao.getCompanybyName(cpname);
            if ((cp!=null)&&(!cps.contains(cp))){
                cps.add(cp);
            }
        }
        
        me.setCompanies(cps);
        
        userDao.updateUser(me);
    }
    
    
    
}
