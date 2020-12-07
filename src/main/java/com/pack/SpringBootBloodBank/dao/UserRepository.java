package com.pack.SpringBootBloodBank.dao;

import org.springframework.data.repository.CrudRepository;

import com.pack.SpringBootBloodBank.model.User;

public interface UserRepository extends CrudRepository<User , Long>{

}
