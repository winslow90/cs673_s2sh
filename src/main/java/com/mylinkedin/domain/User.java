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
public class User implements Serializable {
    
    //basic fields
    private Long uid;
    private String email;
    private String pd;
    private String fname;
    private String lname;
    private String gender;
    private String summary;
    private String photo_url;
    private String location;

    //many-to-many fields
    private Set<University> universities;
    private Set<Skill> skills;
    private Set<Company> companies;
    private Set<Language> languages;
    private Set<User> connections;
//    
//    //one-to-many fields
    private Set<Notification> notifications;
    private Set<Updates> updates;

    public Set<Updates> getUpdates() {
        return updates;
    }

    public void setUpdates(Set<Updates> updates) {
        this.updates = updates;
    }

    public Set<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(Set<Notification> notifications) {
        this.notifications = notifications;
    }

    public Set<User> getConnections() {
        return connections;
    }

    public void setConnections(Set<User> connections) {
        this.connections = connections;
    }

    public Set<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<Language> languages) {
        this.languages = languages;
    }

    public Set<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(Set<Company> companies) {
        this.companies = companies;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    public Set<University> getUniversities() {
        return universities;
    }

    public void setUniversities(Set<University> universities) {
        this.universities = universities;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPd() {
        return pd;
    }

    public void setPd(String pd) {
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

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
