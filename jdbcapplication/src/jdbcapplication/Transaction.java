package jdbcapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Transaction {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","pragna","naveen");
		Statement statement = connection.createStatement();
		connection.setAutoCommit(false);
		
		try {
			statement.executeUpdate("insert into emp values(1001,'ashok',10000.45)");
			statement.executeUpdate("insert into emp values(1002,'anil',20000.45)");
			statement.executeUpdate("insert into emp values(1003,'anish',30000.45)");
			statement.executeUpdate("delete from emp where eid=1001");
			connection.commit();		
			System.out.println("transaction is Success");
		}
		catch(SQLException e)
		{	connection.rollback();
		System.out.println("transaction is fail & rollbacked");	
		}
		finally {
			connection.close();
			statement.close();			
		}
		System.out.println("Operations are completed.....");
	}
}
	
		
		

