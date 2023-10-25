package com.devsuperior.cabacitybank.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.cabacitybank.dto.AccountDTO;
import com.devsuperior.cabacitybank.dto.AccountMinDTO;
import com.devsuperior.cabacitybank.entities.Account;
import com.devsuperior.cabacitybank.repositories.AccountRepository;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Transactional(readOnly = true)
	public AccountDTO findById(Long id) {
		Account result = accountRepository.findById(id).get();
		return new AccountDTO(result);
		
	}
	
	@Transactional(readOnly = true)
	public List<AccountMinDTO> findAll() {
		List<Account> result = accountRepository.findAll();
		return result.stream().map(x -> new AccountMinDTO(x)).toList();
	}

}
