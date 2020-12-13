package com.nt.components;

public class DotNetCourse implements ICourse {

	@Override
	public void onlineCourse() {
		System.out.println("DotNetCourse.onlineCourse()");

	}

	@Override
	public void ClassRoomCourse() {
		System.out.println("DotNetCourse.ClassRoomCourse()");

	}

	@Override
	public void CourseMaterials() {
		System.out.println("DotNetCourse.CourseMaterials()");

	}

	@Override
	public void CourseDuration() {
		System.out.println("DotNetCourse.CourseDuration()");

	}

	@Override
	public void CourseTiming() {
		System.out.println("DotNetCourse.CourseTiming()");

	}

	@Override
	public void CourseCertificate() {
		System.out.println("DotNetCourse.CourseCertificate()");

	}

}
