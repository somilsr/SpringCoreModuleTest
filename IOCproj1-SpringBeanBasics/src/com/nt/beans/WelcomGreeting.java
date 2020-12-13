package com.nt.beans;

public class WelcomGreeting {

	static {
		System.out.println("WelcomeGreeting.Static block");
	}
	
public WelcomGreeting() {
	System.out.println("WelcomeGreetings :- 0 param constructor");
}
public String welcome(String user) {
	return "welcome to string::"+user;
}

}
