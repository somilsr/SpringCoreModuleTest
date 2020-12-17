package com.nt.components;

public class BlueDartCourier implements ICourier {

	@Override
	public void dispached() {
		System.out.println("BlueDartCourier.dispached()");

	}

	@Override
	public void OnTheWay() {
		System.out.println("BlueDartCourier.OnTheWay()");

	}

	@Override
	public void Delivered() {
		System.out.println("BlueDartCourier.Delivered()");

	}

}
