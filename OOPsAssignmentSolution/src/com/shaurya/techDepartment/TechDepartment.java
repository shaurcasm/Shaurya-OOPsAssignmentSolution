package com.shaurya.techDepartment;

import com.shaurya.SuperDepartment.SuperDepartment;

public class TechDepartment extends SuperDepartment {

	public String departmentName() {
		String name = " Tech Department";
		
		return name;
	}
	
	public String getTodaysWork() {
		String today = "Complete coding of Module 1";
		
		return today;
	}
	
	public String getWorkDeadline() {
		String deadline = "Complete by EOD ";
		
		return deadline;
	}
	
	public String getTechStackInformation() {
		String stackInformation = "Core Java";
		
		return stackInformation;
	}
}
