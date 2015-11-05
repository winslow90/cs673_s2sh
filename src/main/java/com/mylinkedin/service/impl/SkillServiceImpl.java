/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service.impl;

import com.mylinkedin.dao.SkillDao;
import com.mylinkedin.dao.UserDao;
import com.mylinkedin.domain.Skill;
import com.mylinkedin.domain.User;
import com.mylinkedin.service.SkillService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author superman90
 */
public class SkillServiceImpl implements SkillService {
    UserDao userDao;
    SkillDao skillDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setSkillDao(SkillDao skillDao) {
        this.skillDao = skillDao;
    }

    @Override
    public List<Skill> listSkills() {
        return skillDao.listSkills();
    }

    @Override
    public List<Skill> listSkillsbyUid(Serializable uid) {
        return skillDao.listSkillsbyUid(uid);
    }

    @Override
    public void updateSkillsbySkName(Serializable uid, String[] skNames) {
        User me = userDao.getUserbyId(uid);
        HashSet<Skill> sks= new HashSet();
        
        for (String skname : skNames){
            Skill sk = skillDao.getSkillbyName(skname);
            if ((sk!=null)&&(!sks.contains(sk))){
                sks.add(sk);
            }
        }
        
        me.setSkills(sks);
        userDao.updateUser(me);
    }

    @Override
    public void updateSkillsbySkIds(Long uid, ArrayList<Long> myskids) {
        User me = userDao.getUserbyId(uid);
        HashSet<Skill> sks= new HashSet();
        
        for (Long skid : myskids){
            Skill sk = skillDao.getSkillbyId(skid);
            if ((sk!=null)&&(!sks.contains(sk))){
                sks.add(sk);
            }
        }
        
        me.setSkills(sks);
        userDao.updateUser(me);
    }
    
    
    
}
