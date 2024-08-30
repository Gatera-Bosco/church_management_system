
package model;

import java.io.Serializable;



/**
 *
 * @author Gifyzo
 */

public class Rev implements Serializable{
 

     private Integer revId;
   
    private String revNames;
   
    private String revChurch;
       
    private String revTelphone;
         
    private String revEmail;
 
    private String revPassword;

    public Rev() {
    }

    public Rev(String revNames) {
        this.revNames = revNames;
    }

    public Rev(Integer revId, String revNames, String revChurch, String revTelphone, String revEmail, String revPassword) {
        this.revId = revId;
        this.revNames = revNames;
        this.revChurch = revChurch;
        this.revTelphone = revTelphone;
        this.revEmail = revEmail;
        this.revPassword = revPassword;
    }



    public Integer getRevId() {
        return revId;
    }

    public void setRevId(Integer revId) {
        this.revId = revId;
    }

    public String getRevNames() {
        return revNames;
    }

    public void setRevNames(String revNames) {
        this.revNames = revNames;
    }

    public String getRevChurch() {
        return revChurch;
    }

    public void setRevChurch(String revChurch) {
        this.revChurch = revChurch;
    }

    public String getRevTelphone() {
        return revTelphone;
    }

    public void setRevTelphone(String revTelphone) {
        this.revTelphone = revTelphone;
    }

    public String getRevEmail() {
        return revEmail;
    }

    public void setRevEmail(String revEmail) {
        this.revEmail = revEmail;
    }

    public String getRevPassword() {
        return revPassword;
    }

    public void setRevPassword(String revPassword) {
        this.revPassword = revPassword;
    }
 
       
}
