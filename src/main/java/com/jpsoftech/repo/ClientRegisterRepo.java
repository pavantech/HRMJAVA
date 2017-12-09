package com.jpsoftech.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpsoftech.model.ClientRegister;


public interface ClientRegisterRepo extends CrudRepository<ClientRegister, Long> {

	   ClientRegister save( ClientRegister p);
	   List<ClientRegister> findByemailIdAndPassword(String emailId, String password);
	   ClientRegister findByemailId(String emailId);
	   List<ClientRegister> findAll();
	   boolean existsByemailId(String email);
	    //List<Customer> findByUsernameAndPassword(String username, String password);
	}