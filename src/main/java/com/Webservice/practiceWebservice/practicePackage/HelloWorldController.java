package com.Webservice.practiceWebservice.practicePackage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController	{
	
	@GetMapping(path="/welcome")
	public String welcomeMessage()	{
		return "Hello World !";
	}
	
	@GetMapping(path="/welcome-bean")
	public WelcomeBean welcomeNewMesssage()	{
		return new WelcomeBean("Salam to every body");
	}
}