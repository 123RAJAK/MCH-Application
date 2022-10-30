package com.mch.application.controller;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mch.application.entity.Patient;
import com.mch.application.serviceImplementation.patientServiceImplementation;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController {

    @Autowired
    patientServiceImplementation patientService;

    @GetMapping("/getPatientById")
    public Patient getPatient(@RequestParam String patientId) throws InterruptedException, ExecutionException{
        return patientService.getPatientByFirstName(patientId);
    }
    
    @GetMapping("/getAllPatient")
    public List<Patient> getAllPatient() throws InterruptedException, ExecutionException{
        return patientService.getAllPatient();
    }

    @PostMapping("/createPatient")
    public String createPatient(@RequestBody Patient patient) throws InterruptedException, ExecutionException {
        return patientService.createPatient(patient);
    }

//    @PutMapping("/updatePatient")
//    public String updatePatient(@RequestBody Patient patient  ) throws InterruptedException, ExecutionException {
//        return patientService.updatePatientDetails(patient);
//    }
    
}