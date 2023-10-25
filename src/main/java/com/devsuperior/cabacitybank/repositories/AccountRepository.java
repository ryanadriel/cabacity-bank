package com.devsuperior.cabacitybank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.cabacitybank.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{
	
}
