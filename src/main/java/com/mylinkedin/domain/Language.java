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
public class Language implements Serializable{
    private Long langid;
    private String lang_name;
    private Set<User> users;

    public Long getLangid() {
        return langid;
    }

    public void setLangid(Long langid) {
        this.langid = langid;
    }

    public String getLang_name() {
        return lang_name;
    }

    public void setLang_name(String lang_name) {
        this.lang_name = lang_name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
