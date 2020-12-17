package com.nt.components;

public class OracleDbCourse implements ICourse {

	@Override
	public void onlineCourse() {
		System.out.println("OracleDbCourse.onlineCourse()");

	}

	@Override
	public void ClassRoomCourse() {
		System.out.println("OracleDbCourse.ClassRoomCourse()");

	}

	@Override
	public void CourseMaterials() {
		System.out.println("OracleDbCourse.CourseMaterials()");

	}

	@Override
	public void CourseDuration() {
		System.out.println("OracleDbCourse.CourseDuration()");

	}

	@Override
	public void CourseTiming() {
		System.out.println("OracleDbCourse.CourseTiming()");

	}

	@Override
	public void CourseCertificate() {
		System.out.println("OracleDbCourse.CourseCertificate()");

	}

}
