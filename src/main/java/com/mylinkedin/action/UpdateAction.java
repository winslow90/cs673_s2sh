/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.action;

import com.mylinkedin.domain.Notification;
import com.mylinkedin.domain.Updates;
import com.mylinkedin.domain.User;
import com.mylinkedin.service.NotificationService;
import com.mylinkedin.service.UpdateService;
import com.mylinkedin.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.Map;

/**
 *
 * @author superman90
 */
public class UpdateAction extends ActionSupport {
    
    private UserService userService;
    private UpdateService updateService;
    private NotificationService notificationService;
    
    User me;
    List<Updates> updates;
    List<Notification> notification;
    List<User> recommendation;   
    
    
    private Map<String, Object> getSession(){
        return ActionContext.getContext().getSession();
    }
    
    public String viewhome(){
        
        me = (User) this.getSession().get("me");
        
        updates= updateService.listUpdates(me.getUid());
        
        notification = notificationService.listNotifications(me.getUid());
        
        recommendation = userService.listrecommendation(me.getUid(), 12L);
        
        return SUCCESS;
    }
    
    public User getMe() {
        return me;
    }

    public void setMe(User me) {
        this.me = me;
    }

    public List<Updates> getUpdates() {
        return updates;
    }

    public void setUpdates(List<Updates> updates) {
        this.updates = updates;
    }

    public List<Notification> getNotification() {
        return notification;
    }

    public void setNotification(List<Notification> notification) {
        this.notification = notification;
    }

    public List<User> getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(List<User> recommendation) {
        this.recommendation = recommendation;
    }
    
    
    
    
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setUpdateService(UpdateService updateService) {
        this.updateService = updateService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
