/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service.impl;

import com.mylinkedin.dao.UserDao;
import com.mylinkedin.domain.User;
import com.mylinkedin.service.UserService;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author superman90
 */
public class UserServiceImpl implements UserService {
    
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Serializable createUser(String email, String pd, String fname, String lname, String gender, String photo_url, String location) {
        User newuser = new User();
        
        newuser.setEmail(email);
        newuser.setPd(pd);
        newuser.setFname(fname);
        newuser.setLname(lname);
        newuser.setGender(gender);
        newuser.setPhoto_url(photo_url);
        newuser.setLocation(location);
        
        return userDao.createUser(newuser);
        
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public List<User> getUsersbyEmail(String email) {
        return userDao.getUsersbyEmail(email);
    }

    @Override
    public User getUserbyId(Serializable uid) {
        return userDao.getUserbyId(uid);
    }

    @Override
    public Boolean checkEmailExist(String email) {
        return userDao.getUsersbyEmail(email).size()>0;
    }

    @Override
    public List<User> getConnection(Serializable uid) {
        return userDao.listConnections(uid);
    }

    @Override
    public void removeConnection(Serializable uid, Serializable touid) {
        
        HashSet<User> conns= new HashSet(userDao.listConnections(uid));
        User me=userDao.getUserbyId(uid);
        User toremove = userDao.getUserbyId(touid);
        
        
        if (conns.contains(toremove)){
            conns.remove(toremove);            
            me.setConnections(conns);
            userDao.updateUser(me);
        }
    }

    @Override
    public void addConnection(Serializable uid, Serializable touid) {
        
        HashSet<User> conns= new HashSet(userDao.listConnections(uid));
        User me=userDao.getUserbyId(uid);
        User toappend = userDao.getUserbyId(touid);
        
        
        if (!conns.contains(toappend)){
            conns.add(toappend);
            me.setConnections(conns);
            userDao.updateUser(me);
        }        
    }

    @Override
    public void updateUserIcon(Serializable myuid, String photo_url) {
        
        User me = userDao.getUserbyId(myuid);
        
        me.setPhoto_url(photo_url);
        
        userDao.updateUser(me);
    }

    @Override
    public List<User> listTopNConnectedUsers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
