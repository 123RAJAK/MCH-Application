package com.mch.application.controller;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.api.Http;
import com.mch.application.entity.Patient;
import com.mch.application.payloads.ApiResponse;
import com.mch.application.serviceImplementation.patientServiceImplementation;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController {

    @Autowired
    patientServiceImplementation patientService;

    @GetMapping("/getPatientById")
    public Patient getPatientById(@RequestParam String patientId) throws InterruptedException, ExecutionException{
        return patientService.getPatientByFirstName(patientId);
    }
    
    @GetMapping("/getAllPatient")
    public List<Patient> getAllPatient() throws InterruptedException, ExecutionException{
        return patientService.getAllPatient();
    }

    @PostMapping("/createPatient")
    public ResponseEntity<Patient> createPatient(@RequestBody Patient patient) throws InterruptedException, ExecutionException {
       
       Patient createdPatient = patientService.createPatient(patient);
       return new ResponseEntity<Patient>(createdPatient,org.springframework.http.HttpStatus.CREATED);
    }

    @PutMapping("/updatePatient")
    public ResponseEntity<Patient> updatePatient(@RequestBody Patient patient  ) throws InterruptedException, ExecutionException {
        Patient updatedPatient = patientService.updatePatient(patient);
        return new ResponseEntity<>(updatedPatient, org.springframework.http.HttpStatus.OK);
    }
    
    @DeleteMapping("/deletePatient")
    public ResponseEntity<ApiResponse> deletePatientById(@RequestParam String patientId) throws InterruptedException, ExecutionException{
       patientService.deletePatientByPatientId(patientId);
       return new ResponseEntity<ApiResponse>(new ApiResponse("Patient Deleted Successfully", true), org.springframework.http.HttpStatus.OK);     
    }
    
}