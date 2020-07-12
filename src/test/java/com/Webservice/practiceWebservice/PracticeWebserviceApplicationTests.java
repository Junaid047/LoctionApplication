package com.Webservice.practiceWebservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.Webservice.practiceWebservice.repos.LocationRepository;

@SpringBootTest
class PracticeWebserviceApplicationTests {
	
	@Autowired
	private LocationRepository locationrepo;

	@Test
	public void testCreateStudent() {
		System.out.println("your test goes here");
	}

}
