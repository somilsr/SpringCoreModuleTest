package com.nt.components;

public class DTDCCourier implements ICourier {

	@Override
	public void dispached() {
		System.out.println("DTDCCourier.dispached()");

	}

	@Override
	public void OnTheWay() {
		System.out.println("DTDCCourier.OnTheWay()");

	}

	@Override
	public void Delivered() {
		System.out.println("DTDCCourier.Delivered()");

	}

}
