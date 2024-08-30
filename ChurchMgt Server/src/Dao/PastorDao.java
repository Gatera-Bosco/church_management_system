/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import model.Pastor;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author IT La Paix
 */
public class PastorDao {
     public String addPastor(Pastor pastor){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.save(pastor);
            tr.commit();
            ss.close();
            return "pastor Added";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
      public String updatePastor(Pastor pastor){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.update(pastor);
            tr.commit();
            ss.close();
            return "pastor updated";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       public String deletePastor(Pastor pastor){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.delete(pastor);
            tr.commit();
            ss.close();
            return "pastor deleted";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       public List<Pastor> pastors(){
           try {
               Session ss=HibernateUtil.getSessionFactory().openSession();
               List<Pastor> pastorList=ss.createQuery("select pastor from Pastor pastor").list();
               ss.close();
               return pastorList;
           } catch (Exception e) {
               e.printStackTrace();
               return null;
           }
       }
       public Pastor searchById(Pastor pastor){
           try {
                Session ss = HibernateUtil.getSessionFactory().openSession();
               Pastor admn = (Pastor)ss.get(Pastor.class, pastor.getPastorId());
               ss.close();
               return admn;
           } catch (Exception e) {
               e.printStackTrace();
               return null;
           }
       }
       public Pastor login(Pastor pastor) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Query query = ss.createQuery("SELECT a FROM Pastor a WHERE a.pastor_email = :username AND a.pastor_password = :password");
            query.setParameter("username", pastor.getPastorEmail());
            query.setParameter("password", pastor.getPastorPassword());
            Pastor admn = (Pastor) query.uniqueResult();
            ss.close();
            return admn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
