package com.nt.beans;

public class WelcomeGreetings {
	static {
		System.out.println("Greeting Static Block");
	}
	WelcomeGreetings(){
		System.out.println("0 param Constructor Greetings");
	}
	public String welcome(String user) {
		return "welcome to string::"+user;
	}

}
