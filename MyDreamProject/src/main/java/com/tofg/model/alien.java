package com.tofg.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class alien {
	
	private String lastname;
	private String aname;
	@Id
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return aname;
	}
	public void setName(String aname) {
		this.aname = aname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
