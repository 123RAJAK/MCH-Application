package com.mch.application.Dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PatientDto {
		
	    private int patientId;
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
	
}
