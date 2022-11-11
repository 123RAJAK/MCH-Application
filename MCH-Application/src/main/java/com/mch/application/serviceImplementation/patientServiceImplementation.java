package com.mch.application.serviceImplementation;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.mch.application.Dto.PatientDto;
import com.mch.application.config.AppConstants;
import com.mch.application.entity.Patient;
import com.mch.application.exceptions.ResourceNotFoundException;
import com.mch.application.service.patientService;

@Service
public class patientServiceImplementation implements patientService {

//	public static final String COLLECTION_NAME = "Patients";

//Create Patient
	public Patient createPatient(Patient patient) throws InterruptedException, ExecutionException  
	{
		
		Firestore dbFirestore = FirestoreClient.getFirestore();		
//        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection(COLLECTION_NAME).
//        												document().set(patient);        
		DocumentReference documentReference = dbFirestore.collection(AppConstants.COLLECTION_NAME).document();		
		patient.setPatientId(documentReference.getId());		
        ApiFuture<WriteResult> collectionsApiFuture = documentReference.set(patient);      
//        return collectionsApiFuture.get().getUpdateTime().toString();
        return patient;
	}

//Get Patient by Patient ID
	@Override
	public Patient getPatientByFirstName(String patientId) throws InterruptedException, ExecutionException {
		
		 Firestore dbFirestore = FirestoreClient.getFirestore();
	     DocumentReference documentReference = dbFirestore.collection(AppConstants.COLLECTION_NAME).document(patientId);
	     ApiFuture<DocumentSnapshot> future = documentReference.get();
	     DocumentSnapshot document = future.get();
	     Patient patient;
	     if(document.exists()){
	    	 patient = document.toObject(Patient.class);
	    	 return patient;
	     }else 
	     {
	    	 throw new ResourceNotFoundException("Patient","PatientId",patientId);
	     }
	        
	}

//Get ALL Patient
	@Override
	public List<Patient> getAllPatient() throws InterruptedException, ExecutionException {
		
		 Firestore dbFirestore = FirestoreClient.getFirestore();
	    
		 ApiFuture<QuerySnapshot> apiFuture= dbFirestore.collection(AppConstants.COLLECTION_NAME).get();
		 List<QueryDocumentSnapshot> list = apiFuture.get().getDocuments();		 
		 List<Patient> patientList = list.stream().map((doc) -> doc.toObject(Patient.class)).collect(Collectors.toList());
	    
		 return patientList;

	}

//Update Patient
	@Override
	public Patient updatePatient(Patient patient) {
		
		 Firestore dbFirestore = FirestoreClient.getFirestore();
//	     ApiFuture<WriteResult> collectionsApiFuture =
	     dbFirestore.collection(AppConstants.COLLECTION_NAME).document(patient.getPatientId()).set(patient);
	     return patient;	
	}

	@Override
	public void deletePatientByPatientId(String patientId) {
		Firestore dbFirestore = FirestoreClient.getFirestore();
		ApiFuture<WriteResult> writeResult = dbFirestore.
							collection(AppConstants.COLLECTION_NAME).document(patientId).delete();
	}
	
	
}
