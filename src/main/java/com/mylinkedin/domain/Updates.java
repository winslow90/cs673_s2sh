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
public class Updates implements Serializable {
    
    private Long upid;
    private Long up_type;
    private String up_content;
    private Date up_datetime;
    private Boolean up_read;
    
    private Long relating_uid;
    private String relating_photo_url;

    
    

    
    private User user;
    
    
    public String getRelating_photo_url() {
        return relating_photo_url;
    }

    public void setRelating_photo_url(String relating_photo_url) {
        this.relating_photo_url = relating_photo_url;
    }
    
    public Long getRelating_uid() {
        return relating_uid;
    }

    public void setRelating_uid(Long relating_uid) {
        this.relating_uid = relating_uid;
    }
    
    public Boolean getUp_read() {
        return up_read;
    }

    public void setUp_read(Boolean up_read) {
        this.up_read = up_read;
    }
    
    public Long getUpid() {
        return upid;
    }

    public void setUpid(Long upid) {
        this.upid = upid;
    }

    public Long getUp_type() {
        return up_type;
    }

    public void setUp_type(Long up_type) {
        this.up_type = up_type;
    }

    public String getUp_content() {
        return up_content;
    }

    public void setUp_content(String up_content) {
        this.up_content = up_content;
    }

    public Date getUp_datetime() {
        return up_datetime;
    }

    public void setUp_datetime(Date up_datetime) {
        this.up_datetime = up_datetime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    
}
