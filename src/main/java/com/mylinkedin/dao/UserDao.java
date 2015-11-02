/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.dao;

import com.mylinkedin.domain.User;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author superman90
 */
public interface UserDao {
    
    public Long createUser(User user);
    public void updateUser(User user);
    public List<User> listUsers();
    
    public User getUserbyId(Serializable uid);
    public List<User> getUsersbyEmail(String email);
    
    public List<User> listConnections(Serializable uid);
    public List<User> listUserconnectingMe(User me);
    public List<User> listUserconnectingMe(Serializable uid);
    
    public List<User> listTopNConnectedUser(int N);
    
    public void test();
    
}
