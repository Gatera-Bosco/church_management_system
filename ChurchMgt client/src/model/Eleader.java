
package model;

import java.io.Serializable;



/**
 *
 * @author Gifyzo
 */

public class Eleader implements Serializable{

    private Integer eleaderId;
    
    private String eleaderNames;
      
    private String eleaderChurch;

    private String eleaderTelphone;
   
    private String eleaderEmail;
    
    private String eleaderPassword;

    public Eleader() {
    }

    public Eleader(String eleaderNames) {
        this.eleaderNames = eleaderNames;
    }
    

    public Eleader(Integer eleaderId, String eleaderNames, String eleaderChurch, String eleaderTelphone, String eleaderEmail, String eleaderPassword) {
        this.eleaderId = eleaderId;
        this.eleaderNames = eleaderNames;
        this.eleaderChurch = eleaderChurch;
        this.eleaderTelphone = eleaderTelphone;
        this.eleaderEmail = eleaderEmail;
        this.eleaderPassword = eleaderPassword;
    }

    public Integer getEleaderId() {
        return eleaderId;
    }

    public void setEleaderId(Integer eleaderId) {
        this.eleaderId = eleaderId;
    }

    public String getEleaderNames() {
        return eleaderNames;
    }

    public void setEleaderNames(String eleaderNames) {
        this.eleaderNames = eleaderNames;
    }

    public String getEleaderChurch() {
        return eleaderChurch;
    }

    public void setEleaderChurch(String eleaderChurch) {
        this.eleaderChurch = eleaderChurch;
    }

    public String getEleaderTelphone() {
        return eleaderTelphone;
    }

    public void setEleaderTelphone(String eleaderTelphone) {
        this.eleaderTelphone = eleaderTelphone;
    }

    public String getEleaderEmail() {
        return eleaderEmail;
    }

    public void setEleaderEmail(String eleaderEmail) {
        this.eleaderEmail = eleaderEmail;
    }

    public String getEleaderPassword() {
        return eleaderPassword;
    }

    public void setEleaderPassword(String eleaderPassword) {
        this.eleaderPassword = eleaderPassword;
    }
   
   
}
