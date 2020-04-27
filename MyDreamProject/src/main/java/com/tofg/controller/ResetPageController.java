package com.tofg.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResetPageController {
	
@RequestMapping("ResetPage")	
public String indexPage() {
	return "ResetPage";
	
}	

}
