package com.mch.application.service;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.mch.application.Dto.PatientDto;
import com.mch.application.entity.Patient;

@Service
public interface patientService {
	
	public Patient createPatient(Patient patient) throws InterruptedException, ExecutionException ;
	public Patient getPatientByFirstName(String patientId) throws InterruptedException, ExecutionException;
	public List<Patient> getAllPatient() throws InterruptedException, ExecutionException;
	public void deletePatientByPatientId(String patientId);
	public Patient updatePatient(Patient patient);

}
