package com.tofg.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tofg.model.loginModelPage;
import com.tofg.repository.LoginPageDao;
import com.tofg.services.RegisterServicePage;

@Controller
public class HomePageController {

@Autowired	
LoginPageDao loginPageDao;	
	
@RequestMapping("HomePage")	
public String indexPage(loginModelPage loginmodelpage,HttpServletRequest req) {
	HttpSession session=req.getSession();
	if(session.getAttribute("MobileNumber")==null) {
	RegisterServicePage registerServicePage=new RegisterServicePage();
	System.out.println("==================================");
	System.out.println(loginmodelpage.getMobilenumber());
	System.out.println(loginmodelpage.getPassword());
	String response=registerServicePage.loginCheck(loginmodelpage,loginPageDao);
	if(response.equalsIgnoreCase("VALID")) {
		session.setAttribute("MobileNumber", loginmodelpage.getMobilenumber());	
	return "HomePage";
	}
	else if(response.equalsIgnoreCase("PASSWORDINVALID"))
	return "PasswordExpiredOrInvalid";	
	else
	return "LoginFailed";	
	}else {
		
		return "HomePage";	
	}
}

}
