package com.aisha.javaTestBackend.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserDetailsService userDetailsService;
   @Override
	protected void configure(HttpSecurity http) throws Exception{
	   http.csrf().
       disable().cors().disable();
           
//		http.httpBasic().and().authorizeRequests().antMatchers("/rest/**").authenticated().anyRequest().permitAll().and()
//		.authorizeRequests().antMatchers("/secure/**").hasAnyRole("admin").anyRequest().authenticated().and()
//		.formLogin().permitAll();
		  http
	        .httpBasic()
	            .and()
	        .authorizeRequests()
	            .antMatchers("/rest/**").permitAll()
	            .and()
	        .authorizeRequests()
	            .antMatchers("/secure/**").hasAnyRole("admin")
	            .anyRequest().authenticated()
	            .and()
	        .formLogin()
	            .permitAll();
	}
//   @Bean
//   public BCryptPasswordEncoder passwordEncoder() {
//	   
//       return new BCryptPasswordEncoder();
//   }
//   @SuppressWarnings("deprecation")
//   @Bean
//   public static NoOpPasswordEncoder passwordEncoder() {
//   return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
//   }
   @Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	   
//		auth.userDetailsService(userDetailsService);
	   auth.inMemoryAuthentication().withUser("admin").password("{noop}admin").roles("admin")
	   	.and().withUser("user").password("{noop}user").roles("user");
	}
   
}
