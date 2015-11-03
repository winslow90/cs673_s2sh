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
import java.util.List;
import java.util.Map;

/**
 *
 * @author superman90
 */
public class ProfileAction extends ActionSupport {
    
    private UserService userService;
    private NotificationService notificationService;

    
    
    User me;
    List<Notification> notification;    
    
    private Map<String, Object> getSession(){
        return ActionContext.getContext().getSession();
    }    
    
    
    
    
    public String viewprofile(){
        me = (User) this.getSession().get("me");
        notification = notificationService.listNotifications(me.getUid());        
        
        
        
        return SUCCESS;
    }
    
    
    public String selecticon(){
        
        
        return "selecticon";
    }
    
    public String updateicon(){
        
        return "viewprofile";
    }
    
    public String selectbasic(){
        
        
        
        return "selectbasic";
    }
    
    public String updatebasic(){
        
        
        return "viewprofile";
    }
    
    
    
    
    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User getMe() {
        return me;
    }

    public void setMe(User me) {
        this.me = me;
    }
    
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void setNotification(List<Notification> notification) {
        this.notification = notification;
    }
    
}
