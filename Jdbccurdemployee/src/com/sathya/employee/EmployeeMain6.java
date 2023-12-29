package com.sathya.employee;

public class EmployeeMain6 {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
	       int count=dao.deleteById("3swer");
	       System.out.println("updated"+count);
		}
	

}
