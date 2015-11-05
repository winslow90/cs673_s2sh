/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.action;

import com.mylinkedin.domain.Skill;
import com.mylinkedin.domain.User;
import com.mylinkedin.service.SkillService;
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
public class SkillAction extends ActionSupport {
    
    SkillService skillService;

    
    
    private Map<String, Object> getSession(){
        return ActionContext.getContext().getSession();
    }  
    
    User me;
    List<Skill> mysks;
    
    HashMap<Long, String> allsksmap;
    ArrayList<Long> myskids;

    
    
    public String listsks(){
        
        me = (User) this.getSession().get("me");
        
        mysks= skillService.listSkillsbyUid(me.getUid());
        
        return "listsks";
    }
    public String selectsks(){
        
        allsksmap = new HashMap();
        
        myskids = new ArrayList();
        
        List<Skill> allsks= skillService.listSkills();
        
        me = (User) this.getSession().get("me");
        
        mysks= skillService.listSkillsbyUid(me.getUid());
        
        for (Skill sk : allsks){
            allsksmap.put(sk.getSkid(), sk.getSk_name());
        }
        
        for (Skill sk : mysks){
            myskids.add(sk.getSkid());
        }
        
        return "sesks";
    }
    public String updatesks(){
        
        me = (User) this.getSession().get("me");
        
        skillService.updateSkillsbySkIds(me.getUid(), myskids);
        
        return "viewprofile";
    }
    
    
    
    
    
    
    
    
    
    public List<Skill> getMysks() {
        return mysks;
    }

    public void setMysks(List<Skill> mysks) {
        this.mysks = mysks;
    }

    public HashMap<Long, String> getAllsksmap() {
        return allsksmap;
    }

    public void setAllsksmap(HashMap<Long, String> allsksmap) {
        this.allsksmap = allsksmap;
    }

    public ArrayList<Long> getMyskids() {
        return myskids;
    }

    public void setMyskids(ArrayList<Long> myskids) {
        this.myskids = myskids;
    }
    
    
    
    
    public void setSkillService(SkillService skillService) {
        this.skillService = skillService;
    }
}
