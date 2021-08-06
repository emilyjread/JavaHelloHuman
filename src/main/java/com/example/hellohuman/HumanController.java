package com.example.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	
	public static void main(String[] args) {
		SpringApplication.run(HellohumanApplication.class, args);
		
	}
	
	@RequestMapping("/")
    public String index(@RequestParam(value="q", required=false) String firstName, @RequestParam(value="n", required=false) String lastName) {
		if (firstName==null) {
			firstName= "Human";
		}
		if (lastName==null) {
			lastName= "";
		}
        return "<a href='/'>Go Back<a/> <h1 style= 'text-align: center; color: green'> Hello " + firstName + " " +lastName + "! </h2> <p style= 'text-align: center; color: green'>Welcome to Spring Boot!</p>";
    }

}
