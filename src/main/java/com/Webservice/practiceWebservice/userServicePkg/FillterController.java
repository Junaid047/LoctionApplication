package com.Webservice.practiceWebservice.userServicePkg;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FillterController {

	@RequestMapping("/filtering")
	public SomeBean retrieveSomeBean() {
		return new SomeBean("Amit", "908765", 39000.00);
	}
	
	@RequestMapping("/filtering-list")
	public List<SomeBean> retrievListOfBean()	{
		return Arrays.asList(new SomeBean("ab","123",123.4),new SomeBean("xy","4312",345.34));
	}
}
