package com.Webservice.practiceWebservice.userServicePkg;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.Webservice.practiceWebservice.ExceptionHandling.UserNotFoundException;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;

	@GetMapping(path="/users/{id}")
	public User findOne(@PathVariable int id)	{
		User user = service.findOne(id);
		if(user==null)	{
			throw new UserNotFoundException("id: " +id);
		}
		return user;
	}
	
	@GetMapping(path="/users")
	public List<User> findAll()	{
		return service.findAll();
	}
	
	@PostMapping(path="/users")
	public ResponseEntity<Object> CreateUser(@RequestBody User user)	{
		User savedUser = service.Save(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
				.buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}

	@DeleteMapping(path="/users/{id}")
	public void deleteById(@PathVariable int id)	{
		User user = service.deleteById(id);
		if(user==null) {
			throw new UserNotFoundException("id: "+id);
		}
	}
}
