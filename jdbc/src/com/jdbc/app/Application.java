package com.jdbc.app;

import java.sql.SQLException;

import com.jdbc.controllers.YoucodeTestControllers;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
		YoucodeTestControllers c= new YoucodeTestControllers();
		c.ShowData();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
