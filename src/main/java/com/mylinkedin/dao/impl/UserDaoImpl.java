/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mylinkedin.dao.impl;

import com.mylinkedin.dao.UserDao;
import com.mylinkedin.domain.User;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *
 * @author superman90
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    
    @Override
    public Long createUser(User user) {
        return (Long) this.getHibernateTemplate().save(user);
    }

    @Override
    public void updateUser(User user) {
        this.getHibernateTemplate().update(user);
    }

    @Override
    public List<User> listUsers() {
        return (List<User>) this.getHibernateTemplate().execute(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.createQuery("from User");
                return query.list();
            }
            
        });
    }
    
    @Override
    public List<User> getUsersbyEmail(String email) {
        
        final String myemail = email;
        
        return (List<User>) this.getHibernateTemplate().execute(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.createQuery("from User u where u.email=:theemail");
                query.setParameter("theemail", myemail);
                return query.list();
            }
            
        });
    }
    
    @Override
    public User getUserbyId(Serializable uid) {
        return this.getHibernateTemplate().get(User.class, uid);
    }

    @Override
    public List<User> listConnections(Serializable uid) {
        
        final Serializable myuid= uid;
        
        return (List<User>) this.getHibernateTemplate().execute(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                Query query = session.createQuery("from User u join fetch u.connections c where u.uid=:theuid");
                query.setParameter("theuid", myuid);
                
                User me = (User) query.uniqueResult();
                
                return new ArrayList<>(me.getConnections());
                
            }
            
        });
    }

    @Override
    public List<User> listUserconnectingMe(User me) {
        
        final Serializable myuid=me.getUid();
        
        return (List<User>) this.getHibernateTemplate().execute(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                
                Query query = session.createQuery("from User u join fetch u.connections c where c.uid=:theuid");
                
                query.setParameter("theuid", myuid);
                
                return (List<User>) query.list();
                
            }
            
        });
    }
    
    @Override
    public List<User> listUserconnectingMe(Serializable uid) {
        
        final Serializable myuid=uid;
        
        return (List<User>) this.getHibernateTemplate().execute(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                
                Query query = session.createQuery("from User u join fetch u.connections c where c.uid=:theuid");
                
                query.setParameter("theuid", myuid);
                
                return (List<User>) query.list();
                
            }
            
        });
    }

    @Override
    public List<User> searchUserLike(final Map<String, String[]> paras ,final boolean andcondition) {
        
        return (List<User>) this.getHibernateTemplate().execute(new HibernateCallback(){

            @Override
            public Object doInHibernate(Session session) throws HibernateException, SQLException {

//                  Query query = session.createQuery("from User u "
//                                            + "join fetch u.universities uni"
//                                            + "join fetch u.skills sk"
//                                            + "join fetch u.companies cp"
//                                            + "join fetch u.languages lang"
//                        
//                                            + "where 1=1 "
//                                            
//                                            + "or u.fname like '%:fn%'"
//                                            + "or u.lname like '%:ln%'"
//                                            + "or u.summary like '%sum%'"
//                                            + "or u.location like '%loc%'"
//                                            + "or uni.uni_name like '%unil%'"
//                                            + "or sk.sk_name like %skl%"
//                                            + "or cp.cp_name like '%cpl%'"
//                                            + "or lang.lang_name like %langl%");
                
                StringBuilder querystr= new StringBuilder();
                String andor;
                
                if (andcondition){
                    andor=" and ";
                }else{
                    andor=" or ";
                }
                
                
                
                querystr.append("from User u "
                        + "left join fetch u.universities uni "
                        + "left join fetch u.skills sk "
                        + "left join fetch u.companies cp "
                        + "left join fetch u.languages lang "

                        + "where ");
                
                boolean first=true;
                for (Entry<String, String[]> entry: paras.entrySet()){
                    
                    if (first) {
                        querystr.append(entry.getValue()[0])
                                .append(" like '%")
                                .append(entry.getValue()[1])
                                .append("%'");
                        first= false;
                    }else{
                        querystr.append(andor)
                                .append(entry.getValue()[0])
                                .append(" like '%")
                                .append(entry.getValue()[1])
                                .append("%'");
                    }
                }
                
                Query query = session.createQuery(querystr.toString());
                
//                for (Entry<String, String[]> entry: paras.entrySet()){
//                    query.setParameter(entry.getKey(), entry.getValue()[1]);
//                }
                
                
                List<User> rawresult= query.list();
                List<User> result =new ArrayList();
                
                HashMap<Long,User> resultmap = new HashMap();
                
                for(User u : rawresult){
                    if (!resultmap.containsKey(u.getUid())){
                        resultmap.put(u.getUid(), u);
                        result.add(u);
                    }
                }
                
                return result;
            }
            
        });
    }
    
        @Override
    public List<User> listTopNConnectedUser(int N) {
        
        throw new UnsupportedOperationException("Not supported yet_from winslow leigh."); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    @Override
    public void test() {
        
        
//        List<User> ls = listUsers();
        
        
        
//        for (int i =0; i <5; i++){            
//            User user = new User();
//            user.setFname("fname_"+i);
//            user.setLname("lname_"+i);            
//            this.getHibernateTemplate().save(user);
//        }
//        for (int i =0; i <5; i++){            
//            Skill sk =new Skill();
//            sk.setSk_name("sk_"+i);
//            this.getHibernateTemplate().save(sk);
//        }
        
        
//        HashSet<Skill> sks= new HashSet();
//        
//        for (Long i=1L; i<6L; i++){
//        
//            Skill sk=(Skill)this.getHibernateTemplate().get(Skill.class, i);
//            sks.add(sk);
//        
//        }
//        
//        User me= (User)this.getHibernateTemplate().get(User.class,3L);
//        
//        me.setSkills(sks);
//        
//        this.getHibernateTemplate().update(me);
        
        
//        Object ls = (List<User>)this.getHibernateTemplate().execute(new HibernateCallback() {
//		
//            @Override
//            public Object doInHibernate(Session session) throws HibernateException, SQLException {
//                Query query = session.createQuery("from User u full join u.skills");
//				
//				return query.list();
//            }
//	});
//        
//        System.out.println(ls);
        
//        User u = (User)this.getHibernateTemplate().execute(new HibernateCallback(){
//
//            @Override
//            public Object doInHibernate(Session session) throws HibernateException, SQLException {
//                Query query = session.createQuery("from User u left outer join fetch u.skills where u.uid =2L");
//                return query.uniqueResult();
//            }
//            
//        });
//        
//        Object obj=u.getSkills();
//        
//        System.out.println(obj);
        
        
        
//        User u = (User) this.getHibernateTemplate().get(User.class, 1L);
//        
//        HashSet<Skill> sks = new HashSet();
//        
//        for (Long i=1L; i<3L; i++){
//        
//            Skill sk=(Skill)this.getHibernateTemplate().get(Skill.class, i);
//            sks.add(sk);
//        
//        }
//        
//        u.setSkills(sks);
//        
//        this.getHibernateTemplate().update(u);        
        
        
        
//        List<Skill> u = (List)this.getHibernateTemplate().execute(new HibernateCallback(){
//
//            @Override
//            public Object doInHibernate(Session session) throws HibernateException, SQLException {
//                Query query = session.createQuery("from Skill s join fetch s.users u where u.uid=:uid");
//                query.setParameter("uid", 1L);
//                return query.list();
//            }
//            
//        });
//        
//        
//        
//        System.out.println(u);
//        
//        this.getHibernateTemplate().execute(new HibernateCallback(){
//
//            @Override
//            public Object doInHibernate(Session session) throws HibernateException, SQLException {
//                Query query= session.createQuery("from User u "
//                        + "left join fetch u.universities uni "
//                        + "left join fetch u.skills sk "
//                        + "left join fetch u.companies cp "
//                        + "left join fetch u.languages lang "
//
//                        + "where "
//                        + " u.fname like '%3%'"
//                        + "or sk.sk_name like '%3%'"
//                        
//                );
//                
//                List<User> rawresult= query.list();
//                
//                HashMap<Long,User> resultmap = new HashMap();
//                
//                for(User u : rawresult){
//                    if (!resultmap.containsKey(u.getUid())){
//                        resultmap.put(u.getUid(), u);
//                    }
//                }
//                
//                return null;
//            }
//            
//        });
//        
        
    }


}
