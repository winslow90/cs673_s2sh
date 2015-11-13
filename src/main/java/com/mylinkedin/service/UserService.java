/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service;

import com.mylinkedin.domain.User;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author superman90
 */
public interface UserService {
    @Deprecated
    public Serializable createUser(
            String email,
            String pd,
            String fname,
            String lname,
            String gender,
            String photo_url,
            String location
            );
    public Serializable createUser2(
            String email,
            String pd,
            String fname,
            String lname,
            String gender,
            String photo_url,
            String location,
            String longitudestr,
            String lantitudestr
            );
    public void updateUser(User user);
    public List<User> getUsersbyEmail(String email);
    public User getUserbyId(Serializable uid);
    public Boolean checkEmailExist(String email);
    public List<User> getConnection(Serializable uid);
    public void removeConnection(Serializable uid,Serializable touid);
    public void addConnection(Serializable uid, Serializable touid);
    public void updateUserIcon(Serializable myuid, String photo_url);
    public Boolean checkConHas(Long myuid, Long otheruid);
    
    public List<User> listrecommendation(Long myuid, Long n);
    
    
    public List<User> listTopNConnectedUsers();
    
}
