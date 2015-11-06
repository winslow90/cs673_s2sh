/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service;

import com.mylinkedin.domain.Notification;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author superman90
 */
public interface NotificationService {
    
    public List<Notification> listNotifications(Serializable uid);
    
    public void notifyConnected(Serializable touid, 
                        Serializable fromuid);
    
}
