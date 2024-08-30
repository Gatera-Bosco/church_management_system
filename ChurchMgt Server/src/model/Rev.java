
package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Gifyzo
 */
@Entity
@Table(name="rev_table")
public class Rev implements Serializable{
       @Id
    @Column(name="rev_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer revId;
     @Column(name="rev_names")
    private String revNames;
      @Column(name="rev_church")
    private String revChurch;
        @Column(name="rev_phone")
    private String revTelphone;
          @Column(name="rev_email")
    private String revEmail;
    @Column(name="rev_password")
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
