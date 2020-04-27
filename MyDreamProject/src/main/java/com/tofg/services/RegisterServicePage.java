package com.tofg.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.tofg.model.RegisterModelPage;
import com.tofg.model.loginModelPage;
import com.tofg.repository.LoginPageDao;
import com.tofg.repository.RegisterPageDao;

public class RegisterServicePage {
	
	public boolean registerNewUser(RegisterPageDao repo, RegisterModelPage registerModelPage,LoginPageDao loginPageDao) {
		if(!repo.findByMobilenumber(registerModelPage.getMobilenumber()).isEmpty()) {
			return false;		
			
		} else {
			repo.save(registerModelPage);
			loginModelPage loginEntity=new loginModelPage();
			System.out.println("============================================");
			System.out.println(registerModelPage.getMobilenumber());
			System.out.println(registerModelPage.getNewpassword());
			System.out.println("============================================");
			loginEntity.setMobilenumber(registerModelPage.getMobilenumber());
			loginEntity.setPassword(registerModelPage.getNewpassword());
			loginPageDao.save(loginEntity);
			return true;
			
		}
	}
	
	public String loginCheck(loginModelPage loginmodelpage,LoginPageDao loginPageDao) {
		if(!loginPageDao.findByMobilenumber(loginmodelpage.getMobilenumber()).isEmpty()) {
			for(loginModelPage modelPage:loginPageDao.findAll()) {
				if(modelPage.getMobilenumber().equals(loginmodelpage.getMobilenumber()) && modelPage.getPassword().equals(loginmodelpage.getPassword()))
					return "VALID";
			}		
		
		return "PASSWORDINVALID";
		}
	else {
		return "MOBNUMNOTEXISTS";
	}

}
}
