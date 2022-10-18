package com.mch.application.firebase;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileInputStream;

import javax.annotation.PostConstruct;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Service
public class FirebaseInitilization {
	
	@PostConstruct
	public void initialization() {

		try {
			
			File file = ResourceUtils.getFile("classpath:config/serviceAccountKeyMain.json");
					
			FileInputStream serviceAccount =
					  new FileInputStream(file);

					FirebaseOptions options = new FirebaseOptions.Builder()
					  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
					  .setDatabaseUrl("https://mch-app-3b8de-default-rtdb.firebaseio.com")
					  .build();

					FirebaseApp.initializeApp(options);
					
        } catch (Exception e) 
		{
            e.printStackTrace();
        }

	}

}
