package com.greatlearning.department.services;

class HrDepartment extends SuperDepartment{
	
	public String departmentName()
	{
		return "HR Department";							//overrides the departmentName()
	}
	
	public String getTodaysWork()						//overrides getTodaysWork()
	{
		return "Fill today's timesheet and mark your attendance";
	}
	
	public String getWorkDeadline()						//overrides getWorkDeadline()
	{
		return "Complete by EOD";
	}
	
	public String doActivity()
	{
		return "team Lunch";
	}
	
}