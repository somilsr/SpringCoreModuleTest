package com.nt.component;

public class SportCar implements ICar {

	@Override
	public void drive() {
		System.out.println("SportCar.drive() driving....");

	}

	@Override
	public void addAccessories() {
		System.out.println("SportCar.fitting addAccessories()");

	}

}
