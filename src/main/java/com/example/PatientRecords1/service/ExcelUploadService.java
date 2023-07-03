package com.example.PatientRecords1.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import javax.swing.plaf.basic.BasicTreeUI.CellEditorHandler;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.example.PatientRecords1.Entity.PatientDetails;

public class ExcelUploadService {
     public static boolean isValidExcelFile(MultipartFile file) 
     {
    	 return Objects.equals(file.getContentType(), "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet" );
     }
     public static List<PatientDetails> getPatientDataFromExcel(InputStream inputStream){
         List<PatientDetails> patientdetails = new ArrayList<>();
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			XSSFSheet sheet = workbook.getSheet("Hello");
			  if (sheet == null) {
		            throw new IllegalArgumentException("Sheet '" + "Hello" + "' does not exist.");
			  }
			
			 int rowIndex =0;
	           for (Row row : sheet){
	               if (rowIndex ==0){
	                   rowIndex++;
	                   continue;
	               }
	               Iterator<Cell> cellIterator=row.iterator();
	               int cellIndex=0;
	               PatientDetails patientdetail=new PatientDetails();
	               while(cellIterator.hasNext())
	               {
	            	   Cell cell=cellIterator.next();
	            	   switch(cellIndex)
	            	   {
	            	   case 0 : patientdetail.setId((int) cell.getNumericCellValue());
	     
	            	   case 1 : patientdetail.setPatient_Name(cell.getStringCellValue());
	     
	            	   case 2 : patientdetail.setDOB(cell.getNumericCellValue());
	      
	            	   case 3 : patientdetail.setGender(cell.getStringCellValue());
	      
	            	   case 4 : patientdetail.setPhysician(cell.getStringCellValue());
	      
	            	   case 5 : patientdetail.setRoom(cell.getStringCellValue());
	
	            	   case 6 : patientdetail.setAdmiiting_Diagnosis(cell.getStringCellValue());
	  
	            	   case 7 : patientdetail.setMost_Recent_Pulse(cell.getStringCellValue());
	   
	            	   case 8 : patientdetail.setMost_Recent_Respiration(cell.getStringCellValue());
	       
	            	   case 9 : patientdetail.setMost_Recent_Temperature(cell.getStringCellValue());
	 
	            	   case 10: patientdetail.setMost_Recent_Blood_Pressure(cell.getStringCellValue());
	    
	            	   case 11: patientdetail.setMost_Recent_Hr(cell.getStringCellValue());
	 
	            	   case 12: patientdetail.setMost_Recent_Blood_Sugar(cell.getStringCellValue());
	    
	            	   case 13: patientdetail.setWeight_Lbs( (int) cell.getNumericCellValue());
	  
	            	   case 14: patientdetail.setSP_Fall(cell.getStringCellValue());
	   
	            	   case 15: patientdetail.setRs(cell.getStringCellValue());
	  
	            	   case 16: patientdetail.setPatients_With_Ongoing_Iv_Fluids(cell.getStringCellValue());
	  
	            	   case 17: patientdetail.setMsk(cell.getStringCellValue());
	     
	            	   case 18: patientdetail.setHeent(cell.getStringCellValue());
	      
	            	   case 19: patientdetail.setGu(cell.getStringCellValue());
	   
	            	   case 20: patientdetail.setCvs(cell.getStringCellValue());
	       
	            	   case 21: patientdetail.setAbdomen(cell.getStringCellValue());
	   
	            	   case 22: patientdetail.setNeuro(cell.getStringCellValue());
	         
	            	   case 23: patientdetail.setSkin_Changes(cell.getStringCellValue());
	         
	            	   case 24: patientdetail.setNew_Contractures(cell.getStringCellValue());
	            
	            	   case 25: patientdetail.setChange_In_Adl(cell.getStringCellValue());
	          
	            	   case 26: patientdetail.setAny_Clinical_Concern_Documented(cell.getStringCellValue());
	          
	            	   case 27: patientdetail.setLabs_Radiology_Drr(cell.getStringCellValue());
	            	
	            	   case 28: patientdetail.setReview_Goc_On_Admissions(cell.getStringCellValue());
	            
	            	   case 29: patientdetail.setDischarge_Planning(cell.getStringCellValue());
	            	
	            	   case 30: patientdetail.setMolst_Form_Review_Quarterly(cell.getStringCellValue());
	            	   case 31: patientdetail.setPoly_pharmacy(cell.getStringCellValue());
	            	   case 32: patientdetail.setNotes(cell.getStringCellValue());
	            	   case 33: patientdetail.setNew_Admission(cell.getStringCellValue());
	            	   case 34: patientdetail.setPatient_Recently(cell.getStringCellValue());
	            	   case 35: patientdetail.setPatients_with_new_infection_and_isolation_orders(cell.getStringCellValue());
	            	  
	            	   default :{
	            		   
	            	   }
	               }
	            	   cellIndex++;
	            	   
	               }
	               patientdetails.add(patientdetail);
		         }
		}
			 catch (IOException e) {
			e.getStackTrace();
		}
		
         return patientdetails;
     }
         
     }

     
   
     

