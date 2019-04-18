/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ozi
 */
@Entity
@Table(name = "PATIENTDATA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Patientdata.findAll", query = "SELECT p FROM Patientdata p")
    , @NamedQuery(name = "Patientdata.findByPatientid", query = "SELECT p FROM Patientdata p WHERE p.patientid = :patientid")
    , @NamedQuery(name = "Patientdata.findByPatientname", query = "SELECT p FROM Patientdata p WHERE p.patientname = :patientname")
    , @NamedQuery(name = "Patientdata.findByDob", query = "SELECT p FROM Patientdata p WHERE p.dob = :dob")
    , @NamedQuery(name = "Patientdata.findByBloodtype", query = "SELECT p FROM Patientdata p WHERE p.bloodtype = :bloodtype")
    , @NamedQuery(name = "Patientdata.findByPulse", query = "SELECT p FROM Patientdata p WHERE p.pulse = :pulse")
    , @NamedQuery(name = "Patientdata.findByTemperature", query = "SELECT p FROM Patientdata p WHERE p.temperature = :temperature")})
public class Patientdata implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PATIENTID")
    private Integer patientid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "PATIENTNAME")
    private String patientname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DOB")
    @Temporal(TemporalType.DATE)
    private Date dob;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "BLOODTYPE")
    private String bloodtype;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PULSE")
    private double pulse;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TEMPERATURE")
    private double temperature;

    public Patientdata() {
    }

    public Patientdata(Integer patientid) {
        this.patientid = patientid;
    }

    public Patientdata(Integer patientid, String patientname, Date dob, String bloodtype, double pulse, double temperature) {
        this.patientid = patientid;
        this.patientname = patientname;
        this.dob = dob;
        this.bloodtype = bloodtype;
        this.pulse = pulse;
        this.temperature = temperature;
    }

    public Integer getPatientid() {
        return patientid;
    }

    public void setPatientid(Integer patientid) {
        this.patientid = patientid;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public double getPulse() {
        return pulse;
    }

    public void setPulse(double pulse) {
        this.pulse = pulse;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (patientid != null ? patientid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patientdata)) {
            return false;
        }
        Patientdata other = (Patientdata) object;
        if ((this.patientid == null && other.patientid != null) || (this.patientid != null && !this.patientid.equals(other.patientid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Patientdata[ patientid=" + patientid + " ]";
    }
    
}
