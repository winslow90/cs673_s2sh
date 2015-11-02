/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service.impl;

import com.mylinkedin.dao.NotificationDao;
import com.mylinkedin.dao.UserDao;
import com.mylinkedin.service.NotificationService;

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

    
    
}
