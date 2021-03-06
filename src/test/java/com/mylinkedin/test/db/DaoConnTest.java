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
import java.util.Random;
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
        
        Company cp;
        
        cp = new Company();
        cp.setCp_name("Apple Inc.");
        cp.setIcon_url("img/apple.png");
        companyDao.createCompany(cp);
        
        cp = new Company();
        cp.setCp_name("Facebook, Inc.");
        cp.setIcon_url("img/facebook.png");
        companyDao.createCompany(cp);
        
        cp = new Company();
        cp.setCp_name("Google Inc.");
        cp.setIcon_url("img/google.png");
        companyDao.createCompany(cp);
        
        cp = new Company();
        cp.setCp_name("Microsoft Corporation");
        cp.setIcon_url("img/microsoft.png");
        companyDao.createCompany(cp);
        
        cp = new Company();
        cp.setCp_name("Amazon.com, Inc.");
        cp.setIcon_url("img/amazon.jpg");
        companyDao.createCompany(cp);
        
        
        
        
        
        
        
        
        Languages lg;
        
        lg= new Languages();
        lg.setLang_name("English");
        languageDao.createLanguage(lg);
        
        lg= new Languages();
        lg.setLang_name("Arabic");
        languageDao.createLanguage(lg);
        
        lg= new Languages();
        lg.setLang_name("Bengali");
        languageDao.createLanguage(lg);
        
        lg= new Languages();
        lg.setLang_name("Chinese");
        languageDao.createLanguage(lg);
        
        lg= new Languages();
        lg.setLang_name("Dutch");
        languageDao.createLanguage(lg);
        
        lg= new Languages();
        lg.setLang_name("French");
        languageDao.createLanguage(lg);
        
        lg= new Languages();
        lg.setLang_name("German");
        languageDao.createLanguage(lg);
        
        lg= new Languages();
        lg.setLang_name("Greek");
        languageDao.createLanguage(lg);
        
        lg= new Languages();
        lg.setLang_name("Hindi");
        languageDao.createLanguage(lg);
        
        lg= new Languages();
        lg.setLang_name("Irish");
        languageDao.createLanguage(lg);
        
        lg= new Languages();
        lg.setLang_name("Italian");
        languageDao.createLanguage(lg);
        
        lg= new Languages();
        lg.setLang_name("Japanese");
        languageDao.createLanguage(lg);
        
        lg= new Languages();
        lg.setLang_name("Korean");
        languageDao.createLanguage(lg);
        
        lg= new Languages();
        lg.setLang_name("Russian");
        languageDao.createLanguage(lg);
        
        lg= new Languages();
        lg.setLang_name("Zulu");
        languageDao.createLanguage(lg);
        
        
        
        
        for (int i=1; i<n; i++){
            Notification nf = new Notification();
            
            nf.setNt_content("Notification_content"+i);
            nf.setNt_datetime(new Date());
            nf.setNt_read(false);
            nf.setNt_type(1L);
            nf.setRelating_uid(3L);
            
            notificationDao.createNotification(nf);
            
        }
        
        
        Skill sk;
        
        sk = new Skill();
        sk.setSk_name("MicroSoft Office");
        skillDao.createSkill(sk);
        
        sk = new Skill();
        sk.setSk_name("Customer Service");
        skillDao.createSkill(sk);
        
        sk = new Skill();
        sk.setSk_name("MicroSoft Excel");
        skillDao.createSkill(sk);
        
        sk = new Skill();
        sk.setSk_name("MicroSoft Word");
        skillDao.createSkill(sk);
        
        sk = new Skill();
        sk.setSk_name("HTML");
        skillDao.createSkill(sk);
        
        sk = new Skill();
        sk.setSk_name("MicroSoft PowerPoint");
        skillDao.createSkill(sk);
        
        sk = new Skill();
        sk.setSk_name("AT&T assembly & C");
        skillDao.createSkill(sk);
        
        sk = new Skill();
        sk.setSk_name("C++");
        skillDao.createSkill(sk);
        
        sk = new Skill();
        sk.setSk_name("Java SE");
        skillDao.createSkill(sk);
        
        sk = new Skill();
        sk.setSk_name("Java EE");
        skillDao.createSkill(sk);
        
        sk = new Skill();
        sk.setSk_name("Java ME");
        skillDao.createSkill(sk);
        
        sk = new Skill();
        sk.setSk_name("PHP");
        skillDao.createSkill(sk);
        
        sk = new Skill();
        sk.setSk_name("Windows");
        skillDao.createSkill(sk);
        
        sk = new Skill();
        sk.setSk_name("Red Hat Enterprise Linux 6");
        skillDao.createSkill(sk);
        
        sk = new Skill();
        sk.setSk_name("Red Hat Enterprise Linux 7");
        skillDao.createSkill(sk);
        
        sk = new Skill();
        sk.setSk_name("Team Leadership");
        skillDao.createSkill(sk);
        
                
        University uni;
        
        uni= new University();
        uni.setUni_name("New Jersey Institute of Technology");
        uni.setIcon_url("img/njit_1.png");
        universityDao.creatUniversity(uni);
        
        uni= new University();
        uni.setUni_name("Donghua University");
        uni.setIcon_url("img/dhu.png");
        universityDao.creatUniversity(uni);
        
        uni= new University();
        uni.setUni_name("Huazhong University of Science and Technology");
        uni.setIcon_url("img/hust.png");
        universityDao.creatUniversity(uni);
        
        uni= new University();
        uni.setUni_name("North China Eletric Power University");
        uni.setIcon_url("img/ncepu.png");
        universityDao.creatUniversity(uni);
        
        uni= new University();
        uni.setUni_name("Valparaiso Universit");
        uni.setIcon_url("img/valpo.png");
        universityDao.creatUniversity(uni);
        
        
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
        
        Random rand = new Random(new Date().getTime());
        Double longitude=  -74.0565;
        Double lantitude=  40.7895;
        
        for (int i=1; i<205; i++){
            User user = new User();
            user.setFname("fname_"+i);
            user.setLname("lname_"+i);
            user.setEmail("u"+i+"@u.com");
            user.setPd("u"+i);
            user.setLocation("location"+i);
            
            if (rand.nextInt()%2==0){
                user.setPhoto_url("img/default_icon.jpg");
                user.setGender("Male");
            }else{
                user.setPhoto_url("img/default_icon_f.jpg");
                user.setGender("Female");
            }
            
            
            user.setSummary("Hi i am user "+i+"~");
            
            Long longrand= (rand.nextLong()%10000);
            Long lantrand= rand.nextLong()%10000;
            
            Double thelong = longitude + longrand.doubleValue()/10000;
            Double thelant = lantitude + lantrand.doubleValue()/10000;
            
            user.setLongitudestr(thelong.toString());
            user.setLantitudestr(thelant.toString());
            
            userDao.createUser(user);            
        }
        
        
        User user;
        
        user = new User();        
        user.setFname("Wentao");
        user.setLname("Li");
        user.setEmail("wl256@njit.edu");
        user.setPd("123456");
        user.setPhoto_url("img/wtl.jpeg");
        user.setLongitudestr("-74.15373");
        user.setLantitudestr("40.7491889");
        user.setSummary("Hi i am Wentao Li~");
        user.setGender("Male");
        userDao.createUser(user);
        
        user = new User();        
        user.setFname("Hongyi");
        user.setLname("Liu");
        user.setEmail("hl357@njit.edu");
        user.setPd("123456");
        user.setPhoto_url("img/hyl.jpg");
        user.setLongitudestr("-74.1803297");
        user.setLantitudestr("40.7442745");
        user.setSummary("Hi i am Hongyi Liu~");
        user.setGender("Male");
        userDao.createUser(user);
        
        user = new User();        
        user.setFname("Leipeng");
        user.setLname("Gong");
        user.setEmail("lg229@njit.edu");
        user.setPd("123456");
        user.setPhoto_url("img/lpg.jpg");
        user.setLongitudestr("-74.1784611");
        user.setLantitudestr("40.7430846");
        user.setSummary("Hi i am Leipeng Gong~");
        user.setGender("Male");
        userDao.createUser(user);
        
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
        
        for(Long i = 2L;i<20;i++){
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
//        
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
