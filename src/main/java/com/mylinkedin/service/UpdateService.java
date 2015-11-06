/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service;

import com.mylinkedin.domain.Updates;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author superman90
 */
public interface UpdateService {
    
    public List<Updates> listUpdates(Serializable uid);
    
    public void broadcastMyaddingConnection(
                Serializable uid, Serializable tobeaddeduid);   
    
}
