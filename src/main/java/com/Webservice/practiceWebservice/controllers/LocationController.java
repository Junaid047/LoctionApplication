package com.Webservice.practiceWebservice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocationController {

	@RequestMapping("/ShowCreate")
	public String showCreate()	{
		return "createLocation";
	}
}
