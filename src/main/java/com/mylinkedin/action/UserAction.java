/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.action;

import com.mylinkedin.domain.User;
import com.mylinkedin.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author superman90
 */
public class UserAction extends ActionSupport {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
    public String saveUser(){
        
//        User user = new User();
//        
//        user.setEmail("liwentao90@yahoo.com");
//        user.setFname("Winslow");
//        user.setLname("Leigh");
//        
//        userService.saveUser(user);
//        
        return SUCCESS;
    }
    
}
