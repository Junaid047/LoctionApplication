package com.Webservice.practiceWebservice.userServicePkg;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class DynamicFilterController {

	@RequestMapping("/dynamicFilter")
	public MappingJacksonValue retrieveSomeBean() {
		SomeNewBean someBean = new SomeNewBean("Amit", "9999", 1234.65);
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name","phone");
		FilterProvider filters = new SimpleFilterProvider().addFilter("someBeanFilter", filter);
		MappingJacksonValue mapping = new MappingJacksonValue(someBean);
		mapping.setFilters(filters);
		return mapping;
	}
	
	@RequestMapping("/dynamicFilters-list")
	public MappingJacksonValue retrieveAllNewSomeBean() {
		List<SomeNewBean> someBean = Arrays.asList(new SomeNewBean("Amit", "9999", 1234.65), new SomeNewBean("Sujit", "8888", 9876.23));
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name","salary");
		FilterProvider filters = new SimpleFilterProvider().addFilter("someBeanFilter", filter);
		MappingJacksonValue mapping = new MappingJacksonValue(someBean);
		mapping.setFilters(filters);
		return mapping;
	}
}
