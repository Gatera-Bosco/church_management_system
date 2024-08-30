/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import model.Eleader;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author IT La Paix
 */
public class EleaderDao {
     public String addEleader(Eleader eleader){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.save(eleader);
            tr.commit();
            ss.close();
            return "eleader Added";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
      public String updateEleader(Eleader eleader){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.update(eleader);
            tr.commit();
            ss.close();
            return "eleader updated";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       public String deleteEleader(Eleader eleader){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.delete(eleader);
            tr.commit();
            ss.close();
            return "eleader deleted";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       public List<Eleader> eleaders(){
           try {
               Session ss=HibernateUtil.getSessionFactory().openSession();
               List<Eleader> eleaderList=ss.createQuery("select eleader from Eleader eleader").list();
               ss.close();
               return eleaderList;
           } catch (Exception e) {
               e.printStackTrace();
               return null;
           }
       }
       public Eleader searchById(Eleader eleader){
           try {
                Session ss = HibernateUtil.getSessionFactory().openSession();
               Eleader admn = (Eleader)ss.get(Eleader.class, eleader.getEleaderId());
               ss.close();
               return admn;
           } catch (Exception e) {
               e.printStackTrace();
               return null;
           }
       }
       public Eleader login(Eleader eleader) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Query query = ss.createQuery("SELECT a FROM Eleader a WHERE a.eleader_email = :username AND a.eleader_password = :password");
            query.setParameter("username", eleader.getEleaderEmail());
            query.setParameter("password", eleader.getEleaderPassword());
            Eleader admn = (Eleader) query.uniqueResult();
            ss.close();
            return admn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
