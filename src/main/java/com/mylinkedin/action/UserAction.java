/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.action;

import com.mylinkedin.domain.User;
import com.mylinkedin.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.struts2.interceptor.validation.SkipValidation;

/**
 *
 * @author superman90
 */
public class UserAction extends ActionSupport {
    
    private final String DEFAULT_PHOTO_URL = "img/default_icon.jpg";
    private final String DEFAULT_PHOTO_URL_F = "img/default_icon_f.jpg";
    private final String DEFAULT_LOCATION="default_location";
    
    private UserService userService;
    
    //form1
    private String logemail=new String();
    private String logpd=new String();
    
    //form2
    private String email=new String();
    private String pd[]={"",""};
    private String fname=new String();
    private String lname=new String();
    private String gender=new String();
    private String longitudestr= new String();
    private String lantitudestr= new String();

    
    private Map<String, Object> getSession(){
        return ActionContext.getContext().getSession();
    }
    
    @Override
    public void validate() {
//        Pattern p = Pattern.compile("a*b");
//        Matcher m = p.matcher("aaaaab");
//        boolean b = m.matches();
        Pattern p = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
        Matcher m;
        
       if (logemail.trim().isEmpty()){
            //register validation
            if (email.trim().isEmpty()){
                this.addFieldError("email", "You need to enter an email address");
            }else{
                m=p.matcher(email);
                if (m.matches()){
                    if (this.userService.checkEmailExist(email)){
                        this.addFieldError("email", "The email you enter has already exsited");
                    }
                }else{
                    this.addFieldError("email", "Please enter a valid email");
                }
            }
            
            if (pd[0].isEmpty()||pd[1].isEmpty()){
                this.addFieldError("pd", "Password cannot be none");
            }else{
                if (!pd[0].equals(pd[1])){
                    this.addFieldError("pd", "Two passwords you enter don't match");
                } 
            }
            
            if (fname.trim().isEmpty()){
                this.addFieldError("fname", "You need enter your first name");
            }
            
            if (lname.trim().isEmpty()){
                this.addFieldError("lname", "You need enter your last name");
            }
            
        }else{
            //login validation
            m=p.matcher(logemail);
            if (m.matches()){
                if (logpd.isEmpty()){
                    this.addFieldError("logpd", "Please enter your password");
                }
            }else{
                this.addFieldError("logemail", "Please enter a valid email");
            }
           
        }
    }

    public String login(){
        
        List<User> userlist = this.userService.getUsersbyEmail(logemail);
        
        if (userlist.size()!=1){
            this.addActionError("Email or Password is incorrect");
            return INPUT;
        }else{
            if (!userlist.get(0).getPd().equals(logpd)){
                this.addActionError("Email or Password is incorrect");
                return INPUT;
            } 
        }
        
        User me = userlist.get(0);
        
        me.setLongitudestr(longitudestr);
        me.setLantitudestr(lantitudestr);
        
        userService.updateUser(me);
        
        getSession().put("me", me);
        
        return SUCCESS;
    }
    
    public String register(){
        
        Long uid;
        
//        Long uid = (Long) userService.createUser(email, pd[0], fname, lname, gender, 
//                        DEFAULT_PHOTO_URL, DEFAULT_LOCATION);
        if (gender.equals("Female")){
            uid = (Long) userService.createUser2(email, pd[0], fname, lname, gender, 
                        DEFAULT_PHOTO_URL_F, DEFAULT_LOCATION,longitudestr,lantitudestr);
        }else{
            uid = (Long) userService.createUser2(email, pd[0], fname, lname, gender, 
                        DEFAULT_PHOTO_URL, DEFAULT_LOCATION,longitudestr,lantitudestr);
        }

        
        
        getSession().put("me", userService.getUserbyId(uid));
        
        return SUCCESS;
    }
    @SkipValidation()
    public String logout(){
        
        getSession().remove("me");
        
        return INPUT;
    }
    
    
    
    
    
    public String getLongitudestr() {
        return longitudestr;
    }

    public void setLongitudestr(String longitudestr) {
        this.longitudestr = longitudestr;
    }

    public String getLantitudestr() {
        return lantitudestr;
    }

    public void setLantitudestr(String lantitudestr) {
        this.lantitudestr = lantitudestr;
    }
    
    
    public String getLogemail() {
        return logemail;
    }

    public void setLogemail(String logemail) {
        this.logemail = logemail;
    }

    public String getLogpd() {
        return logpd;
    }

    public void setLogpd(String logpd) {
        this.logpd = logpd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getPd() {
        return pd;
    }

    public void setPd(String[] pd) {
        this.pd = pd;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    
}