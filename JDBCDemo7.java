package com.day17;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
public class JDBCDemo7 {
public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");//registering the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/TrainingSession","root","root");
		
		//CallableStatement cs=con.prepareCall("{call proc1(?)}");
		
		//cs.registerOutParameter(1, Types.INTEGER);
		
		//cs.execute();
		
	//	int rowCount=cs.getInt(1);
		//System.out.println("No of Records...:"+rowCount);
		
		CallableStatement cs=con.prepareCall("{call proc2(?,?)}");
		cs.setString(1, "ram");
		cs.registerOutParameter(2, Types.INTEGER);
		cs.execute();
		
		System.out.println("Flag value of...ram..:"+cs.getInt(2));
	}

}
