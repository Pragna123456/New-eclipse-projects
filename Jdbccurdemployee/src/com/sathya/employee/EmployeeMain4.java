package com.sathya.employee;

import java.sql.SQLException;
import java.util.List;
class EmployeeMain4{
	public static void main(String[] args) throws SQLException {
		EmployeeDao dao = new EmployeeDao();
		List<Employee> employees=dao.findAll();
		employees.forEach(employee->System.out.println(employee));
	}
}
