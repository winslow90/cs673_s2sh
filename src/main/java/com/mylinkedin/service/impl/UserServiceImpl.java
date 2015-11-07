/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service.impl;

import com.mylinkedin.dao.UserDao;
import com.mylinkedin.domain.Company;
import com.mylinkedin.domain.Languages;
import com.mylinkedin.domain.Skill;
import com.mylinkedin.domain.University;
import com.mylinkedin.domain.User;
import com.mylinkedin.service.UserService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author superman90
 */
public class UserServiceImpl implements UserService {
    
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Serializable createUser(String email, String pd, String fname, String lname, String gender, String photo_url, String location) {
        User newuser = new User();
        
        newuser.setEmail(email);
        newuser.setPd(pd);
        newuser.setFname(fname);
        newuser.setLname(lname);
        newuser.setGender(gender);
        newuser.setPhoto_url(photo_url);
        newuser.setLocation(location);
        
        return userDao.createUser(newuser);
        
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public List<User> getUsersbyEmail(String email) {
        return userDao.getUsersbyEmail(email);
    }

    @Override
    public User getUserbyId(Serializable uid) {
        return userDao.getUserbyId(uid);
    }

    @Override
    public Boolean checkEmailExist(String email) {
        return userDao.getUsersbyEmail(email).size()>0;
    }

    @Override
    public List<User> getConnection(Serializable uid) {
        return userDao.listConnections(uid);
    }

    @Override
    public void removeConnection(Serializable uid, Serializable touid) {
        
        HashSet<User> conns= new HashSet(userDao.listConnections(uid));
        User me=userDao.getUserbyId(uid);
        User toremove = userDao.getUserbyId(touid);
        
        
        if (conns.contains(toremove)){
            conns.remove(toremove);            
            me.setConnections(conns);
            userDao.updateUser(me);
        }
    }

    @Override
    public void addConnection(Serializable uid, Serializable touid) {
        
        HashSet<User> conns= new HashSet(userDao.listConnections(uid));
        User me=userDao.getUserbyId(uid);
        User toappend = userDao.getUserbyId(touid);
        
        
        if (!conns.contains(toappend)){
            conns.add(toappend);
            me.setConnections(conns);
            userDao.updateUser(me);
        }        
    }

    @Override
    public void updateUserIcon(Serializable myuid, String photo_url) {
        
        User me = userDao.getUserbyId(myuid);
        
        me.setPhoto_url(photo_url);
        
        userDao.updateUser(me);
    }
    
    @Override
    public Boolean checkConHas(Long myuid, Long otheruid) {
        if (!myuid.equals(otheruid)){
            return userDao.checkConHas(myuid,otheruid);
        }else{
            return null;
        }
    }
    
    @Override
    public List<User> listrecommendation(Long myuid, Long n) {
        
        User me = userDao.fetchallbyUid(myuid);
        Set<University> myunis=me.getUniversities();
        Set<Skill> mysks=me.getSkills();
        Set<Company> mycps=me.getCompanies();
        Set<Languages> mylangs=me.getLanguages();
        
        HashMap<Long , User> rawresultmap= new HashMap();
        ArrayList<User> rawresultls;
        ArrayList<User> result;
        
        Long count;
        
        for (University uni : myunis){
            List<User> temp = userDao.listuserwithUni(uni.getUniid());
            for (User u : temp){
                if (!rawresultmap.containsKey(u.getUid())){
                    rawresultmap.put(u.getUid(), u);
                }
            }
        }
        for (Skill sk : mysks){
            List<User> temp = userDao.listuserwithSk(sk.getSkid());
            for (User u : temp){
                if (!rawresultmap.containsKey(u.getUid())){
                    rawresultmap.put(u.getUid(), u);
                }
            }
        }
        for (Company cp : mycps){
            List<User> temp = userDao.listuserwithCp(cp.getCpid());
            for (User u : temp){
                if (!rawresultmap.containsKey(u.getUid())){
                    rawresultmap.put(u.getUid(), u);
                }
            }
        }
        for (Languages lang : mylangs){
            List<User> temp = userDao.listuserwithLang(lang.getLang_id());
            for (User u : temp){
                if (!rawresultmap.containsKey(u.getUid())){
                    rawresultmap.put(u.getUid(), u);
                }
            }
        }
        
        if (rawresultmap.containsKey(myuid)){
            rawresultmap.remove(myuid);
        }
        rawresultls = new ArrayList();
        for (Entry<Long,User> entry : rawresultmap.entrySet()){
            rawresultls.add(entry.getValue());
        }     
        
        
        count=0L;
        Random rand= new Random(new Date().getTime());
        int nextindex;
        result=new ArrayList();
        while (count<n){
            nextindex = Math.abs(rand.nextInt())%rawresultls.size();
            
            if (rawresultls.get(nextindex)!=null){
                result.add(rawresultls.get(nextindex));
                rawresultls.set(nextindex, null);
            }
        }
        
        return result;
    }
    
    @Override
    public List<User> listTopNConnectedUsers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




    

    
}
