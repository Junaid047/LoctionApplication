package com.Webservice.practiceWebservice.userServicePkg;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserService {

	public static List<User> users = new ArrayList();
	
	private static int usercount=3;
	
	static {
		users.add(new User(1, "Adam", new Date()));
		users.add(new User(2, "Eve", new Date()));
		users.add(new User(3, "Jack", new Date()));
	}
	
	public List<User> findAll()	{
		return users;
	}
	
	public User Save(User user)	{
		if(user.getId()==null)	{
			user.setId(++usercount);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id)	{
		for(User user:users)	{
			if(user.getId()==id)
				return user;
		}
		return null;
	}
	
}