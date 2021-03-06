package com.beans;
// Generated Feb 18, 2013 11:37:54 AM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * PatientOutside generated by hbm2java
 */
public class PatientOutside  implements java.io.Serializable {


     private int outsideId;
     private int patientRegistrationno;
     private int doctorId;
     private String diseaseName;
     private String checkUpDate;
     private String referByDr;
     private int checkupNumber;

    public PatientOutside() {
    }

    public PatientOutside(int outsideId, int patientRegistrationno, int doctorId, String diseaseName, String checkUpDate, String referByDr, int checkupNumber) {
       this.outsideId=outsideId;
    	this.patientRegistrationno = patientRegistrationno;
       this.doctorId = doctorId;
       this.diseaseName = diseaseName;
       this.checkUpDate = checkUpDate;
       this.referByDr = referByDr;
       this.checkupNumber = checkupNumber;
    }
   
    public int getOutsideId() {
        return this.outsideId;
    }
    
    public void setOutsideId(int outsideId) {
        this.outsideId = outsideId;
    }
    public int getPatientRegistrationno() {
        return this.patientRegistrationno;
    }
    
    public void setPatientRegistrationno(int patientRegistrationno) {
        this.patientRegistrationno = patientRegistrationno;
    }
    public int getDoctorId() {
        return this.doctorId;
    }
    
    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
    public String getDiseaseName() {
        return this.diseaseName;
    }
    
    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }
    public String getCheckUpDate() {
        return this.checkUpDate;
    }
    
    public void setCheckUpDate(String checkUpDate) {
        this.checkUpDate = checkUpDate;
    }
    public String getReferByDr() {
        return this.referByDr;
    }
    
    public void setReferByDr(String referByDr) {
        this.referByDr = referByDr;
    }
    public int getCheckupNumber() {
        return this.checkupNumber;
    }
    
    public void setCheckupNumber(int checkupNumber) {
        this.checkupNumber = checkupNumber;
    }




}


