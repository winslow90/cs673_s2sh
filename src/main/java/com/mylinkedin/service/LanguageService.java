/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.service;

import com.mylinkedin.domain.Languages;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author superman90
 */
public interface LanguageService {
    
    public List<Languages> listLanguages();
    public List<Languages> listLanguagesUid(Serializable uid);
    
    public void updateLanguagesbyLangName(Serializable uid,
            String[] langNames);

    public void updateLanguagesbyLangIds(Long uid, List<Long> mylangids);
    
}
