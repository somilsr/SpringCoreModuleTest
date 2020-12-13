package com.nt.test;

public class NewInstanceTest {

	public static void main(String[] args) throws Exception{
		{
	
		// TODO Auto-generated method stub

		//load class
	Class c=Class.forName(args[0]);
	//create object
	Object obj=c.newInstance();
	System.out.println("data::-"+obj);
		}
	}//exception

}//main method
