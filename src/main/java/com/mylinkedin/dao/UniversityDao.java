/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.dao;

import com.mylinkedin.domain.University;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author superman90
 */
public interface UniversityDao {
    
    public Long creatUniversity(University university);
    public void updateUniversity(University university);
    public List<University> listUniversities();
    
    public List<University> listUniversitiesbyUid(Serializable uid);
    public University getUniversitybyId(Serializable uniid);
    public University getUniversitybyName(String uniname);
    
    public void test();
    
}
