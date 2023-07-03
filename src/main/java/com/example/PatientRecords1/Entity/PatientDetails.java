package com.example.PatientRecords1.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class PatientDetails {
	@Id
	private int id;
	private String Patient_Name;
	private double DOB;
	private String Gender;
	private String Physician;
	private String Room;
	private String Admiiting_Diagnosis;
	private String Most_Recent_Pulse;
	private String Most_Recent_Respiration;
	private String Most_Recent_Temperature;
	private String Most_Recent_Blood_Pressure;
	private String Most_Recent_Hr;
	private String Most_Recent_Blood_Sugar;
	private Integer Weight_Lbs;
	private String SP_Fall;
	private String Rs;
	private String Patients_With_Ongoing_Iv_Fluids;
	private String Msk;
	private String Heent;
	private String Gu;
	private String Cvs;
	private String Abdomen;
	private String Neuro;
	private String Skin_Changes;
	private String New_Contractures;
	private String Change_In_Adl;
	private String Any_Clinical_Concern_Documented ;
	private  String Labs_Radiology_Drr;
	private String Review_Goc_On_Admissions;
	private String Discharge_Planning;
	private String Molst_Form_Review_Quarterly;
	private String Poly_pharmacy;
	private String Notes;
	private String New_Admission;
	private String Patient_Recently;
	private String patients_with_new_infection_and_isolation_orders;
	
	public PatientDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PatientDetails(int id, String patient_Name, double dOB, String gender, String physician, String room,
			String admiiting_Diagnosis, String most_Recent_Pulse, String most_Recent_Respiration, String most_Recent_Temperature,
			String most_Recent_Blood_Pressure, String most_Recent_Hr, String most_Recent_Blood_Sugar, Integer weight_Lbs,
			String sP_Fall, String rs, String patients_With_Ongoing_Iv_Fluids, String msk, String heent, String gu,
			String cvs, String abdomen, String neuro, String skin_Changes, String new_Contractures,
			String change_In_Adl, String any_Clinical_Concern_Documented, String labs_Radiology_Drr,
			String review_Goc_On_Admissions, String discharge_Planning, String molst_Form_Review_Quarterly,
			String poly_pharmacy, String notes, String new_Admission, String patient_Recently,
			String patients_with_new_infection_and_isolation_orders) {
		super();
		this.id = id;
		Patient_Name = patient_Name;
		DOB = dOB;
		Gender = gender;
		Physician = physician;
		Room = room;
		Admiiting_Diagnosis = admiiting_Diagnosis;
		Most_Recent_Pulse = most_Recent_Pulse;
		Most_Recent_Respiration = most_Recent_Respiration;
		Most_Recent_Temperature = most_Recent_Temperature;
		Most_Recent_Blood_Pressure = most_Recent_Blood_Pressure;
		Most_Recent_Hr = most_Recent_Hr;
		Most_Recent_Blood_Sugar = most_Recent_Blood_Sugar;
		Weight_Lbs = weight_Lbs;
		SP_Fall = sP_Fall;
		Rs = rs;
		Patients_With_Ongoing_Iv_Fluids = patients_With_Ongoing_Iv_Fluids;
		Msk = msk;
		Heent = heent;
		Gu = gu;
		Cvs = cvs;
		Abdomen = abdomen;
		Neuro = neuro;
		Skin_Changes = skin_Changes;
		New_Contractures = new_Contractures;
		Change_In_Adl = change_In_Adl;
		Any_Clinical_Concern_Documented = any_Clinical_Concern_Documented;
		Labs_Radiology_Drr = labs_Radiology_Drr;
		Review_Goc_On_Admissions = review_Goc_On_Admissions;
		Discharge_Planning = discharge_Planning;
		Molst_Form_Review_Quarterly = molst_Form_Review_Quarterly;
		Poly_pharmacy = poly_pharmacy;
		Notes = notes;
		New_Admission = new_Admission;
		Patient_Recently = patient_Recently;
		this.patients_with_new_infection_and_isolation_orders = patients_with_new_infection_and_isolation_orders;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPatient_Name() {
		return Patient_Name;
	}
	public void setPatient_Name(String string) {
		Patient_Name = string;
	}
	public double getDOB() {
		return DOB;
	}
	public void setDOB(double d) {
		System.out.println(d);
		DOB = d;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getPhysician() {
		return Physician;
	}
	public void setPhysician(String physician) {
		Physician = physician;
	}
	public String getRoom() {
		return Room;
	}
	public void setRoom(String room) {
		Room = room;
	}
	public String getAdmiiting_Diagnosis() {
		return Admiiting_Diagnosis;
	}
	public void setAdmiiting_Diagnosis(String admiiting_Diagnosis) {
		Admiiting_Diagnosis = admiiting_Diagnosis;
	}
	public String getMost_Recent_Pulse() {
		return Most_Recent_Pulse;
	}
	public void setMost_Recent_Pulse(String most_Recent_Pulse) {
		Most_Recent_Pulse = most_Recent_Pulse;
	}
	public String getMost_Recent_Respiration() {
		return Most_Recent_Respiration;
	}
	public void setMost_Recent_Respiration(String most_Recent_Respiration) {
		Most_Recent_Respiration = most_Recent_Respiration;
	}
	public String getMost_Recent_Temperature() {
		return Most_Recent_Temperature;
	}
	public void setMost_Recent_Temperature(String most_Recent_Temperature) {
		Most_Recent_Temperature = most_Recent_Temperature;
	}
	public String getMost_Recent_Blood_Pressure() {
		return Most_Recent_Blood_Pressure;
	}
	public void setMost_Recent_Blood_Pressure(String most_Recent_Blood_Pressure) {
		Most_Recent_Blood_Pressure = most_Recent_Blood_Pressure;
	}
	public String getMost_Recent_Hr() {
		return Most_Recent_Hr;
	}
	public void setMost_Recent_Hr(String most_Recent_Hr) {
		Most_Recent_Hr = most_Recent_Hr;
	}
	public String getMost_Recent_Blood_Sugar() {
		return Most_Recent_Blood_Sugar;
	}
	public void setMost_Recent_Blood_Sugar(String most_Recent_Blood_Sugar) {
		Most_Recent_Blood_Sugar = most_Recent_Blood_Sugar;
	}
	public Integer getWeight_Lbs() {
		return Weight_Lbs;
	}
	public void setWeight_Lbs(Integer weight_Lbs) {
		Weight_Lbs = weight_Lbs;
	}
	public String getSP_Fall() {
		return SP_Fall;
	}
	public void setSP_Fall(String sP_Fall) {
		SP_Fall = sP_Fall;
	}
	public String getRs() {
		return Rs;
	}
	public void setRs(String rs) {
		Rs = rs;
	}
	public String getPatients_With_Ongoing_Iv_Fluids() {
		return Patients_With_Ongoing_Iv_Fluids;
	}
	public void setPatients_With_Ongoing_Iv_Fluids(String patients_With_Ongoing_Iv_Fluids) {
		Patients_With_Ongoing_Iv_Fluids = patients_With_Ongoing_Iv_Fluids;
	}
	public String getMsk() {
		return Msk;
	}
	public void setMsk(String msk) {
		Msk = msk;
	}
	public String getHeent() {
		return Heent;
	}
	public void setHeent(String heent) {
		Heent = heent;
	}
	public String getGu() {
		return Gu;
	}
	public void setGu(String gu) {
		Gu = gu;
	}
	public String getCvs() {
		return Cvs;
	}
	public void setCvs(String cvs) {
		Cvs = cvs;
	}
	public String getAbdomen() {
		return Abdomen;
	}
	public void setAbdomen(String abdomen) {
		Abdomen = abdomen;
	}
	public String getNeuro() {
		return Neuro;
	}
	public void setNeuro(String neuro) {
		Neuro = neuro;
	}
	public String getSkin_Changes() {
		return Skin_Changes;
	}
	public void setSkin_Changes(String skin_Changes) {
		Skin_Changes = skin_Changes;
	}
	public String getNew_Contractures() {
		return New_Contractures;
	}
	public void setNew_Contractures(String new_Contractures) {
		New_Contractures = new_Contractures;
	}
	public String getChange_In_Adl() {
		return Change_In_Adl;
	}
	public void setChange_In_Adl(String change_In_Adl) {
		Change_In_Adl = change_In_Adl;
	}
	public String getAny_Clinical_Concern_Documented() {
		return Any_Clinical_Concern_Documented;
	}
	public void setAny_Clinical_Concern_Documented(String any_Clinical_Concern_Documented) {
		Any_Clinical_Concern_Documented = any_Clinical_Concern_Documented;
	}
	public String getLabs_Radiology_Drr() {
		return Labs_Radiology_Drr;
	}
	public void setLabs_Radiology_Drr(String labs_Radiology_Drr) {
		Labs_Radiology_Drr = labs_Radiology_Drr;
	}
	public String getReview_Goc_On_Admissions() {
		return Review_Goc_On_Admissions;
	}
	public void setReview_Goc_On_Admissions(String review_Goc_On_Admissions) {
		Review_Goc_On_Admissions = review_Goc_On_Admissions;
	}
	public String getDischarge_Planning() {
		return Discharge_Planning;
	}
	public void setDischarge_Planning(String discharge_Planning) {
		Discharge_Planning = discharge_Planning;
	}
	public String getMolst_Form_Review_Quarterly() {
		return Molst_Form_Review_Quarterly;
	}
	public void setMolst_Form_Review_Quarterly(String molst_Form_Review_Quarterly) {
		Molst_Form_Review_Quarterly = molst_Form_Review_Quarterly;
	}
	public String getPoly_pharmacy() {
		return Poly_pharmacy;
	}
	public void setPoly_pharmacy(String poly_pharmacy) {
		Poly_pharmacy = poly_pharmacy;
	}
	public String getNotes() {
		return Notes;
	}
	public void setNotes(String notes) {
		Notes = notes;
	}
	public String getNew_Admission() {
		return New_Admission;
	}
	public void setNew_Admission(String new_Admission) {
		New_Admission = new_Admission;
	}
	public String getPatient_Recently() {
		return Patient_Recently;
	}
	public void setPatient_Recently(String patient_Recently) {
		Patient_Recently = patient_Recently;
	}
	public String getPatients_with_new_infection_and_isolation_orders() {
		return patients_with_new_infection_and_isolation_orders;
	}
	public void setPatients_with_new_infection_and_isolation_orders(
			String patients_with_new_infection_and_isolation_orders) {
		this.patients_with_new_infection_and_isolation_orders = patients_with_new_infection_and_isolation_orders;
	}
	@Override
	public String toString() {
		return "PatientDetails [id=" + id + ", Patient_Name=" + Patient_Name + ", DOB=" + DOB + ", Gender=" + Gender
				+ ", Physician=" + Physician + ", Room=" + Room + ", Admiiting_Diagnosis=" + Admiiting_Diagnosis
				+ ", Most_Recent_Pulse=" + Most_Recent_Pulse + ", Most_Recent_Respiration=" + Most_Recent_Respiration
				+ ", Most_Recent_Temperature=" + Most_Recent_Temperature + ", Most_Recent_Blood_Pressure="
				+ Most_Recent_Blood_Pressure + ", Most_Recent_Hr=" + Most_Recent_Hr + ", Most_Recent_Blood_Sugar="
				+ Most_Recent_Blood_Sugar + ", Weight_Lbs=" + Weight_Lbs + ", SP_Fall=" + SP_Fall + ", Rs=" + Rs
				+ ", Patients_With_Ongoing_Iv_Fluids=" + Patients_With_Ongoing_Iv_Fluids + ", Msk=" + Msk + ", Heent="
				+ Heent + ", Gu=" + Gu + ", Cvs=" + Cvs + ", Abdomen=" + Abdomen + ", Neuro=" + Neuro
				+ ", Skin_Changes=" + Skin_Changes + ", New_Contractures=" + New_Contractures + ", Change_In_Adl="
				+ Change_In_Adl + ", Any_Clinical_Concern_Documented=" + Any_Clinical_Concern_Documented
				+ ", Labs_Radiology_Drr=" + Labs_Radiology_Drr + ", Review_Goc_On_Admissions="
				+ Review_Goc_On_Admissions + ", Discharge_Planning=" + Discharge_Planning
				+ ", Molst_Form_Review_Quarterly=" + Molst_Form_Review_Quarterly + ", Poly_pharmacy=" + Poly_pharmacy
				+ ", Notes=" + Notes + ", New_Admission=" + New_Admission + ", Patient_Recently=" + Patient_Recently
				+ ", patients_with_new_infection_and_isolation_orders="
				+ patients_with_new_infection_and_isolation_orders + "]";
	}
	
	
	

	



}
