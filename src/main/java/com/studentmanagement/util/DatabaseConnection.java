package com.studentmanagement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_project";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "your_mysql_password";

    private DatabaseConnection() {
    }

    public static Connection open() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
