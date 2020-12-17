package com.nt.factory;

import com.nt.components.BlueDartCourier;
import com.nt.components.DTDCCourier;
import com.nt.components.EkartCourier;
import com.nt.components.ICourier;

public class FlipkartFactory {
	
public static ICourier getInstance(String service) {
	ICourier courier=null;
	if(service.equalsIgnoreCase("bluedert"))
		courier=new BlueDartCourier();
	else if(service.equalsIgnoreCase("DTDC"))
	courier=new DTDCCourier();
	else if(service.equalsIgnoreCase("ekart"))
		courier=new EkartCourier();
	else
		throw new IllegalArgumentException("invalid choise");
	return courier;
	
}
}
