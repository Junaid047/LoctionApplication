package com.Webservice.practiceWebservice.userServiceWithDB;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties.Tomcat.Resource;
import org.springframework.hateoas.server.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Webservice.practiceWebservice.ExceptionHandling.UserNotFoundException;

@RestController
public class UserJPAService {

	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/jpa/users")
	public List<UserBean> retrieveAllUser()	{
		return userRepo.findAll();
	}
	
	@GetMapping("/jpa/users/{id}")
	public UserBean retrieveUser(@PathVariable int Id)	{
		UserBean user = userRepo.findById(Id).get();
		if(user==null)
			throw new UserNotFoundException("Id: "+Id);

		return user;
	}
	
	@DeleteMapping("/jpa/users/{id}")
	public void deleteUser(@PathVariable int Id)	{
		userRepo.deleteById(Id);
	}
}
