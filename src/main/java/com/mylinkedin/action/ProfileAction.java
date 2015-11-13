/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.action;

import com.mylinkedin.domain.Notification;
import com.mylinkedin.domain.User;
import com.mylinkedin.service.NotificationService;
import com.mylinkedin.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author superman90
 */
public class ProfileAction extends ActionSupport {
    
    private UserService userService;
    private NotificationService notificationService;
    

    
    
    
    User me;
    
    List<Notification> notification;    
    
    
    String seemail;
    String sepd[]={"",""};
    String sefname;
    String selname;
    String segender;
    String sesummary;
    
    
    
    private File sephoto;
    private String sephotoFileName;
    private String photoContentType;

    
    
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
        sephotoFileName=me.getPhoto_url();
        
//        myunis=universityService.listUniversitiesbyUid(me.getUid());
//        myskils=skillService.listSkillsbyUid(me.getUid());
//        mycoms=companyService.listCompaniesbyUid(me.getUid());
//        mylangs=languageService.listLanguagesUid(me.getUid());
        
        
        return SUCCESS;
    }
    
    
    public String selecticon(){
        
        
        
        return "selecticon";
    }
    
    public String updateicon() throws IOException{
        
        
        
        String storeDirectory = ServletActionContext.getServletContext().getRealPath("/img/profileicon");
        
        me = (User) this.getSession().get("me");
        
        Long meuid = me.getUid();
        
        
        FileUtils.copyFile(sephoto, new File(storeDirectory,meuid+"_icon.jpg"));
        
        
        me.setPhoto_url("img/profileicon/"+meuid+"_icon.jpg");
        
        userService.updateUserIcon(meuid, "img/profileicon/"+meuid+"_icon.jpg");
        
        this.getSession().put("me", me);
        
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
        sephotoFileName=me.getPhoto_url();
        
        return "selectbasic";
    }
    
    public String updatebasic(){
        
        me = (User) this.getSession().get("me");
        me = userService.getUserbyId(me.getUid());
        
        if ((!sepd[0].trim().isEmpty())&&(sepd[0].equals(sepd[1]))){
            me.setPd(sepd[0].trim());
        }
        if (!sefname.trim().isEmpty()){
            me.setFname(sefname);
        }
        if (!selname.trim().isEmpty()){
            me.setLname(selname);
        }
        if (!segender.trim().isEmpty()){
            me.setGender(segender);
        }
        if (!sesummary.trim().isEmpty()){
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

    public String getSephotoFileName() {
        return sephotoFileName;
    }

    public void setSephotoFileName(String sephotoFileName) {
        this.sephotoFileName = sephotoFileName;
    }
    public File getSephoto() {
        return sephoto;
    }

    public void setSephoto(File sephoto) {
        this.sephoto = sephoto;
    }

    public String getPhotoContentType() {
        return photoContentType;
    }

    public void setPhotoContentType(String photoContentType) {
        this.photoContentType = photoContentType;
    }
    
    
    
    

//    public void setSkillService(SkillService skillService) {
//        this.skillService = skillService;
//    }
//
//    public void setCompanyService(CompanyService companyService) {
//        this.companyService = companyService;
//    }
//
//    public void setLanguageService(LanguageService languageService) {
//        this.languageService = languageService;
//    }
    
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    
}
