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
public class Company implements Serializable{
    private Long cpid;
    private String cp_name;
    private String icon_url;
    private Set<User> users;

    public Long getCpid() {
        return cpid;
    }

    public void setCpid(Long cpid) {
        this.cpid = cpid;
    }

    public String getCp_name() {
        return cp_name;
    }

    public void setCp_name(String cp_name) {
        this.cp_name = cp_name;
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
