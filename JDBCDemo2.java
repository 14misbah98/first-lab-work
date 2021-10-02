package com.day17;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class JDBCDemo2 {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");//registering the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/TrainingSession","root","root");
		
		System.out.println(con);
		
		//with the con object, we can create a statement
		
		Statement stmt=con.createStatement();
		//execute method will return true, if the result of the execute method is ResultSet
		//boolean b=stmt.execute("insert into users values (3,'johny','spider',0)");
		boolean b=stmt.execute("select * from users");
		
		System.out.println(b);
	}
}

