// EmployeeDao class
package com.sathya.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
    public int createEmptable() {
        Connection connection = null;
        Statement statement = null;
        int result = 0;
        try {
            connection = Databaseconnectionemp.createConnection();
            statement = connection.createStatement();
            result = statement.executeUpdate(
                    "CREATE TABLE employee_info(empId VARCHAR2(20) PRIMARY KEY, empName VARCHAR2(30), empSalary NUMBER(8,3))");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) connection.close();
                if (statement != null) statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }



//insert the data
public int saveEmployee(Employee e)
{
	int result =0;
	try(Connection connection=Databaseconnectionemp.createConnection())

	{
		//create the ps & params
		PreparedStatement preparedStatement=connection.prepareStatement("insert into employee_info values(?,?,?)");
		//set the params
		preparedStatement.setString(1,e.getEmpId());
		preparedStatement.setString(2,e.getEmpName());
		preparedStatement.setDouble(3,e.getEmpSalary());

		//execute the query
		result=preparedStatement.executeUpdate();		
	} catch (Exception e2) {
	
	        e2.printStackTrace(); 	
	}
return result;
}
public Employee findById(String empId)
{	Employee e = null;
	try(Connection connection = Databaseconnectionemp.createConnection())
	{	//create the PS object 
		PreparedStatement preparedStatement = connection.prepareStatement("select * from employee_info where empId=?");
		//set the data to params 
		preparedStatement.setString(1, empId);
		//execute the query. 
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next())
		{	//read the data from ResultSer & setting to product
			e = new Employee();
			e.setEmpId(resultSet.getString(1));
			e.setEmpName(resultSet.getString(2));
			e.setEmpSalary(resultSet.getDouble(3));
		}
	}
	catch(SQLException e3)
	{	e3.printStackTrace();
	}
	return e;
}

//select all
public List<Employee> findAll()
{	List<Employee> employees = new ArrayList<Employee>();
	Employee e = null;
	try(Connection connection = Databaseconnectionemp.createConnection())
	{
		Statement statement = connection.createStatement();
		ResultSet resultSet =  statement.executeQuery("select * from employee_info");
		
		while(resultSet.next())
		{	//read the data from ResultSer & setting to product
			e = new Employee();
			e.setEmpId(resultSet.getString(1));
			e.setEmpName(resultSet.getString(2));
			e.setEmpSalary(resultSet.getDouble(3));
			
			//adding the product into List.
			employees.add(e);
		}
	}
	catch (SQLException e4) {
		e4.printStackTrace();
	}
	return employees;
}

//update by salary
 public int updateEmployee(double salary,double incVal ) {
	int result=0;
	try(Connection connection = Databaseconnectionemp.createConnection())
	{
	PreparedStatement preparedStatement=connection.prepareStatement(
			"update employee_info set empSalary=empSalary+? where empSalary>?");
	preparedStatement.setDouble(1, incVal);
	preparedStatement.setDouble(2, salary);
	result=preparedStatement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	 return result;
	
} 
 //delete by id
public int deleteById(String empId) {
	int result=0;
	try(Connection connection = Databaseconnectionemp.createConnection())
	{
	PreparedStatement preparedStatement=connection.prepareStatement(
			"delete from employee_info where empId=?");
	preparedStatement.setString(1, empId);
	result=preparedStatement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
	return result;
	
}

//delete by salary
public int deleteBySalary(String empSalary) {
	int result=0;
	try(Connection connection = Databaseconnectionemp.createConnection())
	{
	PreparedStatement preparedStatement=connection.prepareStatement(
			"delete from employee_info where empSalary<=?");
	preparedStatement.setDouble(1,200 );
	result=preparedStatement.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}
		
	return result;
}
//dropped table
 public int drop() {
   
	 int result =0;
		try(Connection connection = Databaseconnectionemp.createConnection())
		{
			Statement statement=connection.createStatement();
		result=statement.executeUpdate("drop table employee_info");
		} catch (SQLException e) {
			e.printStackTrace();
		}	 
	 return result;
	
}
}
 
 
 
 
 
 
 


















