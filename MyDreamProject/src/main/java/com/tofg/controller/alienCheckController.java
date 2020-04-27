package com.tofg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tofg.model.RegisterModelPage;
import com.tofg.model.alien;
import com.tofg.repository.RegisterPageDao;
import com.tofg.repository.alienRepo;
import com.tofg.services.RegisterServicePage;

@Controller
@CrossOrigin(origins="*")
public class alienCheckController {

@Autowired	
alienRepo repo;

	@RequestMapping("alien")
	public void registerOnSubmitPage(alien alien) {
		System.out.println(alien.getId());
		System.out.println(alien.getName());
		System.out.println(alien.getLastname());
		repo.save(alien);
	}

}
