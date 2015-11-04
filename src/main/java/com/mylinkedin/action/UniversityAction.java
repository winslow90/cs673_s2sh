/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.action;

import com.mylinkedin.domain.University;
import com.mylinkedin.domain.User;
import com.mylinkedin.service.UniversityService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 *
 * @author superman90
 */
public class UniversityAction extends ActionSupport {
    
    UniversityService universityService;    
    
    
    private Map<String, Object> getSession(){
        return ActionContext.getContext().getSession();
    }  
    
    User me;
    List<University> myunis;
    HashSet<String> seunis;
    
    
    
    
    public String listunis(){
        
        me = (User) this.getSession().get("me");
        
        myunis= universityService.listUniversitiesbyUid(me.getUid());
        
        return "listunis";
    }
    public String selectunis(){
        
        seunis= new HashSet();
        
        List<University> allunis =  universityService.listUniversities();
        
        for (University uni : allunis){
            seunis.add(uni.getUni_name());
        }
        
        return "seunis";
    }
    public String updateunis(){
        
        
        
        return "viewprofile";
    }
        
    
    
    
    
    
    
    
    
    public List<University> getMyunis() {
        return myunis;
    }

    public void setMyunis(List<University> myunis) {
        this.myunis = myunis;
    }
    
    
    
    
    
    public void setUniversityService(UniversityService universityService) {
        this.universityService = universityService;
    }

    
}
