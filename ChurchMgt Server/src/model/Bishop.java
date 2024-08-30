
package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Gifyzo
 */
@Entity
@Table(name="bishop_table")
public class Bishop implements Serializable{
      @Id
    @Column(name="bishop_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
     private Integer bishopId;
    @Column(name="bishop_names")
    private String bishopNames;
    @Column(name="bishop_church")
    private String bishopChurch;
    @Column(name="bishop_phone")
    private String bishopTelphone;
    @Column(name="bishop_Email")
    private String bishopEmail;
    @Column(name="bishop_password")
    private String bishopPassword;

    public Bishop() {
    }

    public Bishop(String bishopNames) {
        this.bishopNames = bishopNames;
    }

    public Bishop(Integer bishopId, String bishopNames, String bishopChurch, String bishopTelphone, String bishopEmail, String bishopPassword) {
        this.bishopId = bishopId;
        this.bishopNames = bishopNames;
        this.bishopChurch = bishopChurch;
        this.bishopTelphone = bishopTelphone;
        this.bishopEmail = bishopEmail;
        this.bishopPassword = bishopPassword;
    }

    public Integer getBishopId() {
        return bishopId;
    }

    public void setBishopId(Integer bishopId) {
        this.bishopId = bishopId;
    }

    public String getBishopNames() {
        return bishopNames;
    }

    public void setBishopNames(String bishopNames) {
        this.bishopNames = bishopNames;
    }

    public String getBishopChurch() {
        return bishopChurch;
    }

    public void setBishopChurch(String bishopChurch) {
        this.bishopChurch = bishopChurch;
    }

    public String getBishopTelphone() {
        return bishopTelphone;
    }

    public void setBishopTelphone(String bishopTelphone) {
        this.bishopTelphone = bishopTelphone;
    }

    public String getBishopEmail() {
        return bishopEmail;
    }

    public void setBishopEmail(String bishopEmail) {
        this.bishopEmail = bishopEmail;
    }

    public String getBishopPassword() {
        return bishopPassword;
    }

    public void setBishopPassword(String bishopPassword) {
        this.bishopPassword = bishopPassword;
    }
   
    
    
}
