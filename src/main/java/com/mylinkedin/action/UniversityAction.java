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
import java.util.HashMap;
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
    
    HashMap<Long, String> allunismap;
    ArrayList<Long> myuniids = new ArrayList();

    
    
    
    
    
    public String listunis(){
        
        me = (User) this.getSession().get("me");
        
        myunis= universityService.listUniversitiesbyUid(me.getUid());
        
        return "listunis";
    }
    public String selectunis(){
        
        allunismap= new HashMap();
        
        myuniids = new ArrayList();
        
        
        List<University> allunis =  universityService.listUniversities();
        
        me = (User) this.getSession().get("me");
        
        myunis= universityService.listUniversitiesbyUid(me.getUid());
        
        
        for (University uni : allunis){
            allunismap.put(uni.getUniid(), uni.getUni_name());
        }
        
        
        for (University uni : myunis){
            myuniids.add(uni.getUniid());
        }
        
        return "seunis";
    }
    public String updateunis(){
        
        me = (User) this.getSession().get("me");
       
        universityService.updateUniversitiesbyUniIds(me.getUid(),
                myuniids);
        
        return "viewprofile";
    }
        
    
    
    
    
    
    
    
    
    public List<University> getMyunis() {
        return myunis;
    }

    public void setMyunis(List<University> myunis) {
        this.myunis = myunis;
    }
    public HashMap<Long, String> getAllunismap() {
        return allunismap;
    }

    public void setAllunismap(HashMap<Long, String> allunismap) {
        this.allunismap = allunismap;
    }

    public ArrayList<Long> getMyuniids() {
        return myuniids;
    }

    public void setMyuniids(ArrayList<Long> myuniids) {
        this.myuniids = myuniids;
    }
    
    
    
    
    public void setUniversityService(UniversityService universityService) {
        this.universityService = universityService;
    }

    
}
