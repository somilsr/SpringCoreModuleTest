package com.nt.component;

public class LuxoryCar implements ICar {

	@Override
	public void drive() {
		System.out.println("LuxoryCar.drive()");

	}

	@Override
	public void addAccessories() {
		System.out.println("LuxoryCar.addAccessories()");

	}

}
