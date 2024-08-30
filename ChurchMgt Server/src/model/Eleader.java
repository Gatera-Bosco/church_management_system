
package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Gifyzo
 */
@Entity
@Table(name="eleader_table")
public class Eleader implements Serializable{
       @Id
    @Column(name="Eleader_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eleaderId;
       @Column(name="Eleader_Name")
    private String eleaderNames;
       @Column(name="Eleader_church")
    private String eleaderChurch;
       @Column(name="Eleader_Telphone")
    private String eleaderTelphone;
       @Column(name="Eleader_Email")
    private String eleaderEmail;
       @Column(name="Eleader_Password")
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
