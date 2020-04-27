package com.tofg.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController {
	
@RequestMapping("Logout")	
public String logoutPage(HttpServletRequest req) {
	HttpSession session=req.getSession();
	session.removeAttribute("MobileNumber");
	return "Logout";
	
}	

}
