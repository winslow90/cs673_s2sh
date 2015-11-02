/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service.impl;

import com.mylinkedin.dao.NotificationDao;
import com.mylinkedin.dao.UserDao;
import com.mylinkedin.domain.Notification;
import com.mylinkedin.domain.User;
import com.mylinkedin.service.NotificationService;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author superman90
 */
public class NotificationServiceImpl implements NotificationService {
    
    NotificationDao notificationDao;
    UserDao userDao;

    public void setNotificationDao(NotificationDao notificationDao) {
        this.notificationDao = notificationDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<Notification> listNotifications(Serializable uid) {
        return notificationDao.listNotifications();
    }

    @Override
    public void notifyConnected(Serializable touid, Serializable fromuid) {
        
        User me = userDao.getUserbyId(fromuid);
        User other= userDao.getUserbyId(touid);
        
        Notification ntf = new Notification();
        
        ntf.setNt_type(1L);
        ntf.setNt_content(
                other.getFname()+other.getLname()+"has just connected you."
                );
        ntf.setNt_datetime(new Date());
        ntf.setNt_read(Boolean.FALSE);
        
        ntf.setUser(other);
        
        notificationDao.createNotification(ntf);
        
        
    }

    
    
}
