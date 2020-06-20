package com.Webservice.practiceWebservice.userServicePkg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersionController {

	@GetMapping(value="/person/param", params="version=1")
	//@GetMapping(value="/person/header", headers="X-API-VERSION=1")
	public Person1 personV1()	{
		return new Person1("Tom cruise");
	}
	
	@GetMapping(value="/person/param", params="version=2")
	//@GetMapping(value="/person/header", headers="X-API-VERSION=2")
	public Person2 personV2()	{
		return new Person2(new Name("Tom", "cruise"));
	}
}
