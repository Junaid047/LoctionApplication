package com.Webservice.practiceWebservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Webservice.practiceWebservice.entities.Location;
import com.Webservice.practiceWebservice.service.LocationService;

@Controller
public class LocationController {
	
	@Autowired
	LocationService service;

	@RequestMapping("/ShowCreate")
	public String showCreate()	{
		return "createLocation";
	}
	
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap model)
	{
		Location locationSaved = service.saveLocation(location);
		String msg = "Successfully Created location with Id: "+locationSaved.getId();
		model.addAttribute("message", msg);
		return "createLocation";
	}
	
	@RequestMapping("/displayLocation")
	public String displayLocations(ModelMap model)	{
		List<Location> locations=service.getAllLocations();
		model.addAttribute("locations",locations);
		return "displayLocation";
	}
	
	@RequestMapping("/deleteLocation")
	public String deleteLocations(@RequestParam("id") int id, ModelMap model)	{
		Location location = new Location();
		location.setId(id);
		service.deleteLocation(location);
		List<Location> locations = service.getAllLocations();
		model.addAttribute("locations", locations);
		return "displayLocation";
	}
	
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap model)	{
		Location locations=service.getLocation(id);
		model.addAttribute("locations",locations);
		return "editLocation";
	}
	
	@RequestMapping("/updateLocation")
	public String updateLocation(@ModelAttribute("Location") Location location, ModelMap model)	{
		service.updateLocation(location);
		List<Location> locations = service.getAllLocations();
		model.addAttribute("locations",locations);
		return "displayLocation";
	}
}
