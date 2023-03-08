package com.constructor_injection.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.constructor_injection.entity.Trainer;


@RestController
//RestController annotation is used to create RESTful web services using Spring MVC

public class TrainerCon {
	private Trainer trainer;

	public TrainerCon(Trainer trainer) {
		super();
		this.trainer = trainer;
	}
	
	// It use for mapped the data
	@GetMapping("/teaching")
	public String teach()
	{
		trainer.teach();
		
		return "Training completed sucessfully!";
	}

}



