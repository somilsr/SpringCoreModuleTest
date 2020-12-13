package com.nt.application;

import com.nt.components.ICourier;
import com.nt.factory.FlipkartFactory;


public class ApplicationTest {

	public static void main(String[] args) {
		ICourier courier=FlipkartFactory.getInstance("DTDC");
		courier.dispached();
		courier.OnTheWay();
		courier.Delivered();

	}

}
