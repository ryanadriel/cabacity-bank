package com.devsuperior.cabacitybank.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.cabacitybank.dto.AccountDTO;
import com.devsuperior.cabacitybank.dto.AccountMinDTO;
import com.devsuperior.cabacitybank.services.AccountService;

@RestController
@RequestMapping(value = "/account")
public class AccountController {

	@Autowired
	private AccountService accountService;
	
	@GetMapping(value = "/{id}")
	public AccountDTO findBydId(@PathVariable Long id) {
		AccountDTO result = accountService.findById(id);
		return result;
	}
	
	@GetMapping
	public List<AccountMinDTO> findAll() {
		List<AccountMinDTO> result = accountService.findAll();
		return result;
	}
}
