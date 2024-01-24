package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer employeeID, String role) {
    	this.employeeID=employeeID;
    	this.role=role;
    	this.securityIncidents = new ArrayList<>();
    }
   
   
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), employeeID, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident(Integer employeeID) {
    	this.employeeID=employeeID;
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.employeeID, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        //securityIncidents.add(report);
    }
    // TO DO: Implement HIPAACompliantAdmin!
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		//ArrayList<String> securityIncidents= new ArrayList<>();
		for (int i=0;i<securityIncidents.size();i++) {
			securityIncidents.get(i);
		}
		return securityIncidents;
	}
	 // TO DO: Implement HIPAACompliantUser!
	@Override
	public boolean assignPin(int pin) {
		if (String.valueOf(pin).length()==6)
			return true;
			else {
				return false;
			}
	}
	@Override
	public boolean accessAuthorized(Integer id) {
		if (id==employeeID)
			return true;
			else {
				authIncident(employeeID);
				newIncident("Authorization Attempt failed for this user");
				return false;
			}
	}
	   // TO DO: Setters & Getters
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
    
 
}
