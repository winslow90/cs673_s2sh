/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.action;

import com.mylinkedin.domain.Languages;
import com.mylinkedin.domain.User;
import com.mylinkedin.service.LanguageService;
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
public class LanguageAction extends ActionSupport {
    
    LanguageService languageService;

    
    
    private Map<String, Object> getSession(){
        return ActionContext.getContext().getSession();
    }  
    
    
    User me;
    List<Languages> mylangs;
    
    HashMap<Long, String> alllangsmap;
    ArrayList<Long> mylangids;
    
    
    public String listlangs(){
        
        me = (User) this.getSession().get("me");
        
        mylangs = languageService.listLanguagesUid(me.getUid());
        
        return "listlangs";
    }
    public String selectlangs(){
        alllangsmap = new HashMap();
        
        mylangids = new ArrayList();
        
        List<Languages> alllangs= languageService.listLanguages();
        
        me = (User) this.getSession().get("me");
        
        mylangs=languageService.listLanguagesUid(me.getUid());
        
        for (Languages lang: alllangs){
            alllangsmap.put(lang.getLang_id(), lang.getLang_name());
        }
        
        for (Languages lang: mylangs){
            mylangids.add(lang.getLang_id());
        }
        
        return "selangs";
        
    }
    
    public String updatelangs(){
        
        me = (User) this.getSession().get("me");
        
        languageService.updateLanguagesbyLangIds(me.getUid(), mylangids);
        
        return "viewprofile";        
    }
    
    
    
    
    
    
    
    

    public List<Languages> getMylangs() {
        return mylangs;
    }

    public void setMylangs(List<Languages> mylangs) {
        this.mylangs = mylangs;
    }

    public HashMap<Long, String> getAlllangsmap() {
        return alllangsmap;
    }

    public void setAlllangsmap(HashMap<Long, String> alllangsmap) {
        this.alllangsmap = alllangsmap;
    }

    public ArrayList<Long> getMylangids() {
        return mylangids;
    }

    public void setMylangids(ArrayList<Long> mylangids) {
        this.mylangids = mylangids;
    }
    
    
    
    public void setLanguageService(LanguageService languageservice) {
        this.languageService = languageservice;
    }
}
