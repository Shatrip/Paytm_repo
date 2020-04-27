package com.tofg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tofg.model.RegisterModelPage;
import com.tofg.repository.LoginPageDao;
import com.tofg.repository.RegisterPageDao;
import com.tofg.services.RegisterServicePage;

@Controller
@CrossOrigin(origins="*")
public class RegisterSubmitPage {

@Autowired	
RegisterPageDao repo;

@Autowired	
LoginPageDao loginPageDao;

	@RequestMapping("RegisterCheck")
	public String registerOnSubmitPage(RegisterModelPage registerModelPage) {
		RegisterServicePage regsiterServiceCheck=new RegisterServicePage();
		System.out.println(registerModelPage.getMobilenumber());
		System.out.println(registerModelPage.getFirstname());
		if(regsiterServiceCheck.registerNewUser(repo,registerModelPage,loginPageDao)) {
		return "RegisterSuccess";
		}else {
			
			return "RegisterFailure";	
		}
	}

}
