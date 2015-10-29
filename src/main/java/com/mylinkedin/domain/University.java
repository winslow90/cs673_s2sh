/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.domain;

import java.io.Serializable;
import java.util.Set;

/**
 *
 * @author superman90
 */
public class University implements Serializable{
    private Long uniid;
    private String uni_name;
    private String icon_url;
    
    private Set<User> users;

    public Long getUniid() {
        return uniid;
    }

    public void setUniid(Long uniid) {
        this.uniid = uniid;
    }

    public String getUni_name() {
        return uni_name;
    }

    public void setUni_name(String uni_name) {
        this.uni_name = uni_name;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
