//WishMassageGenerator.java(Targetclass)

package com.nt.beans;

import java.util.Date;

public class WishmassageGenrator {
	private Date date;

	public WishmassageGenrator(Date date) {
		super();
		System.out.println("WishMassageGenerator ::- 1 pparam Constructor");
		this.date = date;
	}
  

public String generateWishMassage(String user) {
	//get hours of the day
	int hour=date.getHours();//24 hours formate
	// generate wish massage 
	if(hour<12) {
		return "good mornig"+user;
	}
	else if(hour<16) {
		return "good afternood"+user;
	}
	else if(hour<20) {
		return "good Evening"+user;
	}
	else {
		return "good night"+user;
	}
}
	

}
