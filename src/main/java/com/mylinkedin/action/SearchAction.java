/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.action;

import com.mylinkedin.action.bean.Page;
import com.mylinkedin.domain.Notification;
import com.mylinkedin.domain.User;
import com.mylinkedin.service.NotificationService;
import com.mylinkedin.service.SearchService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.Map;

/**
 *
 * @author superman90
 */
public class SearchAction extends ActionSupport {
    
    SearchService searchService;
    NotificationService notificationService;

    
    
    String simplestr = new String();
    
    String fnlike= new String(),
            lnlike= new String(),
            sumlike= new String(),
            loclike= new String(),
            
            unilike= new String(),
            skilike= new String(),
            comlike= new String(),
        lanlike= new String();
    
//    List<User> resultUsers;
    List<Notification> notification;
    
    Page<User> resultUsersPage;
    
    Integer currentpage;


    


    
    
    private Map<String, Object> getSession(){
        return ActionContext.getContext().getSession();
    }
    
    
    public String dosimplesearch(){
        
        User me;
        
        me=(User) this.getSession().get("me");
        
        notification = notificationService.listNotifications(me.getUid());
        
        
        if (currentpage==null){
            currentpage = 1;
        }
        
        fnlike=simplestr;
        lnlike=simplestr;
        sumlike=simplestr;
        loclike=simplestr;
        unilike=simplestr;
        skilike=simplestr;
        comlike=simplestr;
        lanlike=simplestr;
        
        resultUsersPage= searchService.simpleSearch_p(simplestr,currentpage);
               
        
        return "listresult";
    }
    
    public String viewadvsearch(){
        
        User me;
        
        me=(User) this.getSession().get("me");
        
        notification = notificationService.listNotifications(me.getUid());
        
        
        return "viewadvsearch";
    }
    
    public String doadvsearch(){
        
        User me;
        
        me=(User) this.getSession().get("me");
        
        notification = notificationService.listNotifications(me.getUid());
        
        if (currentpage==null){
            currentpage = 1;
        }
        
                
        resultUsersPage= searchService.searchUsers_p(fnlike, lnlike, sumlike, 
                loclike, unilike, skilike, comlike, lanlike, false,currentpage);
        
        return "listresult";
    }
    
    
    
    
    
    public Page<User> getResultUsersPage() {
        return resultUsersPage;
    }

    public void setResultUsersPage(Page<User> resultUsersPage) {
        this.resultUsersPage = resultUsersPage;
    }

    public Integer getCurrentpage() {
        return currentpage;
    }

    public void setCurrentpage(Integer currentpage) {
        this.currentpage = currentpage;
    }
    
    public String getSimplestr() {
        return simplestr;
    }

    public void setSimplestr(String simplestr) {
        this.simplestr = simplestr;
    }

    public String getFnlike() {
        return fnlike;
    }

    public void setFnlike(String fnlike) {
        this.fnlike = fnlike;
    }

    public String getLnlike() {
        return lnlike;
    }

    public void setLnlike(String lnlike) {
        this.lnlike = lnlike;
    }

    public String getSumlike() {
        return sumlike;
    }

    public void setSumlike(String sumlike) {
        this.sumlike = sumlike;
    }

    public String getLoclike() {
        return loclike;
    }

    public void setLoclike(String loclike) {
        this.loclike = loclike;
    }

    public String getUnilike() {
        return unilike;
    }

    public void setUnilike(String unilike) {
        this.unilike = unilike;
    }

    public String getSkilike() {
        return skilike;
    }

    public void setSkilike(String skilike) {
        this.skilike = skilike;
    }

    public String getComlike() {
        return comlike;
    }

    public void setComlike(String comlike) {
        this.comlike = comlike;
    }

    public String getLanlike() {
        return lanlike;
    }

    public void setLanlike(String lanlike) {
        this.lanlike = lanlike;
    }

//    public List<User> getResultUsers() {
//        return resultUsers;
//    }
//
//    public void setResultUsers(List<User> resultUsers) {
//        this.resultUsers = resultUsers;
//    }
    
    public List<Notification> getNotification() {
        return notification;
    }

    public void setNotification(List<Notification> notification) {
        this.notification = notification;
    }
    
    
    
    

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }    
    
    public void setSearchService(SearchService searchService) {
        this.searchService = searchService;
    }
}
