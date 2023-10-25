package com.devsuperior.cabacitybank.entities;

public class AccountList {

	private Long id;
	private String pixKey; 
	
	public AccountList() {
	}

	public AccountList(Long id, String pixKey) {
		
		this.id = id;
		this.pixKey = pixKey;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPixKey() {
		return pixKey;
	}

	public void setPixKey(String pixKey) {
		this.pixKey = pixKey;
	}
	
}
