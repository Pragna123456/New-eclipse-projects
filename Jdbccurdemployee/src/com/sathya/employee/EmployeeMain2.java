package com.sathya.employee;

public class EmployeeMain2 {

	public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDao();
       Employee employee1=new Employee();
       employee1.setEmpId("3ftp");
       employee1.setEmpName("hema");
       employee1.setEmpSalary(9824.00);
       int result = dao.saveEmployee(employee1);
       if(result==1)
       {
    	   System.out.println("data inserted scueesfully.."+result);
       }
       else
       {
    	   System.out.println("data inserted failes.."+result);

       }
       
	}

}
