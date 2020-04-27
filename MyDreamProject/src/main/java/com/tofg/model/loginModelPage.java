package com.tofg.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class loginModelPage {
	
	@Id
	private Long mobilenumber;
	private String password;
	public Long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
