/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.dao;

import com.mylinkedin.domain.Company;
import java.util.List;

/**
 *
 * @author superman90
 */
public interface CompanyDao {
    
    public Long createCompany(Company company);
    public void updateCompany(Company company);
    public List<Company> listCompanies();
    
    public void test();
    
}
