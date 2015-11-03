/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.action;

import com.mylinkedin.domain.User;
import com.mylinkedin.service.NotificationService;
import com.mylinkedin.service.UpdateService;
import com.mylinkedin.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;

/**
 *
 * @author superman90
 */
public class AddRemoveConAction extends ActionSupport {
    
    private UserService userService;
    private UpdateService updateService;
    private NotificationService notificationService;
    
    private String uidtoremovestr;
    private String uidtoaddstr;
    
    
    private User usertoremove;
    private User usertoadd;

    
    public String asynremoveconnection(){
        
        User me = (User) this.getSession().get("me");
        
        usertoremove = userService.getUserbyId(Long.parseLong(uidtoremovestr));
        
        if (usertoremove!=null){
            userService.removeConnection(me.getUid(), usertoremove.getUid());
            return "removesuccess";
        }else {
            return "fail";
        }
        
    }
    public String asynaddconnection(){
        
        User me = (User) this.getSession().get("me");
        
        usertoadd = userService.getUserbyId(Long.parseLong(uidtoaddstr));
        
        if (usertoadd!=null){
            userService.addConnection(me.getUid(), usertoadd.getUid());
            updateService.broadcastMyaddingConnection(me.getUid(), usertoadd.getUid());
            notificationService.notifyConnected(usertoadd.getUid(), me.getUid());
            return "addsuccess";
        }else {
            return "fail";
        }
    }
    
    
    
    public User getUsertoremove() {
        return usertoremove;
    }

    public void setUsertoremove(User usertoremove) {
        this.usertoremove = usertoremove;
    }

    public User getUsertoadd() {
        return usertoadd;
    }

    public void setUsertoadd(User usertoadd) {
        this.usertoadd = usertoadd;
    }
    
    public String getUidtoremovestr() {
        return uidtoremovestr;
    }

    public void setUidtoremovestr(String uidtoremovestr) {
        this.uidtoremovestr = uidtoremovestr;
    }

    public String getUidtoaddstr() {
        return uidtoaddstr;
    }

    public void setUidtoaddstr(String uidtoaddstr) {
        this.uidtoaddstr = uidtoaddstr;
    }
    
    private Map<String, Object> getSession(){
        return ActionContext.getContext().getSession();
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
