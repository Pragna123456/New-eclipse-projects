package com.sathya.userdetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
  
	public int saveUser(User user)
	{
		int result=0;
		Connection connection = BDConnection.createConnection();
		try {
			  PreparedStatement preparedStatement= 
	          connection.prepareStatement("insert into usertable1 values(?,?,?,?,?)");
			  preparedStatement.setString(1, user.getUserId());
			  preparedStatement.setString(2, user.getUserName());
			  preparedStatement.setString(3, user.getUserEmail());
			  preparedStatement.setString(4, user.getUserMobile());
			  preparedStatement.setString(5, user.getUserLocation());
			 result= preparedStatement.executeUpdate();
					  
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
}

	public User findById(String userId) {
		
		User user = null; 
	   try(Connection connection=BDConnection.createConnection())
		{
			PreparedStatement preparedStatement = connection.prepareStatement("select * from usertable1 where userId=?");
			preparedStatement.setString(1, userId);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next())
			{	user = new User();
				user.setUserId(resultSet.getString(1));
				user.setUserName(resultSet.getString(2));
				user.setUserEmail(resultSet.getString(3));
				user.setUserMobile(resultSet.getString(4));
				user.setUserLocation(resultSet.getString(5));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	// Change in findByLogin method
	public User findByLogin(String userName, String userEmail) {
	    User user = null;
	    try (Connection connection = BDConnection.createConnection()) {
	        PreparedStatement preparedStatement = connection.prepareStatement(
	                "select * from usertable1 where userName=? AND userEmail=?");
	        preparedStatement.setString(1, userName);
	        preparedStatement.setString(2, userEmail);
	        ResultSet resultSet = preparedStatement.executeQuery();

	        if (resultSet.next()) {
	            user = new User(); // Initialize the user object
	            user.setUserId(resultSet.getString(1));
	            user.setUserName(resultSet.getString(2));
	            user.setUserEmail(resultSet.getString(3));
	            user.setUserMobile(resultSet.getString(4));
	            user.setUserLocation(resultSet.getString(5));
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return user;
	}
	
	public List<User> findAll() {
	    List<User> users = new ArrayList<>();
	    try (Connection connection = BDConnection.createConnection()) {
	        // create the statement object
	        Statement statement = connection.createStatement();

	        // execute the query
	        ResultSet resultSet = statement.executeQuery("select * from usertable1");

	        while (resultSet.next()) {
	            User user = new User();
	            user.setUserId(resultSet.getString(1));
	            user.setUserName(resultSet.getString(2)); // Corrected method
	            user.setUserEmail(resultSet.getString(3)); // Corrected method
	            user.setUserMobile(resultSet.getString(4)); // Corrected method
	            user.setUserLocation(resultSet.getString(5)); // Corrected method
	            users.add(user);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return users;
	}

	public User deleteById(String userId) {
		User user = null; 
       try(Connection connection=BDConnection.createConnection()){
    	
			PreparedStatement preparedStatement = connection.prepareStatement("delete from usertable1 where userId=?");
			preparedStatement.setString(1, userId);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next())
			{	user = new User();
				user.setUserId(resultSet.getString(1));
				user.setUserName(resultSet.getString(2));
				user.setUserEmail(resultSet.getString(3));
				user.setUserMobile(resultSet.getString(4));
				user.setUserLocation(resultSet.getString(5));
			}   
       } catch (SQLException e) {
		e.printStackTrace();
	}
				return user;
	}
}

	
	
	
	
	
	
	
