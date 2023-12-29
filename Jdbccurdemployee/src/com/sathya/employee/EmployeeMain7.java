package com.sathya.employee;

public class EmployeeMain7 {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
	       int count=dao.deleteBySalary("200");
	       System.out.println("updated"+count);
		}
	}


