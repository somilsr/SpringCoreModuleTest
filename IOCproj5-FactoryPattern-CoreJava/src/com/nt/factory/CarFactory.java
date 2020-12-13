package com.nt.factory;

import com.nt.component.BudgetCar;
import com.nt.component.ICar;
import com.nt.component.SportCar;

public class CarFactory {
	public static ICar getInstance(String type) {
		ICar car=null;
		if(type.equalsIgnoreCase("luxory"))
			car=new SportCar();
		else if(type.equals("budget"))
			car=new BudgetCar();
		else if(type.equalsIgnoreCase("sport"))
			car=new SportCar();
		else 
			throw new IllegalArgumentException("invalid inputs");
		return car;
			
	}
}
