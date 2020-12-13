package com.nt.Test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishmassageGenrator;


public class ConstructorInjectionTest {

	public static void main(String[] args) {
		//hold the name and location of spriing bean file
		FileSystemResource res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		//create IOC Container
		XmlBeanFactory factory=new XmlBeanFactory(res);
		//get target spring bean class object
		WishmassageGenrator generator=(WishmassageGenrator)factory.getBean("wmg");
		//invoke the bussiness method
		 System.out.println("result is::-"+generator.generateWishMassage("raja"));
		 

	}

}
