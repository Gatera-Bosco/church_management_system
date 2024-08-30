/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import model.Rev;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author IT La Paix
 */
public class RevDao {
     public String addRev(Rev rev){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.save(rev);
            tr.commit();
            ss.close();
            return "rev Added";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
      public String updateRev(Rev rev){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.update(rev);
            tr.commit();
            ss.close();
            return "rev updated";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       public String deleteRev(Rev rev){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.delete(rev);
            tr.commit();
            ss.close();
            return "rev deleted";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       public List<Rev> revs(){
           try {
               Session ss=HibernateUtil.getSessionFactory().openSession();
               List<Rev> revList=ss.createQuery("select rev from Rev rev").list();
               ss.close();
               return revList;
           } catch (Exception e) {
               e.printStackTrace();
               return null;
           }
       }
       public Rev searchById(Rev rev){
           try {
                Session ss = HibernateUtil.getSessionFactory().openSession();
               Rev admn = (Rev)ss.get(Rev.class, rev.getRevId());
               ss.close();
               return admn;
           } catch (Exception e) {
               e.printStackTrace();
               return null;
           }
       }
       public Rev login(Rev rev) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Query query = ss.createQuery("SELECT a FROM Rev a WHERE a.rev_email = :username AND a.rev_password = :password");
            query.setParameter("username", rev.getRevEmail());
            query.setParameter("password", rev.getRevPassword());
            Rev admn = (Rev) query.uniqueResult();
            ss.close();
            return admn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
