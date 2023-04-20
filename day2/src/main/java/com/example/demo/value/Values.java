package com.example.demo.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Values {
	@Value("${pname:Akila}")
	public String pname;
	
	@GetMapping("/value")
	public String display()
	{
		return "My name is"+pname;
	}
}
