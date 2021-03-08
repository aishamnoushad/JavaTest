package com.aisha.javaTestBackend.model;

import java.time.LocalDate;



import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.aisha.javaTestBackend.service.LocalDateConverter;

@Entity
@Table(name="statement")
public class Statement {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
//	@ManyToOne
//	@JoinColumn(name = "forumId")
	@Column(name="account_id" )
	private int accountIid;
	
	@Column(name="datefield")
	@Convert(converter = LocalDateConverter.class)
	private LocalDate  datefield;
	
	@Column(name="amount")
	private double amount;
	
//	@ManyToOne
//	@JoinColumn(name="id")
//	private Account account;

	public Statement() {
		
	}
	
	public Statement(int account_id, LocalDate datefield, double amount) {
		super();
		this.accountIid = account_id;
		this.datefield = datefield;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccountIid() {
		return accountIid;
	}

	public void setAccountIid(int account_id) {
		this.accountIid = account_id;
	}

	public LocalDate getDatefield() {
		return datefield;
	}

	public void setDatefield(LocalDate datefield) {
		this.datefield = datefield;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
