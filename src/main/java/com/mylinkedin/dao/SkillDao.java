/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.dao;

import com.mylinkedin.domain.Skill;
import java.util.List;


/**
 *
 * @author superman90
 */
public interface SkillDao {
    
    public Long createSkill(Skill skill);
    public void updateSkill(Skill skill);
    public List<Skill> listSkills();
    
    public void test();
    
}
