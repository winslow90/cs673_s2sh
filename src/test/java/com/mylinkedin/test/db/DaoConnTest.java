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
import com.mylinkedin.domain.Languages;
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
            Languages lg = new Languages();
            
            lg.setLang_name("Language"+i);
            
            languageDao.createLanguage(lg);
        }
        
        for (int i=1; i<n; i++){
            Notification nf = new Notification();
            
            nf.setNt_content("Notification_content"+i);
            nf.setNt_datetime(new Date());
            nf.setNt_read(false);
            nf.setNt_type(1L);
            nf.setRelating_uid(3L);
            
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
            up.setUp_read(false);
            up.setUp_type(1L);
            up.setRelating_uid(2L);
            up.setRelating_photo_url("img/default_icon.jpg");
            
            updateDao.createUpdate(up);
            
        }        
        
        for (int i=1; i<205; i++){
            User user = new User();
            user.setFname("fname_"+i);
            user.setLname("lname_"+i);
            user.setEmail("u"+i+"@u.com");
            user.setPd("u"+i);
            user.setLocation("location"+i);
            user.setPhoto_url("img/default_icon.jpg");
            userDao.createUser(user);            
        }
        
    }
    
    private void userDaoTest(CompanyDao companyDao,
                            LanguageDao languageDao,
                            NotificationDao notificationDao,
                            SkillDao skillDao,
                            UniversityDao universityDao,
                            UpdateDao updateDao,
                            UserDao userDao){
        this.dodatainit(companyDao, languageDao, notificationDao, skillDao, universityDao, updateDao, userDao);
        

        
        User me = userDao.getUserbyId(1L);
        
        List<Company> cps = companyDao.listCompanies();
        
        HashSet<Company> thecps = new HashSet();
        
        for (Company cp : cps){
            thecps.add(cp);
        }
        
        me.setCompanies(thecps);
        
        userDao.updateUser(me);
        
        
        
        
//        List<User> allusers= userDao.listUsers();
//        HashSet<User> theusers = new HashSet();
//        
//        User me2 = userDao.getUserbyId(1L);
//        
//        for (User u : allusers){
//            if (u.getUid()!= 1L){
//                theusers.add(u);
//            }
//        }
//        
//        me2.setConnections(theusers);
//        
//        
//        userDao.updateUser(me2);
    
        List<User> allusers= userDao.listUsers();
        HashSet<User> theusers = new HashSet();
        
        User me2 = userDao.getUserbyId(1L);
        
        for(Long i = 2L;i<8;i++){
            User theu = userDao.getUserbyId(i);
            theusers.add(theu);
        }
        
        me2.setConnections(theusers);
        
        
        userDao.updateUser(me2);  
        
//        User u= userDao.getUsersbyEmail("u1@u.com");
        
        
//        List<User> users = userDao.listConnections(1L);
        
        
//        List<User> users = userDao.listUserconnectingMe(userDao.getUserbyId(2L));
    }
    
        private void notificationDaoTest(CompanyDao companyDao,
                            LanguageDao languageDao,
                            NotificationDao notificationDao,
                            SkillDao skillDao,
                            UniversityDao universityDao,
                            UpdateDao updateDao,
                            UserDao userDao){
            
            List<Notification> ntfs=notificationDao.listNotifications();

            User me = userDao.getUserbyId(1L);

            me.setNotifications(new HashSet<>(ntfs));

            userDao.updateUser(me);        


            List<Notification> ntfs2=notificationDao.listNotifications();

            for (int i = ntfs2.size()/2; i <ntfs2.size();i++){
                notificationDao.invalidateNotification(ntfs2.get(i));
            }

            List<Notification> ntfs3=notificationDao.listNotificationsbyUid(1L);
            List<Notification> ntfs4=notificationDao.listValidNotificationbyUid(1L);
        }
        
        
        private void updateDaoTest(CompanyDao companyDao,
                            LanguageDao languageDao,
                            NotificationDao notificationDao,
                            SkillDao skillDao,
                            UniversityDao universityDao,
                            UpdateDao updateDao,
                            UserDao userDao){
            List<Updates> ups1=updateDao.listUpdates();

            User me = userDao.getUserbyId(1L);

            me.setUpdates(new HashSet(new HashSet(ups1)));
            
            userDao.updateUser(me);        


            List<Updates> ups2=updateDao.listUpdates();

            for (int i = ups2.size()/2; i <ups2.size();i++){
                updateDao.invalidateUpdate(ups2.get(i));
            }

            List<Updates> ups3 = updateDao.listUpdatebyUid(1L);
            List<Updates> ups4 = updateDao.listValidUpdatebyUid(1L);
        }
        
        
        private void otherTest(CompanyDao companyDao,
                            LanguageDao languageDao,
                            NotificationDao notificationDao,
                            SkillDao skillDao,
                            UniversityDao universityDao,
                            UpdateDao updateDao,
                            UserDao userDao){
            List<University> unis1 = universityDao.listUniversities();
        
            User me = userDao.getUserbyId(1L);
            me.setUniversities(new HashSet(unis1));

            userDao.updateUser(me);

            List<University> unis2 = universityDao.listUniversitiesbyUid(1L);

            University uni1= universityDao.getUniversitybyId(1L);
            University uni2= universityDao.getUniversitybyName("University2");


            List<Skill> sks=skillDao.listSkills();
            List<Company> cps=companyDao.listCompanies();
            

            User me2 = userDao.getUserbyId(1L);

            me2.setSkills(new HashSet(sks));
            me2.setCompanies(new HashSet(cps));
            

            userDao.updateUser(me2);
            
            
            List<Languages> langs= languageDao.listLanguage();
        
            HashSet<Languages> langsset = new HashSet(langs);
               
            User me3= userDao.getUserbyId(1L);
        
            me3.setLanguages(langsset);
        
            userDao.updateUser(me3);
            
        }
    
    @Test
    public void daotest(){
        
//        CompanyDao companyDao = (CompanyDao) context.getBean("companyDao");
//        LanguageDao languageDao = (LanguageDao) context.getBean("languageDao");
//        NotificationDao notificationDao = (NotificationDao) context.getBean("notificationDao");
//        SkillDao skillDao = (SkillDao) context.getBean("skillDao");        
//        UniversityDao universityDao = (UniversityDao) context.getBean("universityDao");
//        UpdateDao updateDao = (UpdateDao) context.getBean("updateDao");
//        UserDao userDao = (UserDao) context.getBean("userDao");
//        
//        this.userDaoTest(companyDao, languageDao, notificationDao, skillDao, universityDao, updateDao, userDao);
//        this.notificationDaoTest(companyDao, languageDao, notificationDao, skillDao, universityDao, updateDao, userDao);
//        this.updateDaoTest(companyDao, languageDao, notificationDao, skillDao, universityDao, updateDao, userDao);
//        this.otherTest(companyDao, languageDao, notificationDao, skillDao, universityDao, updateDao, userDao);
        
//        companyDao.test();
//        languageDao.test();
//        notificationDao.test();
//        skillDao.test();
//        universityDao.test();
//        updateDao.test();        
//        userDao.test();
//        

        
//        
//        Boolean result = userDao.checkConHas(3L, 1L);
//        
        
        
//        Long count = userDao.getUserCount();
//        
//        System.out.println(count);
        
                
    }
    
}
