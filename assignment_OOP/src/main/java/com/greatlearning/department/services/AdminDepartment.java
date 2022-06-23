package com.greatlearning.department.services;

class AdminDepartment extends SuperDepartment {
	
	public String departmentName()
	{
		return "Admin Department";					//overrides the departmentName()
	}
	
	public String getTodaysWork()
	{
		return "Complete your documents Submission";	//overrides getTodaysWork()
	}
	
	public String getWorkDeadline()
	{
		return "Complete by EOD";						//overrides getWorkDeadline()
	}
	
}