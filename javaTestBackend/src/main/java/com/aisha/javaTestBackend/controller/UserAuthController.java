package com.aisha.javaTestBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aisha.javaTestBackend.model.Account;
import com.aisha.javaTestBackend.model.SearchDetail;
import com.aisha.javaTestBackend.model.Statement;
import com.aisha.javaTestBackend.model.User;
import com.aisha.javaTestBackend.repository.UserRepository;
import com.aisha.javaTestBackend.service.StatementService;

@RestController
//@RequestMapping("/api/v1")
@RequestMapping("/secure/rest/")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders = "*")
public class UserAuthController {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private StatementService statementService;
	
	
//	@PreAuthorize("hasAnyRole('admin')")
	
	@GetMapping(produces = "application/json")
	@RequestMapping({ "/validateLogin" })
	public User validateLogin() {
		return new User("User successfully authenticated");
	}
//	@PostMapping(path = "/process")
//	@PostMapping("/getStatements")
//	public List<Statement> getTheStatementOfThisAccount(@RequestBody SearchDetail searchdetail ){
//		return statementService.getSatementsOfTheGivenSearchCriteria(searchdetail);
//	}
	
	
	
	

}
