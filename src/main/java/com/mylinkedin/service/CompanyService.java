/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service;

import com.mylinkedin.domain.Company;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author superman90
 */
public interface CompanyService {
        
    public List<Company> listCompanies();
    public List<Company> listCompaniesbyUid(Serializable uid);
    
    public void updateCompaniesbyCpName(Serializable uid,
            String[] cpNames);

    public void updateCompaniesbyCpId(Long uid, ArrayList<Long> mycomids);
    
}
