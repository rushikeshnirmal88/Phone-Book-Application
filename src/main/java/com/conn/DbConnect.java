package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {

	private static Connection conn;
	
	public static Connection getConn()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			String url="jdbc:mysql://localhost:3306/phonebook";
			
			 conn=DriverManager.getConnection(url,"root","Rushi@801");
			 System.out.println(conn);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}
