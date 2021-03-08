package com.aisha.javaTestBackend.service;

import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.aisha.javaTestBackend.model.Role;
import com.aisha.javaTestBackend.model.User;

import com.aisha.javaTestBackend.repository.UserRepository;

@Service
public class customUserDetailsService implements  UserDetailsService {
//	HttpSession session = null;
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		System.out.println("the username is"+username);
		customUserDetails userDetails = null;
		if(user != null) {
			userDetails = new customUserDetails();
			userDetails.setUser(user);
			System.out.println("the password is"+user.getPassword());
			System.out.println("the user Details are"+userDetails.getUser().getRoles());
			if(userDetails.getUser().getRoles().iterator().hasNext()) {
				Set<Role> rolesList = userDetails.getUser().getRoles();
				for(Role role : rolesList){
					System.out.println("the user Details are role"+role.getRole());
					
				}
//				session.setAttribute("Roles", rolesList);
			}
			
		}else {
			throw new UsernameNotFoundException("User is not authorized to access the page");
		}
//		session.setAttribute("user", userDetails);
		System.out.println("the user Details are"+userDetails.getUser().getRoles());
		return userDetails;
	}
	
	


}
