package com.example.demo.display;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Display {
	@GetMapping("/hello")
 public String display()
 {
	 return "Hello World";
 }
}
