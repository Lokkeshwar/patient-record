package com.example.PatientRecords1.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.PatientRecords1.Entity.PatientDetails;
import com.example.PatientRecords1.Repository.PatientRepository;

@Service
public class PatientService {
	@Autowired
	
	private PatientRepository patientrepository;
	
	public void savePatientToDatabase(MultipartFile file)
	{
		if(ExcelUploadService.isValidExcelFile(file))
		{
			try {
				List<PatientDetails> patientdetails=ExcelUploadService.getPatientDataFromExcel(file.getInputStream());
				this.patientrepository.saveAll(patientdetails);
			} catch (IOException e) {
				
				throw new IllegalArgumentException("The file is not a valid excel file");
			}
		}
	}
	public List<PatientDetails> getPatientDetails(){
		return patientrepository.findAll();
		
	}
	
	public PatientDetails getByName( String Patient_Name) 
	{
		 return patientrepository.findByName(Patient_Name).orElse(null);

	}
}       
