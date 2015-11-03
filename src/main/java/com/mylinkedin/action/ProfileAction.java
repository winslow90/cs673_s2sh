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
public class ProfileAction extends ActionSupport {
    
    private UserService userService;
    private NotificationService notificationService;
    
    private UniversityService universityService;
    private SkillService skillService;
    private CompanyService companyService;
    private LanguageService languageService;

    

    
    
    
    User me;
    
    List<Notification> notification;    
    
    List<University> myunis;
    List<Skill> myskils;
    List<Company> mycoms;
    List<Languages> mylangs;
    
    String seemail;
    String sepd[]={"",""};
    String sefname;
    String selname;
    String segender;
    String sesummary;
    String sephoto_url;

    
    
    private Map<String, Object> getSession(){
        return ActionContext.getContext().getSession();
    }    
    
    
    
    
    public String viewprofile(){
        
        me = (User) this.getSession().get("me");
        notification = notificationService.listNotifications(me.getUid());        
        
        seemail=me.getEmail();
        sepd[0]=me.getPd();
        sepd[1]=me.getPd();
        sefname= me.getFname();
        selname= me.getLname();
        segender=me.getGender();
        sesummary=me.getSummary();
        sephoto_url=me.getPhoto_url();
        
        myunis=universityService.listUniversitiesbyUid(me.getUid());
        myskils=skillService.listSkillsbyUid(me.getUid());
        mycoms=companyService.listCompaniesbyUid(me.getUid());
        mylangs=languageService.listLanguagesUid(me.getUid());
        
        
        return SUCCESS;
    }
    
    
    public String selecticon(){
        
        
        return "selecticon";
    }
    
    public String updateicon(){
        
        return "viewprofile";
    }
    
    public String selectbasic(){
        
        me = (User) this.getSession().get("me");
//        me = userService.getUserbyId(me.getUid());
        
        seemail=me.getEmail();
        sepd[0]=me.getPd();
        sepd[1]=me.getPd();
        sefname= me.getFname();
        selname= me.getLname();
        segender=me.getGender();
        sesummary=me.getSummary();
        sephoto_url=me.getPhoto_url();
        
        return "selectbasic";
    }
    
    public String updatebasic(){
        
        me = (User) this.getSession().get("me");
        me = userService.getUserbyId(me.getUid());
        
        if ((!sepd[0].isEmpty())&&(sepd[0].equals(sepd[1]))){
            me.setPd(sepd[0]);
        }
        if (!sefname.isEmpty()){
            me.setFname(sefname);
        }
        if (!selname.isEmpty()){
            me.setLname(selname);
        }
        if (!segender.isEmpty()){
            me.setGender(segender);
        }
        if (!sesummary.isEmpty()){
            me.setSummary(sesummary);
        }
        
        userService.updateUser(me);        
        
        this.getSession().put("me", me);
        
        return "viewprofile";
    }
    
    
    
    
    
    public String getSelname() {
        return selname;
    }

    public void setSelname(String selname) {
        this.selname = selname;
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

    public List<University> getMyunis() {
        return myunis;
    }

    public void setMyunis(List<University> myunis) {
        this.myunis = myunis;
    }

    public List<Skill> getMyskils() {
        return myskils;
    }

    public void setMyskils(List<Skill> myskils) {
        this.myskils = myskils;
    }

    public List<Company> getMycoms() {
        return mycoms;
    }

    public void setMycoms(List<Company> mycoms) {
        this.mycoms = mycoms;
    }

    public List<Languages> getMylangs() {
        return mylangs;
    }

    public void setMylangs(List<Languages> mylangs) {
        this.mylangs = mylangs;
    }

    public String getSeemail() {
        return seemail;
    }

    public void setSeemail(String seemail) {
        this.seemail = seemail;
    }

    public String[] getSepd() {
        return sepd;
    }

    public void setSepd(String[] sepd) {
        this.sepd = sepd;
    }

    public String getSefname() {
        return sefname;
    }

    public void setSefname(String sefname) {
        this.sefname = sefname;
    }

    public String getSegender() {
        return segender;
    }

    public void setSegender(String segender) {
        this.segender = segender;
    }

    public String getSesummary() {
        return sesummary;
    }

    public void setSesummary(String sesummary) {
        this.sesummary = sesummary;
    }

    public String getSephoto_url() {
        return sephoto_url;
    }

    public void setSephoto_url(String sephoto_url) {
        this.sephoto_url = sephoto_url;
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
    
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    
}
