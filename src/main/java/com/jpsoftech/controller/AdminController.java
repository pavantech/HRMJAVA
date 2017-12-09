package com.jpsoftech.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jpsoftech.model.ClientRegister;
import com.jpsoftech.model.ClientRegisterVO;
import com.jpsoftech.repo.ClientRegisterRepo;


@Controller
public class AdminController {
	@Autowired
	ClientRegisterRepo clientRegisterRepo;
	
	@RequestMapping(value = "/clientRegister")
	public ModelAndView clientRegister(Model model, HttpSession session) {
		 if(session.getAttribute("username")!=null){
			 session.setAttribute("username", session.getAttribute("username"));
			 
			 ClientRegisterVO customer = new ClientRegisterVO();
				return new ModelAndView("ClientRegister", "customer", customer);
		  }
		 else
		 {
			 
				 return new ModelAndView("login");  
			 			 
		 }
		
	}
	@RequestMapping(value = "/clientRegisterAction", method = RequestMethod.POST)
	public String empRegister(@ModelAttribute(value = "customer") ClientRegisterVO customer, Model model,
			BindingResult result, HttpSession session) {
		session.setAttribute("username", session.getAttribute("username"));
		if (result.hasErrors())
			return "ProductManagerRegister";
		 if (clientRegisterRepo.existsByemailId(customer.getEmailId()))
        {
        	model.addAttribute("registrationSuccess", "Email already existed");
    		return "ClientRegister";
        }
        else
        {
        	System.out.println(customer.getPassword());
        	ClientRegister clientReg=new ClientRegister();
        	clientReg.setAadhaarNumber(customer.getAadhaarNumber());
        	clientReg.setCity(customer.getCity());
        	clientReg.setEmailId(customer.getEmailId());
        	clientReg.setCountry(customer.getCountry());
        	clientReg.setDepartment(customer.getDepartment());
        	clientReg.setFirstName(customer.getFirstName());
        	clientReg.setLastName(customer.getLastName());
        	clientReg.setOrganizationName(customer.getOrganizationName());
        	clientReg.setPassword(customer.getPassword());
        	clientReg.setPhoneWithCode(customer.getPhoneWithCode());
        	clientReg.setState(customer.getState());
        	clientReg.setZipcode(customer.getZipcode());
        	
        	clientRegisterRepo.save(clientReg);
    		model.addAttribute("registrationSuccess", "Registered Successfully. Login using username and password");
    		return "ClientRegister";
        }
		 
		 
		
	}
	
	@RequestMapping(value="/getClientList",method = RequestMethod.GET) 
	 public ModelAndView getClientList(HttpSession session) {
		 if(session.getAttribute("username")!=null){
			 String email=session.getAttribute("username").toString(); 
			  List<ClientRegister> employeeList = clientRegisterRepo.findAll(); 
			  return new ModelAndView("ClientList", "ClientList", employeeList); 
		  }
		 else
		 {
			 
				 return new ModelAndView("login");  
			 			 
		 }
	 }
}
