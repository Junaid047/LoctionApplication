package com.Webservice.practiceWebservice.practicePackage;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
public class HelloWorldController	{
	
	@Autowired
	private MessageSource msgSource;
	
	@GetMapping(path="/welcome")
	public String welcomeMessage()	{
		return "Hello World !";
	}
	
	@GetMapping(path="/welcome-bean")
	public WelcomeBean welcomeNewMesssage()	{
		return new WelcomeBean("Salam to every body");
	}
	
	@GetMapping(path="/welcome-international")
	public String welcomeAboard(@RequestHeader (name="Accept-language",required=false) Locale locale)	{
		return msgSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
	}
}