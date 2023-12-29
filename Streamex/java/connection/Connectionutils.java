package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connectionutils {
 public static void main(String[] args) throws SQLException, ClassNotFoundException {
	 Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pragna","naveen");
		
		  /***Statement statement = connection.createStatement();

	        // Check if the table exists
	        ResultSet resultSet = statement.executeQuery("SELECT table_name FROM user_tables WHERE table_name = 'OKRAM'");
	        boolean tableExists = resultSet.next();

	        // Create the table only if it doesn't exist
	        if (!tableExists) {
	            statement.addBatch("create table okram(color varchar2(30), height number)");
	        }

	        // Insert data, delete, and drop
	        statement.addBatch("insert into okram values('black',5.6)");
	        statement.addBatch("insert into okram values('red',6.6)");
	        statement.addBatch("insert into okram values('green',7.6)");
	        statement.addBatch("delete from okram where height >= 6.0");
	       // statement.addBatch("drop table okram");

	        int[] results = statement.executeBatch();

	        for (int result : results) {
	            System.out.println(result);
	        }

	        connection.close();***/

		/***Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		ResultSet set = statement.executeQuery("select * from okram");
		set.afterLast();
		while(set.previous())
		{	System.out.println(set.getString(1)+" "+set.getDouble(2));
		}
		
		set.first();
		System.out.println("this is first.."+set.getString(1));
		
		set.last();
		System.out.println("this is last..."+set.getString(1));
		
		set.absolute(3);
		System.out.println("This is 3rd...."+set.getString(1));
		
		connection.close();
		System.out.println("Operations are completedd....");
	   ***/

		Statement statement = connection.createStatement();
		
		ResultSet set = statement.executeQuery("select * from okram");
		while(set.next())
		{	System.out.println(set.getString(1)+" "+set.getDouble(2));
		}
		
		connection.close();
	    }
	    
	}