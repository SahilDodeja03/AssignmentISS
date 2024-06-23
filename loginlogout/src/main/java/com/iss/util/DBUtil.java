package com.iss.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    private static final String URL = "jdbc:sqlserver://DESKTOP-1MPDT90\\SQLEXPRESS:51270;databaseName=ISS_TRAINING;encrypt=true;trustServerCertificate=true";
    private static final String USERNAME = "happy";
    private static final String PASSWORD = "happy";  // change password

    static {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        System.out.println("Got request for connection");
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

}