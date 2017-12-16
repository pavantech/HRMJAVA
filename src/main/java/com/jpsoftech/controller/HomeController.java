package com.jpsoftech.controller;

import java.util.Date;
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
import com.jpsoftech.model.Login;
import com.jpsoftech.repo.ClientRegisterRepo;








@Controller
public class HomeController {
	@Autowired
	ClientRegisterRepo clientRegisterRepo;
	@RequestMapping({ "/", "/index.html" })
	public ModelAndView sayIndex() {
		System.out.println("Admin Panel");
		return new ModelAndView("index");
	}
	@RequestMapping(value = "/loginaction", method = RequestMethod.POST)
	public ModelAndView loginAction(@ModelAttribute(value = "contact") Login query, Model model, BindingResult result,
			HttpSession session) {

		if (result.hasErrors())
			// return "contactUs";
			return new ModelAndView("contactUs");
		List<ClientRegister> productmanagerlist = clientRegisterRepo.findByemailIdAndPassword(query.getUsername(),
				query.getPassword());
		if (query.getUsername().equals("raja") && query.getPassword().equals("raja")) {
			session.setAttribute("username", query.getUsername());
			model.addAttribute("querySuccess",
					"Thank you, Your Message stored in our Server we will contact through corresponding Mail");
			// return "AdminDashboard";
			return new ModelAndView("AdminDashboard");

		}  else if (productmanagerlist.size() != 0) {
			session.setAttribute("username", query.getUsername());
			model.addAttribute("querySuccess",
					"Thank you, Your Message stored in our Server we will contact through corresponding Mail");
			// return "ProductAdmindashboard";
			return new ModelAndView("ClientDashboard");
		}else 
		{
			model.addAttribute("querySuccess",
					"Thank you, Your Message stored in our Server we will contact through corresponding Mail");
			// return "login";
			return new ModelAndView("index");
		}

	}

	@RequestMapping("/Logout")
	public String logout(Model model, HttpSession session) {
		
		session.setAttribute("username", "");
		return "index";
	}

}
