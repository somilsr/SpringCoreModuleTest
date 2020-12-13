package com.nt.test;

import java.util.Date;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WelcomeGreetings;

public class springBasicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//locate and hold spring configration file
		FileSystemResource res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//create IOC container (XMLBean Container )
		XmlBeanFactory factory=new XmlBeanFactory(res);
		//create spring bean container for date class object
		//get Spring bean class object from spring Container/ioc container
		Date d=(Date)factory.getBean("dt");
		System.out.println("System Date"+d);
		System.out.println("----------------");
		WelcomeGreetings gt=(WelcomeGreetings)factory.getBean("wg");
		System.out.println("Greeting massage from User"+gt.welcome("somil"));
	}

}
