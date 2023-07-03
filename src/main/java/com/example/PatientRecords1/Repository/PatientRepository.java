package com.example.PatientRecords1.Repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.PatientRecords1.Entity.PatientDetails;

@Repository
public interface PatientRepository  extends JpaRepository<PatientDetails,Integer>{
	@Query("SELECT u FROM PatientDetails u WHERE u.Patient_Name = :Patient_Name")
	Optional<PatientDetails> findByName( String Patient_Name);

}
