package com.department;
// Generated Feb 20, 2013 10:16:51 PM by Hibernate Tools 3.2.1.GA



/**
 * Department generated by hbm2java
 */
public class Department_Beans  implements java.io.Serializable {


     private int departmentid;
     private String departmentName;

    public Department_Beans() {
    }

    public Department_Beans(int departmentid, String departmentName) {
    	this.departmentid=departmentid;
    	this.departmentName = departmentName;
    }
   
    public int getDepartmentid() {
        return this.departmentid;
    }
    
    public void setDepartmentid(int departmentid) {
        this.departmentid = departmentid;
    }
    public String getDepartmentName() {
        return this.departmentName;
    }
    
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }




}


