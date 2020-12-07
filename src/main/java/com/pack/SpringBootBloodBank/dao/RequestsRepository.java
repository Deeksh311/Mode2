package com.pack.SpringBootBloodBank.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pack.SpringBootBloodBank.model.Requests;

public interface RequestsRepository extends CrudRepository<Requests,Long>{
	List<Requests>findByPatientName(String patientName);

}
