package com.nt.factory;

import com.nt.components.AngularCourse;
import com.nt.components.DotNetCourse;
import com.nt.components.ICourse;
import com.nt.components.JavaCourse;
import com.nt.components.OracleDbCourse;

public class StudentFactory {
	public static ICourse getInstance(String type) {
		ICourse course=null;
		if(type.equalsIgnoreCase("java"))
			course=new JavaCourse();
		else if(type.equalsIgnoreCase("dotnet"))
			course=new DotNetCourse();
		else if(type.equalsIgnoreCase("angular"))
			course=new AngularCourse();
		else if(type.equalsIgnoreCase("oracle"))
			course =new OracleDbCourse();
		return course;
		
	}

}
