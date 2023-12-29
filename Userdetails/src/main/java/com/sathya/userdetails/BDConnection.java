package com.sathya.userdetails;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDConnection {
  //This method create the connection && return the connection
	public static Connection createConnection() 
	{
		Connection connection=null;
	  try {
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    connection= DriverManager.getConnection
		    		("jdbc:oracle:thin:@localhost:1521:xe","pragna","naveen");
	} catch (ClassNotFoundException | SQLException e) {
	  e.printStackTrace();
	}	
		
		return connection;
		
	}
}
