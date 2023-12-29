package com.sathya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Dataconnection{
public static Connection createConnection() {
    Connection connection = null;
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe"
, "pragna", "naveen");
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
        // Handle the ClassNotFoundException (e.g., log it or throw a custom exception)
    } catch (SQLException e) {
        e.printStackTrace();
        // Handle the SQLException (e.g., log it or throw a custom exception)
    }
    return connection;
}
}
