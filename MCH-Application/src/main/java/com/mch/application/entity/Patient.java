package com.mch.application.entity;

import java.util.Date;

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
	private Date Dob;
	private String bloodGroup;
	private int mobileNumber;
	private int alternateNumber;
	private String qualification;
	private String employmentStatus;
	private int uid;
	private int ageAtMarraige;
	
	public String getPatientId() {
		return patientId;
	}
	
	public Patient() {};
	
	
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
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
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
	

	public Patient(String patientId, String patientType, String firstName, String lastName, String middleName, Date dob,
			String bloodGroup, int mobileNumber, int alternateNumber, String qualification, String employmentStatus,
			int uid, int ageAtMarraige) {
		super();
		this.patientId = patientId;
		this.patientType = patientType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		Dob = dob;
		this.bloodGroup = bloodGroup;
		this.mobileNumber = mobileNumber;
		this.alternateNumber = alternateNumber;
		this.qualification = qualification;
		this.employmentStatus = employmentStatus;
		this.uid = uid;
		this.ageAtMarraige = ageAtMarraige;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientType=" + patientType + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", middleName=" + middleName + ", Dob=" + Dob + ", bloodGroup="
				+ bloodGroup + ", mobileNumber=" + mobileNumber + ", alternateNumber=" + alternateNumber
				+ ", qualification=" + qualification + ", employmentStatus=" + employmentStatus + ", uid=" + uid
				+ ", ageAtMarraige=" + ageAtMarraige + "]";
	}	
}
