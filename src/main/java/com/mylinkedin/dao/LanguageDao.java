/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.dao;

import com.mylinkedin.domain.Languages;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author superman90
 */
public interface LanguageDao {
    
    public Long createLanguage(Languages language);
    public void updateLanguage(Languages language);
    public List<Languages> listLanguage();
    
    public List<Languages> listLanguagesbyUid(Serializable uid);
    public Languages getLanguagebyId(Serializable langid);
    public Languages getLanguagebyName(String langname);
    
    public void test();
    
}
