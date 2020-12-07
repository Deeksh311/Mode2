package com.pack.SpringBootBloodBank.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.pack.SpringBootBloodBank.model.Donars;


public interface DonarsRepository extends CrudRepository<Donars , Long>{
	List<Donars>findById(long id);
}
