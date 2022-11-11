package com.mch.application.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Patient {
	
    private String patientId;
    private String patientType;
	private String firstName;
	private String lastName;
	private String middleName;
	private Date dob;
	private String bloodGroup;
	private int mobileNumber;
	private int alternateNumber;
	private String qualification;
	private String employmentStatus;
	private int uid;
	private int ageAtMarraige;
	private String spouseName;
	private String familyIncome;
	private ArrayList<PatientAddress> address;
	
	public Patient() {};
	
	public String getPatientId() {
		return patientId;
	}
		
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getPatientType() {
		return patientType;
	}
	public void setPatientType(String patientType) {
		this.patientType = patientType;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getAlternateNumber() {
		return alternateNumber;
	}
	public void setAlternateNumber(int alternateNumber) {
		this.alternateNumber = alternateNumber;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getEmploymentStatus() {
		return employmentStatus;
	}
	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public int getAgeAtMarraige() {
		return ageAtMarraige;
	}
	public void setAgeAtMarraige(int ageAtMarraige) {
		this.ageAtMarraige = ageAtMarraige;
	}
	
	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getFamilyIncome() {
		return familyIncome;
	}

	public void setFamilyIncome(String familyIncome) {
		this.familyIncome = familyIncome;
	}
	
	public ArrayList<PatientAddress> getAddress() {
		return address;
	}

	public void setAddress(ArrayList<PatientAddress> address) {
		this.address = address;
	}

	public Patient(String patientId, String patientType, String firstName, String lastName, String middleName, Date dob,
			String bloodGroup, int mobileNumber, int alternateNumber, String qualification,
			String employmentStatus, int uid, int ageAtMarraige, String spouseName, String familyIncome,
			ArrayList<PatientAddress> address) {
		super();
		this.patientId = patientId;
		this.patientType = patientType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.dob = dob;
		this.bloodGroup = bloodGroup;
		this.mobileNumber = mobileNumber;
		this.alternateNumber = alternateNumber;
		this.qualification = qualification;
		this.employmentStatus = employmentStatus;
		this.uid = uid;
		this.ageAtMarraige = ageAtMarraige;
		this.spouseName = spouseName;
		this.familyIncome = familyIncome;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientType=" + patientType + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", middleName=" + middleName + ", dob=" + dob + ", bloodGroup="
				+ bloodGroup + ", mobileNumber=" + mobileNumber + ", alternateNumber=" + alternateNumber
				+ ", qualification=" + qualification + ", employmentStatus=" + employmentStatus + ", uid=" + uid
				+ ", ageAtMarraige=" + ageAtMarraige + ", spouseName=" + spouseName + ", familyIncome=" + familyIncome
				+ ", address=" + address + "]";
	}

}
