package com.mch.application;

import java.io.File;
import java.io.FileInputStream;
import java.util.Objects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@SpringBootApplication
public class MchApplication {

	public static void main(String[] args) {
//		
//		ClassLoader classLoader = MchApplication.class.getClassLoader();
//		
//	    File file = new File(Objects.requireNonNull(classLoader.getResource("serviceAccountKey.json")).getFile());
//	    
//try {
//			FileInputStream serviceAccount =
//					  new FileInputStream(file.getAbsolutePath());
//
//			FirebaseOptions options = new FirebaseOptions.Builder()
//					  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//					  .setDatabaseUrl("https://mch-app-3b8de-default-rtdb.firebaseio.com")
//					  .build();
//			
//			FirebaseApp.initializeApp(options);
//			
//        } 
//catch (Exception e){
//            e.printStackTrace();
//        }
		
		SpringApplication.run(MchApplication.class, args);
	}

}
