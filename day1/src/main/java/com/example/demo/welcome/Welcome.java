package com.example.demo.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
 public String name="Akila";
 @GetMapping("/wel")
 public String display()
 {
	 return "Welcome to RestApi"+name;
 }
}
