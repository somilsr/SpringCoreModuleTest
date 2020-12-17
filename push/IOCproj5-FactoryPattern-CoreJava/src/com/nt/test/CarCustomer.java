package com.nt.test;

import com.nt.component.ICar;
import com.nt.factory.CarFactory;

public class CarCustomer {

	public static void main(String[] args) {
		ICar car = CarFactory.getInstance("sport");
		car.drive();
		car.addAccessories();
		ICar car1 = CarFactory.getInstance("budget");
		car1.drive();
		car1.addAccessories();

		ICar car2 = CarFactory.getInstance("luxory");

		car2.drive();
		car2.addAccessories();
	}

}
