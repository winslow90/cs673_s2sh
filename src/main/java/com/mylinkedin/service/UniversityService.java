/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service;

import com.mylinkedin.domain.University;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author superman90
 */
public interface UniversityService {
    
    public List<University> listUniversities();
    public List<University> listUniversitiesbyUid(
            Serializable uid);
    
    public void updateUniversitiesbyUniName(Serializable uid,
            String[] uniNames);
    
}
