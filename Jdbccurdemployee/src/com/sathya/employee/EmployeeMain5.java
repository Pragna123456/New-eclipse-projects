package com.sathya.employee;

public class EmployeeMain5 {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
       int count=dao.updateEmployee(300, 70);
       System.out.println("updated"+count);
	}

}
