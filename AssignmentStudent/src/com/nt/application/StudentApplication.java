package com.nt.application;

import com.nt.components.ICourse;
import com.nt.factory.StudentFactory;

public class StudentApplication {

	public static void main(String[] args) {

		ICourse course = StudentFactory.getInstance("dotnet");

		course.onlineCourse();
		course.ClassRoomCourse();
		course.CourseMaterials();
		course.CourseDuration();
		course.CourseTiming();
		course.CourseCertificate();
	}

}
