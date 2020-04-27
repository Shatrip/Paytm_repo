package com.tofg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginFailedController {

@RequestMapping("PasswordExpiredOrInvalid")	
public String loginFailedDueToPasswordInvlid() {
	return "LoginFailed";	
}	


@RequestMapping("LoginFailed")	
public String mobileNumberDoesNotExists() {
	return "PasswordExpiredOrInvalid";	
}
}
