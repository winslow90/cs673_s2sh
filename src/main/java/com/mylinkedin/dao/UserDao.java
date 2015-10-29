/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.dao;

import com.mylinkedin.domain.User;

/**
 *
 * @author superman90
 */
public interface UserDao {
    Long createUser(User user);
    
}
