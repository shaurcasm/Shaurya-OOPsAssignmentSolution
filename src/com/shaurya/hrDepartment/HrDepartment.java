package com.shaurya.hrDepartment;

import com.shaurya.SuperDepartment.SuperDepartment;

public class HrDepartment extends SuperDepartment {

	public String departmentName() {
		String name = " Hr Department";
		
		return name;
	}
	
	public String getTodaysWork() {
		String today = "Fill today's timesheet and mark your attendance";
		
		return today;
	}
	
	public String getWorkDeadline() {
		String deadline = "Complete by EOD ";
		
		return deadline;
	}
	
	public String doActivity() {
		String activity = "Team Lunch";
		
		return activity;
	}
}
