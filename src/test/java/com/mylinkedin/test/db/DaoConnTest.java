/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.test.db;

import com.mylinkedin.dao.CompanyDao;
import com.mylinkedin.dao.LanguageDao;
import com.mylinkedin.dao.NotificationDao;
import com.mylinkedin.dao.SkillDao;
import com.mylinkedin.dao.UniversityDao;
import com.mylinkedin.dao.UpdateDao;
import com.mylinkedin.dao.UserDao;
import com.mylinkedin.domain.Company;
import com.mylinkedin.domain.Language;
import com.mylinkedin.domain.Notification;
import com.mylinkedin.domain.Skill;
import com.mylinkedin.domain.University;
import com.mylinkedin.domain.Updates;
import com.mylinkedin.domain.User;
import com.mylinkedin.test.utils.SpringUtils;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.junit.Test;

/**
 *
 * @author superman90
 */
public class DaoConnTest extends SpringUtils {
    
    public DaoConnTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    private void dodatainit(CompanyDao companyDao,
                            LanguageDao languageDao,
                            NotificationDao notificationDao,
                            SkillDao skillDao,
                            UniversityDao universityDao,
                            UpdateDao updateDao,
                            UserDao userDao){
        
        int n=6;
        
        for (int i=1; i<n; i++){
            Company cp = new Company();
            cp.setCp_name("Company"+i);
            
            companyDao.createCompany(cp);
        }
        
        for (int i=1; i<n; i++){
            Language lg = new Language();
            
            lg.setLang_name("Language"+i);
            
            languageDao.createLanguage(lg);
        }
        
        for (int i=1; i<n; i++){
            Notification nf = new Notification();
            
            nf.setNt_content("Notification_content"+i);
            nf.setNt_datetime(new Date());
            nf.setNt_read("false");
            nf.setNt_type(1L);
            
            notificationDao.createNotification(nf);
            
        }
        
        for (int i=1; i<n; i++){
            
            Skill sk = new Skill();
            
            sk.setSk_name("Skill"+i);
            
            skillDao.createSkill(sk);
            
        }
        
        for (int i=1; i<n; i++){
            
            University uni = new University();
            
            uni.setUni_name("University"+i);
            
            universityDao.creatUniversity(uni);
            
        }
        
        for (int i=1; i<n; i++){
            
            Updates up = new Updates();
            
            up.setUp_content("Update"+i);
            up.setUp_datetime(new Date());
            up.setUp_type(1L);
            
            updateDao.createUpdate(up);
            
        }        
        
        for (int i=1; i<n; i++){
            User user = new User();
            user.setFname("fname_"+i);
            user.setLname("lname_"+i);
            user.setEmail("u"+i+"@u.com");
            user.setPd("u"+i);
            user.setLocation("location"+i);
            userDao.createUser(user);            
        }
        
    }
    
    @Test
    public void daotest(){
        
        CompanyDao companyDao = (CompanyDao) context.getBean("companyDao");
        LanguageDao languageDao = (LanguageDao) context.getBean("languageDao");
        NotificationDao notificationDao = (NotificationDao) context.getBean("notificationDao");
        SkillDao skillDao = (SkillDao) context.getBean("skillDao");        
        UniversityDao universityDao = (UniversityDao) context.getBean("universityDao");
        UpdateDao updateDao = (UpdateDao) context.getBean("updateDao");
        UserDao userDao = (UserDao) context.getBean("userDao");
        
//        this.dodatainit(companyDao, languageDao, notificationDao, skillDao, universityDao, updateDao, userDao);
        
//        companyDao.test();
//        languageDao.test();
//        notificationDao.test();
//        skillDao.test();
//        universityDao.test();
//        updateDao.test();        
//        userDao.test();
        
//        User me = userDao.getUserbyId(1L);
//        
//        List<Company> cps = companyDao.listCompanies();
//        
//        HashSet<Company> thecps = new HashSet();
//        
//        for (Company cp : cps){
//            thecps.add(cp);
//        }
//        
//        me.setCompanies(thecps);
//        
//        userDao.updateUser(me);
        
        
        
        
//        List<User> allusers= userDao.listUsers();
//        HashSet<User> theusers = new HashSet();
//        
//        User me = userDao.getUserbyId(1L);
//        
//        for (User u : allusers){
//            if (u.getUid()!= 1L){
//                theusers.add(u);
//            }
//        }
//        
//        me.setConnections(theusers);
//        
//        
//        userDao.updateUser(me);
        
        
//        User u= userDao.getUserbyEmail("u1@u.com");
        
        
//        List<User> users = userDao.listConnections(1L);
        
        
//        List<User> users = userDao.listUserconnectingMe(userDao.getUserbyId(2L));
        
        
        
                
    }
    
    @Test
    public void servicetest(){
        
//        UserDao userDao = (UserDao) context.getBean("userDao");
//        
//        userDao.test();
        
        
    }
    
}
