package com.jdbc.controllers;

import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.config.Configuration;
import java.sql.Connection;
import java.sql.ResultSet;

public class YoucodeTestControllers {

	Configuration configuration;
	
	public YoucodeTestControllers() throws SQLException {
		
		configuration= new Configuration("jdbc:mysql://localhost:3306/test1","root","");
		
	}
	public void ShowData() throws SQLException{
		
		String sql = "select * from youcode_test";
		Connection c =configuration.Connect();
		Statement statement= c.createStatement();
		ResultSet r = statement.executeQuery(sql);
		
		while(r.next()) {
			System.out.println(r.getString(4));
		}
	}
}
