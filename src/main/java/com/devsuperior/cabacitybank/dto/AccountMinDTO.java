package com.devsuperior.cabacitybank.dto;

import com.devsuperior.cabacitybank.entities.Account;

public class AccountMinDTO {

	private Long id;
	private String name;
	private String pixKey;	
	
	public AccountMinDTO() {
	}

	public AccountMinDTO(Account entity) {
		id = entity.getId();
		name = entity.getName();
		pixKey = entity.getPixKey();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPixKey() {
		return pixKey;
	}

}
