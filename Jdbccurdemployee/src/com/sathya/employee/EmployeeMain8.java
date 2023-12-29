package com.sathya.employee;

public class EmployeeMain8 {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
	       int count=dao.drop();
	       System.out.println("dropped"+count);
		}
	}
