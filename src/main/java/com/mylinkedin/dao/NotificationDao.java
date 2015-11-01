/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.dao;

import com.mylinkedin.domain.Notification;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author superman90
 */
public interface NotificationDao {
    
    public Long createNotification(Notification notification);
    public void updateNotification(Notification notification);
    public List<Notification> listNotifications();
    
    public List<Notification> listNotificationsbyUid(Serializable uid);
    
    public void invalidateNotification(Notification nf);
    public List<Notification> listValidNotificationbyUid(Serializable uid);
    
    
    public void test();
    
}
