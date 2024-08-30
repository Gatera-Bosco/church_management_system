/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import model.Bishop;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author IT La Paix
 */
public class BishopDao {
    public String addBishop(Bishop bishop){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.save(bishop);
            tr.commit();
            ss.close();
            return "bishop Added";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
      public String updateBishop(Bishop bishop){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.update(bishop);
            tr.commit();
            ss.close();
            return "bishop updated";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       public String deleteBishop(Bishop bishop){
        try {
            Session ss=HibernateUtil.getSessionFactory().openSession();
            Transaction tr=ss.beginTransaction();
            ss.delete(bishop);
            tr.commit();
            ss.close();
            return "bishop deleted";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
       public List<Bishop> bishops(){
           try {
               Session ss=HibernateUtil.getSessionFactory().openSession();
               List<Bishop> bishopList=ss.createQuery("select bishop from Bishop bishop").list();
               ss.close();
               return bishopList;
           } catch (Exception e) {
               e.printStackTrace();
               return null;
           }
       }
       public Bishop searchById(Bishop bishop){
           try {
                Session ss = HibernateUtil.getSessionFactory().openSession();
               Bishop admn = (Bishop)ss.get(Bishop.class, bishop.getBishopId());
               ss.close();
               return admn;
           } catch (Exception e) {
               e.printStackTrace();
               return null;
           }
       }
       public Bishop login(Bishop bishop) {
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Query query = ss.createQuery("SELECT a FROM Bishop a WHERE a.bishop_email = :username AND a.bishop_password = :password");
            query.setParameter("username", bishop.getBishopEmail());
            query.setParameter("password", bishop.getBishopPassword());
            Bishop admn = (Bishop) query.uniqueResult();
            ss.close();
            return admn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
