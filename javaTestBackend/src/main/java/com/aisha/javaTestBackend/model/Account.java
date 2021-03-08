package com.aisha.javaTestBackend.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	@Column(name="account_type")
	private String account_type;
	@Column(name="account_number")
	private String account_number;
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinTable(name="account-statements" ,joinColumns =  @JoinColumn(name="id") , inverseJoinColumns =  @JoinColumn(name="account_id") )
//	@OneToMany
//	@JoinColumn(name="account_id")
//	private List<Statement> statements;
	
	public String getAccount_type() {
		return account_type;
	}
	public Account() {
		
	}
	public Account(String account_type, String account_number) {
	super();
	this.account_type = account_type;
	this.account_number = account_number;
}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}

//@OneToMany
//@JoinColumn(name="account_id" ,referencedColumnName ="id") 
