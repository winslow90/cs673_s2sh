/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service.impl;

import com.mylinkedin.dao.UpdateDao;
import com.mylinkedin.dao.UserDao;
import com.mylinkedin.domain.Updates;
import com.mylinkedin.domain.User;
import com.mylinkedin.service.UpdateService;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author superman90
 */
public class UpdateServiceImpl implements UpdateService {
    UpdateDao updateDao;
    UserDao userDao;

    public void setUpdateDao(UpdateDao updateDao) {
        this.updateDao = updateDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<Updates> listUpdates(Serializable uid) {
        return updateDao.listUpdatebyUid(uid);
    }

    @Override
    public void broadcastMyaddingConnection(Serializable uid, Serializable tobeaddeduid) {
        
        List<User> receivers = userDao.listUserconnectingMe(uid);
        
        User me = userDao.getUserbyId(uid);
        User added =userDao.getUserbyId(tobeaddeduid);
        
        for (User receiver : receivers){
            Updates up = new Updates();
            up.setUp_type(1L);
            up.setUp_content(
                    me.getFname()+" "+me.getLname()+"has just connectted "+added.getFname()+added.getLname()+"<br/>"+
                    "Do you interest him or her?"
                );
            up.setUp_datetime(new Date());
            up.setUp_read(Boolean.FALSE);
            up.setRelating_uid(added.getUid());
            up.setRelating_photo_url(me.getPhoto_url());
            up.setUser(receiver);
            updateDao.createUpdate(up);
        }
        
    }
    
}
