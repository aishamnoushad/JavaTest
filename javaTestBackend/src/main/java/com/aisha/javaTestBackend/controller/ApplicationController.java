package com.aisha.javaTestBackend.controller;


import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aisha.javaTestBackend.model.Account;
import com.aisha.javaTestBackend.model.SearchDetail;
import com.aisha.javaTestBackend.service.StatementService;
import com.aisha.javaTestBackend.model.Statement;
import com.aisha.javaTestBackend.repository.AccountRepository;

@RestController
@RequestMapping("/secure/rest/auth/")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders = "*")
public class ApplicationController {
	@Autowired
	private StatementService statementService;
	@Autowired
	private AccountRepository accountRepository;
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/process")
	public List<Account> getAccounts() {
		return accountRepository.findAll();
	}
	@PostMapping("/getStatements")
	public List<Statement> getTheStatementOfThisAccount(@RequestBody SearchDetail searchdetail ){
		return statementService.getSatementsOfTheGivenSearchCriteria(searchdetail);
	}
}
