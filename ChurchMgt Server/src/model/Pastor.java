
package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 *
 * @author Gifyzo
 */
@Entity
@Table(name="pastor_table")
public class Pastor implements Serializable{
    
       @Id
    @Column(name="pastor_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer pastorId;
    @Column(name="pastor_Names")
    private String pastorNames;
    @Column(name="pastor_church")
    private String pastorChurch;
    @Column(name="pastor_phone")
    private String pastorTelphone;
    @Column(name="pastor_email")
    private String pastorEmail;
    @Column(name="pastor_password")
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
