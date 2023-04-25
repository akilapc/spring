package com.spring.thirdday.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.thirdday.model.Student;
import com.spring.thirdday.service.StService;

@RestController
public class Controller {
	@Autowired
	
	public StService ser;
	@PostMapping("/ser")
	public Student postdata(@RequestBody Student st )
	{
			return ser.saveInfo(st);		
	}
			

}
