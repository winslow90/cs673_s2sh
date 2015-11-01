/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.dao;

import com.mylinkedin.domain.Updates;
import java.io.Serializable;
import java.util.List;


/**
 *
 * @author superman90
 */
public interface UpdateDao {
    
    public Long createUpdate(Updates update);
    public void updateUpdate(Updates update);
    public List<Updates> listupdates();
    
    public List<Updates> listUpdatebyUid(Serializable uid);
    public void invalidateUpdate(Updates ntf);
    public List<Updates> listValidUpdatebyUid(Serializable uid);
    
    public void test();
    
}
