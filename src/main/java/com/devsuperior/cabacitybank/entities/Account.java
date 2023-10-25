package com.devsuperior.cabacitybank.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_account")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;           
	
	@Column(name = "account_number")
	private int accountNumber;     
	private int agency;            
	
	@Column(name = "balance_initial")
	private double balanceInitial; 
	
	@Column(name = "key_pix")
	private String pixKey;

	public Account() {
	}

	public Account(Long id, String name, int accountNumber, int agency, double balanceInitial, String pixKey) {
		
		this.id = id;
		this.name = name;
		this.accountNumber = accountNumber;
		this.agency = agency;
		this.balanceInitial = balanceInitial;
		this.pixKey = pixKey;
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

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	// Comparação de Transações por ID
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
