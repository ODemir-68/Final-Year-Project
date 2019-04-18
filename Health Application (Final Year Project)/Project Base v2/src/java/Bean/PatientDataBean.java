/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import Entity.Patientdata;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ozi
 */
@Named(value = "patientDataBean")
@SessionScoped
public class PatientDataBean implements Serializable {

    @PersistenceContext(unitName = "Project_Base_v2PU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;

    public PatientDataBean() {
    }
    
    public List<Patientdata> getPatientData(){
        return em.createNamedQuery("Patientdata.findAll").getResultList();
    }
    
    private Integer f1 = 1;
    private Integer f2 = 2;
    private Integer f3 = 3;
    private Integer f4 = 4;
    private Integer f5 = 5;

    List<Patientdata> p1 = null;
    
    public List<Patientdata> getPatient01() {
        List<Patientdata> P01 = new ArrayList<Patientdata>();
        if (p1 == null) {
            p1 = em.createNamedQuery("Patientdata.findAll").getResultList();
        }
        for (Patientdata P1 : p1) {
            if (P1.getPatientid() != null) {
                if (P1.getPatientid().equals(f1)) {
                    P01.add(P1);
                }}}
        return P01;
    }
    
    public List<Patientdata> getPatient02() {
        List<Patientdata> P01 = new ArrayList<Patientdata>();
        if (p1 == null) {
            p1 = em.createNamedQuery("Patientdata.findAll").getResultList();
        }
        for (Patientdata P1 : p1) {
            if (P1.getPatientid() != null) {
                if (P1.getPatientid().equals(f2)) {
                    P01.add(P1);
                }}}
        return P01;
    }
    
    public List<Patientdata> getPatient03() {
        List<Patientdata> P01 = new ArrayList<Patientdata>();
        if (p1 == null) {
            p1 = em.createNamedQuery("Patientdata.findAll").getResultList();
        }
        for (Patientdata P1 : p1) {
            if (P1.getPatientid() != null) {
                if (P1.getPatientid().equals(f3)) {
                    P01.add(P1);
                }}}
        return P01;
    }

    public List<Patientdata> getPatient04() {
        List<Patientdata> P01 = new ArrayList<Patientdata>();
        if (p1 == null) {
            p1 = em.createNamedQuery("Patientdata.findAll").getResultList();
        }
        for (Patientdata P1 : p1) {
            if (P1.getPatientid() != null) {
                if (P1.getPatientid().equals(f4)) {
                    P01.add(P1);
                }}}
        return P01;
    }

    public List<Patientdata> getPatient05() {
        List<Patientdata> P01 = new ArrayList<Patientdata>();
        if (p1 == null) {
            p1 = em.createNamedQuery("Patientdata.findAll").getResultList();
        }
        for (Patientdata P1 : p1) {
            if (P1.getPatientid() != null) {
                if (P1.getPatientid().equals(f5)) {
                    P01.add(P1);
                }}}
        return P01;
    }
    
    }
        
    

