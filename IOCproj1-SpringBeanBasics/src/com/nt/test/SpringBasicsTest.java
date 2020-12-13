package com.nt.test;

import java.util.Date;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WelcomGreeting;

public class SpringBasicsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//locate and hold spring bean cfg file
		FileSystemResource res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//create ioc contaioner (XmlBeanFactory)
		XmlBeanFactory factory=new XmlBeanFactory(res);
		//get Spring bean class object from spring Container/ioc container
		Date d=(Date)factory.getBean("dt");
		 System.out.println("d obj data::"+d);
		 System.out.println("-------------------");
		 WelcomGreeting greetings=(WelcomGreeting)factory.getBean("wg");
			System.out.println("massage"+greetings.welcome("somil"));	
	}

}
