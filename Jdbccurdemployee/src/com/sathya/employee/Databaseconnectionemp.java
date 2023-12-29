package com.sathya.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Databaseconnectionemp class



public class Databaseconnectionemp {
 // this is a method to create a connection
 public static Connection createConnection() {
     Connection connection = null;
     try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "pragna", "naveen");
     } catch (ClassNotFoundException | SQLException e) {
         e.printStackTrace();
     }
     return connection;
 }
}
