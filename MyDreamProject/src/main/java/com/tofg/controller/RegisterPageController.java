package com.tofg.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterPageController {
	
@RequestMapping("Register")	
public String indexPage() {
	return "Register";
	
}	

}
