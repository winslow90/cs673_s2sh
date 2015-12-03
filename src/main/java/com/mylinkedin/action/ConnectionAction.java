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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author superman90
 */
public class ConnectionAction extends ActionSupport {
    
    private UserService userService;
    private NotificationService notificationService;


    
    User me;
    List<User> connections;
    List<Notification> notification;
    
    
    private Map<String, Object> getSession(){
        return ActionContext.getContext().getSession();
    }
    
    
    public String viewconnection(){
        
        me = (User) this.getSession().get("me");
        
        connections = userService.getConnection(me.getUid());       
        
        
        notification = notificationService.listNotifications(me.getUid());
        
        
        return SUCCESS;
    }
    
    public String viewconnectiononmap(){
        
        me = (User) this.getSession().get("me");
        
        List<User> theconnections = userService.getConnection(me.getUid());
        connections = new ArrayList();
        
        for (User con : theconnections){
            if (!con.getLantitudestr().trim().isEmpty()){
                connections.add(con);
            }
        }
        
        notification = notificationService.listNotifications(me.getUid());
        
        
        return "viewcononmap";
    }
    
    
     public User getMe() {
        return me;
    }

    public void setMe(User me) {
        this.me = me;
    }

    public List<User> getConnections() {
        return connections;
    }

    public void setConnections(List<User> connections) {
        this.connections = connections;
    }
    public List<Notification> getNotification() {
        return notification;
    }

    public void setNotification(List<Notification> notification) {
        this.notification = notification;
    }
    
    
    
     public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
