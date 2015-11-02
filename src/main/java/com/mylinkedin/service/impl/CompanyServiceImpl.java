/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service.impl;

import com.mylinkedin.dao.CompanyDao;
import com.mylinkedin.dao.UserDao;
import com.mylinkedin.domain.Company;
import com.mylinkedin.service.CompanyService;
import java.io.Serializable;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Company> listCompaniesbyUid(Serializable uid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCompaniesbyCpName(Serializable uid, String[] cpNames) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
