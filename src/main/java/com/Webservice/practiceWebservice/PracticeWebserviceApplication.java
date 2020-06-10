package com.Webservice.practiceWebservice;

import java.util.Locale;

import org.apache.tomcat.util.descriptor.LocalResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

@SpringBootApplication
public class PracticeWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeWebserviceApplication.class, args);
	}
	
	@Bean
	public AcceptHeaderLocaleResolver localResolver()	{
		AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);
		return localeResolver;
	}

	@Bean
	public ResourceBundleMessageSource messageSource()	{
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}
}
