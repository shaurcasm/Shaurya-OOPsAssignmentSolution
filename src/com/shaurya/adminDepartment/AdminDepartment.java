package com.shaurya.adminDepartment;

import com.shaurya.SuperDepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

	public String departmentName() {
		String name = " Admin Department";
		
		return name;
	}
	
	public String getTodaysWork() {
		String today = "Complete your documents submission";
		
		return today;
	}
	
	public String getWorkDeadline() {
		String deadline = "Complete by EOD";
		
		return deadline;
	}
}
