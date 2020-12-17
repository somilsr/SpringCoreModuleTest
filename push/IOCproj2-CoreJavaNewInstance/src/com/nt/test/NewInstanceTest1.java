package com.nt.test;

import java.lang.reflect.Constructor;

public class NewInstanceTest1 {

	public static void main(String[] args) throws Exception
		{
	
		// TODO Auto-generated method stub

		//load class
	Class c=Class.forName(args[0]);
	//get all declared constructor of load class
	Constructor cons[]=c.getDeclaredConstructors();
	//create object usign 0 param constructor
	Object obj1=cons[1].newInstance();
	System.out.println("obj1 data :- "+obj1);
	//create object 2 param constructor
	Object obj2=cons[0].newInstance(10,20);
	System.out.println("ob2 data 2 param "+obj2);
	}//exception
}//main method
