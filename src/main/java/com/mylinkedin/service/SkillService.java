/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service;

import com.mylinkedin.domain.Skill;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author superman90
 */
public interface SkillService {
    
    public List<Skill> listSkills();
    public List<Skill> listSkillsbyUid(Serializable uid);
    
    public void updateSkillsbySkName(Serializable uid,
            String[] skNames);

    public void updateSkillsbySkIds(Long uid, ArrayList<Long> myskids);
    
}
