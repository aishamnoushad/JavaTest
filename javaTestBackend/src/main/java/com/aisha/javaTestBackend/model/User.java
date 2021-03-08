package com.aisha.javaTestBackend.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;
@Entity
@EntityScan(basePackages = { "com.aisha.javaTestBackend.model" })
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long  user_id;
	
	@Column(name="username")
	private String username;
	
	@Column(name="loginStatus")
	private String loginStatus;
	
	@Column(name="userpassword")
	private String Password;
	


	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name="user_roles" ,joinColumns =  @JoinColumn(name="user_id") , inverseJoinColumns =  @JoinColumn(name="role_id") )
	private Set<Role> roles;
 	
	public User() {
		
	}
public User(String status) {
		this.loginStatus = status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public User(String username, String loginStatus, String password, Set<Role> roles) {
		super();
		this.username = username;
		this.loginStatus = loginStatus;
		Password = password;
		this.roles = roles;
	}

	
	
	
	
}
