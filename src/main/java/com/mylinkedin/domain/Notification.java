/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.domain;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author superman90
 */
public class Notification implements Serializable {
    
    private Long ntid;
    private Long nt_type;
    private String nt_content;
    private Date nt_datetime;
    private Boolean nt_read;

    public Boolean getNt_read() {
        return nt_read;
    }

    public void setNt_read(Boolean nt_read) {
        this.nt_read = nt_read;
    }
    
    private User user;

    public Long getNtid() {
        return ntid;
    }

    public void setNtid(Long ntid) {
        this.ntid = ntid;
    }

    public Long getNt_type() {
        return nt_type;
    }

    public void setNt_type(Long nt_type) {
        this.nt_type = nt_type;
    }

    public String getNt_content() {
        return nt_content;
    }

    public void setNt_content(String nt_content) {
        this.nt_content = nt_content;
    }

    public Date getNt_datetime() {
        return nt_datetime;
    }

    public void setNt_datetime(Date nt_datetime) {
        this.nt_datetime = nt_datetime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
}
