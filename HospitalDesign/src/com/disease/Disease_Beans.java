package com.disease;
// Generated Feb 20, 2013 10:16:51 PM by Hibernate Tools 3.2.1.GA



/**
 * Diseaseinformation generated by hbm2java
 */
public class Disease_Beans  implements java.io.Serializable {


     private int diseaseid;
     private String diseaseName;
     private String diseaseDepartment;

    public Disease_Beans() {
    }

    public Disease_Beans(int diseaseid, String diseaseName, String diseaseDepartment) {
       this.diseaseid=diseaseid;
    	this.diseaseName = diseaseName;
       this.diseaseDepartment = diseaseDepartment;
    }
   
    public int getDiseaseid() {
        return this.diseaseid;
    }
    
    public void setDiseaseid(int diseaseid) {
        this.diseaseid = diseaseid;
    }
    public String getDiseaseName() {
        return this.diseaseName;
    }
    
    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }
    public String getDiseaseDepartment() {
        return this.diseaseDepartment;
    }
    
    public void setDiseaseDepartment(String diseaseDepartment) {
        this.diseaseDepartment = diseaseDepartment;
    }




}


