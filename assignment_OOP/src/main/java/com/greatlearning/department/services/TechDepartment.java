package com.greatlearning.department.services;

public class TechDepartment extends SuperDepartment{
	
	public String departmentName()						//overrides the departmentName()
	{
		return "Tech Department";
	}
	
	public String getTodaysWork()						//overrides getTodaysWork()
	{
		return "Complete coding of Module 1";
	}
	
	public String getWorkDeadline()						//overrides getWorkDeadline()
	{
		return "Complete by EOD";
	}
	
	public String getTechStackInformation()
	{
		return "Core Java";
	}
	
}