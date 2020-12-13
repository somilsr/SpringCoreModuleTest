package com.nt.components;

public class userTest {
	private int a,b;
	static {
		System.out.println("test static block()");
		
	}
	
	public userTest() {
		System.out.println("Test 0 param constructor");
	}
	public userTest(int a,int b) {
		System.out.println("Test 2 param constructoe");
		this.a=a;
		this.b=b;
		
	}
	@Override
	public String toString() {
		return "userTest [a=" + a + ", b=" + b + "]";
	}
}
