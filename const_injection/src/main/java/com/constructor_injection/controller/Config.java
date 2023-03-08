package com.constructor_injection.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.constructor_injection.entity.Subject;
import com.constructor_injection.entity.Trainer;

//Spring Configuration annotation indicates that the class has @Bean definition methods
@Configuration
public class Config {
	//Spring @Bean Annotation is applied on a method to specify that it returns a bean to be managed by Spring context
	@Bean
	public Subject subject ()
	{
       return new Subject ("Java");
  
    }
	@Bean
	public Trainer trainer (Subject subject)
	{
       return new Trainer (subject);
  
    }
	
}



