/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.dao;

import com.mylinkedin.domain.Language;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author superman90
 */
public interface LanguageDao {
    
    public Long createLanguage(Language language);
    public void updateLanguage(Language language);
    public List<Language> listLanguage();
    
    public List<Language> listLanguagesbyUid(Serializable uid);
    public Language getLanguagebyId(Serializable langid);
    public Language getLanguagebyName(String langname);
    
    public void test();
    
}
