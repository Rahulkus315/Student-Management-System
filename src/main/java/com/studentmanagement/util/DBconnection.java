package com.studentmanagement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    private static final String URL =
            System.getenv().getOrDefault("DB_URL", "jdbc:mysql://127.0.0.1:3306/JDBC_demo");
    private static final String USERNAME =
            System.getenv().getOrDefault("DB_USERNAME", "root");
    private static final String PASSWORD =
            System.getenv().getOrDefault("DB_PASSWORD", "rahul@121");

    private DBconnection() {
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
