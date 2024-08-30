
package model;

import java.io.Serializable;



/**
 *
 * @author Gifyzo
 */

public class Pastor implements Serializable{
    
 
     private Integer pastorId;
 
    private String pastorNames;

    private String pastorChurch;

    private String pastorTelphone;

    private String pastorEmail;
  
    private String pastorPassword;
 

    public Pastor() {
    }

    public Pastor(String pastorNames) {
        this.pastorNames = pastorNames;
    }

    public Pastor(Integer pastorId, String pastorNames, String pastorChurch, String pastorTelphone, String pastorEmail, String pastorPassword, String pastorRepassword) {
        this.pastorId = pastorId;
        this.pastorNames = pastorNames;
        this.pastorChurch = pastorChurch;
        this.pastorTelphone = pastorTelphone;
        this.pastorEmail = pastorEmail;
        this.pastorPassword = pastorPassword;
    
    }

    public Integer getPastorId() {
        return pastorId;
    }

    public void setPastorId(Integer pastorId) {
        this.pastorId = pastorId;
    }

    public String getPastorNames() {
        return pastorNames;
    }

    public void setPastorNames(String pastorNames) {
        this.pastorNames = pastorNames;
    }

    public String getPastorChurch() {
        return pastorChurch;
    }

    public void setPastorChurch(String pastorChurch) {
        this.pastorChurch = pastorChurch;
    }

    public String getPastorTelphone() {
        return pastorTelphone;
    }

    public void setPastorTelphone(String pastorTelphone) {
        this.pastorTelphone = pastorTelphone;
    }

    public String getPastorEmail() {
        return pastorEmail;
    }

    public void setPastorEmail(String pastorEmail) {
        this.pastorEmail = pastorEmail;
    }

    public String getPastorPassword() {
        return pastorPassword;
    }

    public void setPastorPassword(String pastorPassword) {
        this.pastorPassword = pastorPassword;
    }
    
    
    
}
