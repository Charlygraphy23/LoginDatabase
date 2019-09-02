package com.company;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	        Class.forName("com.mysql.jdbc.Driver");
	        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
        System.out.println("Database is Connected "+connection.getCatalog());

      
    }
}
