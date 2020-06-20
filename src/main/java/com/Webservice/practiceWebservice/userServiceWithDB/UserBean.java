package com.Webservice.practiceWebservice.userServiceWithDB;

import java.util.Date;

import javax.persistence.Entity;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class UserBean	{
	
	@Id
	@GeneratedValue
	private Integer Id;
	
	@Size(min=2,message="name should have morethan 2 character")
	private String name;
	
	@Past
	private Date birthDate;
	
	protected UserBean()	{
		
	}

	public UserBean(Integer id, @Size(min = 2, message = "name should have morethan 2 character") String name,
			@Past Date birthDate) {
		super();
		Id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
}
