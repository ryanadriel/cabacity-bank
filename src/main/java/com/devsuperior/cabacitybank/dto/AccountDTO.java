package com.devsuperior.cabacitybank.dto;

import org.springframework.beans.BeanUtils;

import com.devsuperior.cabacitybank.entities.Account;

public class AccountDTO {
	
	private Long id;
	private String name;
	private int accountNumber;     
	private int agency;
	private double balanceInitial;
	private String pixKey;
	
	public AccountDTO() {
	}
	
	public AccountDTO(Account entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAgency() {
		return agency;
	}

	public void setAgency(int agency) {
		this.agency = agency;
	}

	public double getBalanceInitial() {
		return balanceInitial;
	}

	public void setBalanceInitial(double balanceInitial) {
		this.balanceInitial = balanceInitial;
	}

	public String getPixKey() {
		return pixKey;
	}

	public void setPixKey(String pixKey) {
		this.pixKey = pixKey;
	}

}
