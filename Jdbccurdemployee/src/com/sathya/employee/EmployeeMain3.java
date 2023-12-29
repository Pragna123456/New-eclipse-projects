package com.sathya.employee;

public class EmployeeMain3 {

	public static void main(String[] args) {
		 EmployeeDao dao = new EmployeeDao();
	       Employee employee=dao.findById("3sr");
	       if(employee!=null)
	       {
	     	System.out.println("employee availble");
	     	System.out.println(employee.getEmpId()+" "+employee.getEmpName()+" "+employee.getEmpSalary());  
	       }
	       else
	       {
	     	  System.out.println("employee not availble");
	       }
	     	}
	     

	}


