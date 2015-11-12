/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.dao;

import com.mylinkedin.action.bean.Page;
import com.mylinkedin.domain.User;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 *
 * @author superman90
 */
public interface UserDao {
    
    public Long createUser(User user);
    public void updateUser(User user);
    public List<User> listUsers();
    
    public User getUserbyId(Serializable uid);
    public List<User> getUsersbyEmail(String email);
    
    public List<User> listConnections(Serializable uid);
    public List<User> listUserconnectingMe(User me);
    public List<User> listUserconnectingMe(Serializable uid);
    
    public List<User> listTopNConnectedUser(int N);
    
    public List<User> searchUserLike(
            Map<String, String[]> paras ,
            boolean andcondition
            );
    public Page<User> searchUserLike_p(
            Map<String, String[]> paras ,
            boolean andcondition,
            int pageNum
            );
    
    @Deprecated
    public User fetchallbyUid(Serializable uid);
    
    public List<User> listuserwithUni(Serializable uniid);
    public List<User> listuserwithSk(Serializable skid);
    public List<User> listuserwithCp(Serializable cpid);
    public List<User> listuserwithLang(Serializable lang_id);
    
    
    
    public void test();

    public Boolean checkConHas(Long myuid, Long otheruid);
    
}
