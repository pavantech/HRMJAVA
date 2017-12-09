package com.jpsoftech.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpsoftech.model.ClientRegister;
import com.jpsoftech.model.EmployeeRegister;


public interface EmployeeRegisterRepo extends CrudRepository<EmployeeRegister, Long> {

	EmployeeRegister save( EmployeeRegister p);
	   List<EmployeeRegister> findByemailIdAndPassword(String emailId, String password);
	   EmployeeRegister findByemailId(String emailId);
	   List<EmployeeRegister> findByclientRegister(ClientRegister clientRegister);
	   boolean existsByemailId(String email);
	    //List<Customer> findByUsernameAndPassword(String username, String password);
	}