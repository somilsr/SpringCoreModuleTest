package com.nt.components;

public class EkartCourier implements ICourier {

	@Override
	public void dispached() {
		System.out.println("EkartCourier.dispached()");

	}

	@Override
	public void OnTheWay() {
		System.out.println("EkartCourier.OnTheWay()");

	}

	@Override
	public void Delivered() {
		System.out.println("EkartCourier.Delivered()");

	}

}
