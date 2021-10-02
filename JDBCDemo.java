package com.day16;
import java.sql.Connection;
import java.sql.DriverManager;
public class JDBCDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//Step 1 - load the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Step 2 - Establish a connection
				
				Connection con=
				DriverManager.getConnection("jdbc:mysql://localhost/TrainingSession","root","root");
				
				System.out.println(con);
			}
		
	}


