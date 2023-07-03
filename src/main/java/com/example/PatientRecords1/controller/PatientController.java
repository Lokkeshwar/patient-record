package com.example.PatientRecords1.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.PatientRecords1.Entity.PatientDetails;
import com.example.PatientRecords1.service.PatientService;

@RestController
@RequestMapping("/adding")
public class PatientController {
	@Autowired
	private PatientService patientservice;
	@PostMapping("/Upload")
	public  ResponseEntity<Map<String, String>> uploadPatient(@RequestParam("file") MultipartFile file)
	{
		  this.patientservice.savePatientToDatabase(file);
		  Map<String, String> response = new HashMap<>();
	        response.put("message", "Customer data uploaded and saved to the database successfully");
	        return ResponseEntity.ok(response);        
	               
		  
				 
	               
	}
    @GetMapping("/getAllPatient")
    public ResponseEntity<List<PatientDetails>> getPatients(){
        return new ResponseEntity<>(patientservice.getPatientDetails(),HttpStatus.FOUND);

	
    }
    
   
    @GetMapping("/getByName/{Patient_Name}")
	public ResponseEntity<Object> getbyName(@PathVariable String Patient_Name) 
	{  
		   PatientDetails user = patientservice.getByName(Patient_Name);

	        if (user == null) {
	            return ResponseEntity.notFound().build();
	        } else {
	            return ResponseEntity.ok(user);
	        }
		
	}
}
