/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.action;

import com.mylinkedin.domain.Company;
import com.mylinkedin.domain.User;
import com.mylinkedin.service.CompanyService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author superman90
 */
public class CompanyAction extends ActionSupport {
    
    CompanyService companyService;

    
    
    private Map<String, Object> getSession(){
        return ActionContext.getContext().getSession();
    }  
    
    User me;
    List<Company> mycoms;
    
    HashMap<Long, String> allcomsmap;
    ArrayList<Long> mycomids;
    
    
    public String listcoms(){
        
        me = (User) this.getSession().get("me");
        
        mycoms= companyService.listCompaniesbyUid(me.getUid());
        
        return "listcoms";
    }
    public String selectcoms(){
        
        allcomsmap = new HashMap();
        
        mycomids = new ArrayList();
        
        List<Company> allcoms =  companyService.listCompanies();
        
        me = (User) this.getSession().get("me");
        
        mycoms = companyService.listCompaniesbyUid(me.getUid());
        
        for (Company cp : allcoms){
            allcomsmap.put(cp.getCpid(), cp.getCp_name());
        }
        
        for (Company cp : mycoms){
            mycomids.add(cp.getCpid());
        }
        
        return "secoms";
    }
    public String updatecoms(){
        
        me = (User) this.getSession().get("me");
        
        companyService.updateCompaniesbyCpId(me.getUid(), mycomids);
        
        return "viewprofile";
    }
    
    

    public List<Company> getMycoms() {
        return mycoms;
    }

    public void setMycoms(List<Company> mycoms) {
        this.mycoms = mycoms;
    }

    public HashMap<Long, String> getAllcomsmap() {
        return allcomsmap;
    }

    public void setAllcomsmap(HashMap<Long, String> allcomsmap) {
        this.allcomsmap = allcomsmap;
    }

    public ArrayList<Long> getMycomids() {
        return mycomids;
    }

    public void setMycomids(ArrayList<Long> mycomids) {
        this.mycomids = mycomids;
    }
    
    
    
    
    
    public void setCompanyService(CompanyService companyService) {
        this.companyService = companyService;
    }
}
