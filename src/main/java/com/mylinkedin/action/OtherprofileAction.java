/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.action;

import com.mylinkedin.domain.Company;
import com.mylinkedin.domain.Languages;
import com.mylinkedin.domain.Notification;
import com.mylinkedin.domain.Skill;
import com.mylinkedin.domain.University;
import com.mylinkedin.domain.User;
import com.mylinkedin.service.CompanyService;
import com.mylinkedin.service.LanguageService;
import com.mylinkedin.service.NotificationService;
import com.mylinkedin.service.SkillService;
import com.mylinkedin.service.UniversityService;
import com.mylinkedin.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.Map;

/**
 *
 * @author superman90
 */
public class OtherprofileAction extends ActionSupport {
    
    private UserService userService;
    private NotificationService notificationService;
    
    private UniversityService universityService;
    private SkillService skillService;
    private CompanyService companyService;
    private LanguageService languageService;

    
    
    User me;
    List<Notification> notification;
    
    
    Long hisuid;

   
    User he;
    String hisemail;
    String hisfname;
    String hislname;
    String hisgender;
    String hissummary;
    String hisphotofilename;
    
    List<University> hisunis;
    List<Skill> hisskils;
    List<Company> hiscoms;
    List<Languages> hislangs;
    
    Boolean thediff;
    Boolean theremove;
    
    
    private Map<String, Object> getSession(){
        return ActionContext.getContext().getSession();
    }  
    
    
    
    
    public String viewotherprofile(){
        
        me = (User) this.getSession().get("me");
        notification = notificationService.listNotifications(me.getUid()); 
        
        if (hisuid==null){
            return "viewhome";
        }else{
            
            he= userService.getUserbyId(hisuid);
            
            hisemail=he.getEmail();
            hisfname= he.getFname();
            hislname=he.getLname();
            hisgender=he.getGender();
            hissummary=he.getSummary();
            hisphotofilename=he.getPhoto_url();
            
            hisunis=universityService.listUniversitiesbyUid(hisuid);
            hisskils=skillService.listSkillsbyUid(hisuid);
            hiscoms=companyService.listCompaniesbyUid(hisuid);
            hislangs=languageService.listLanguagesUid(hisuid);
            
            
        }
        
        Long myuidlong= me.getUid();
        
        
        if (myuidlong.equals(hisuid)){
            thediff=Boolean.FALSE;
        }else{
            thediff=Boolean.TRUE;
            theremove=userService.checkConHas(myuidlong, hisuid);
        }
        
        return SUCCESS;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    public Long getHisuid() {
        return hisuid;
    }

    public void setHisuid(Long hisuid) {
        this.hisuid = hisuid;
    }
    
    public Boolean getThediff() {
        return thediff;
    }

    public void setThediff(Boolean thediff) {
        this.thediff = thediff;
    }

    public Boolean getTheremove() {
        return theremove;
    }

    public void setTheremove(Boolean theremove) {
        this.theremove = theremove;
    }
    
    public User getMe() {
        return me;
    }

    public void setMe(User me) {
        this.me = me;
    }

    public List<Notification> getNotification() {
        return notification;
    }

    public void setNotification(List<Notification> notification) {
        this.notification = notification;
    }

    public User getHe() {
        return he;
    }

    public void setHe(User he) {
        this.he = he;
    }

    public String getHisemail() {
        return hisemail;
    }

    public void setHisemail(String hisemail) {
        this.hisemail = hisemail;
    }

    public String getHisfname() {
        return hisfname;
    }

    public void setHisfname(String hisfname) {
        this.hisfname = hisfname;
    }

    public String getHislname() {
        return hislname;
    }

    public void setHislname(String hislname) {
        this.hislname = hislname;
    }

    public String getHisgender() {
        return hisgender;
    }

    public void setHisgender(String hisgender) {
        this.hisgender = hisgender;
    }

    public String getHissummary() {
        return hissummary;
    }

    public void setHissummary(String hissummary) {
        this.hissummary = hissummary;
    }

    public String getHisphotofilename() {
        return hisphotofilename;
    }

    public void setHisphotofilename(String hisphotofilename) {
        this.hisphotofilename = hisphotofilename;
    }
    
    public List<University> getHisunis() {
        return hisunis;
    }

    public void setHisunis(List<University> hisunis) {
        this.hisunis = hisunis;
    }

    public List<Skill> getHisskils() {
        return hisskils;
    }

    public void setHisskils(List<Skill> hisskils) {
        this.hisskils = hisskils;
    }

    public List<Company> getHiscoms() {
        return hiscoms;
    }

    public void setHiscoms(List<Company> hiscoms) {
        this.hiscoms = hiscoms;
    }

    public List<Languages> getHislangs() {
        return hislangs;
    }

    public void setHislangs(List<Languages> hislangs) {
        this.hislangs = hislangs;
    }
    
    
    
    
    
    
    
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void setUniversityService(UniversityService universityService) {
        this.universityService = universityService;
    }

    public void setSkillService(SkillService skillService) {
        this.skillService = skillService;
    }

    public void setCompanyService(CompanyService companyService) {
        this.companyService = companyService;
    }

    public void setLanguageService(LanguageService languageService) {
        this.languageService = languageService;
    }
}
