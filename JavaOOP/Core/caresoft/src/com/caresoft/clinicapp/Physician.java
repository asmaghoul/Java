package com.caresoft.clinicapp;

import java.lang.Integer;
import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	//member variables
	private  int IDcopy;
	private ArrayList<String> patientNotes;
	// TO DO: Constructor that takes an IDcopy
		public Physician(int IDcopy) {
			this.IDcopy=IDcopy;
			this.patientNotes = new ArrayList<>(); // Initialise patientNotes ArrayList
		}
	   
		
		public void newPatientNotes(String notes, String patientName, Date date) {
	        String report = String.format(
	            "Datetime Submitted: %s \n", date);
	        report += String.format("Reported By ID: %s\n", this.id);
	        report += String.format("Patient Name: %s\n", patientName);
	        report += String.format("Notes: %s \n", notes);
	        this.patientNotes.add(report);
	    }
	// TO DO: Setters & Getters
		public ArrayList<String> getPatientNotes() {
			return patientNotes;
		}
		public void setPatientNotes(ArrayList<String> patientNotes) {
			this.patientNotes = patientNotes;
		}
	    public int getIDcopy() {
		return IDcopy;
	    }
  

	    public void setIDcopy(int iDcopy) {
		this.IDcopy = iDcopy;
	    }
	
	
	
	 // TO DO: Implement HIPAACompliantUser!
	@Override
	public boolean assignPin(int pin) {
		if (String.valueOf(pin).length()==4)
		return true;
		else {
			return false;
		}
	}

	@Override
	public boolean accessAuthorized(Integer id) {
		if (Integer.parseInt(id.toString())==IDcopy)
		//if(id==IDcopy)
		return true;
		else {
			return false;
		}
	}
	
    
	
	
}
