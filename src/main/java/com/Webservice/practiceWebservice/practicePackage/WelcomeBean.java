package com.Webservice.practiceWebservice.practicePackage;

public class WelcomeBean {

	private String message;

	public WelcomeBean(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "WelcomeBean [message=" + message + "]";
	}
	
}
