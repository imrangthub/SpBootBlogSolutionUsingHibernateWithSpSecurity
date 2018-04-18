package com.imran.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

//	@Bean
//	public BCryptPasswordEncoder passwordEncoder() {
//		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
//		return bCryptPasswordEncoder;
//	}
	

	
	   @Bean
	    public PasswordEncoder passwordEncoder() {
	        return NoOpPasswordEncoder.getInstance();
	    }

}