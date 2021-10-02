package com.day17;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JDBCDemo6 {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");//registering the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/TrainingSession","root","root");
		
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery("select * from users");
		int collength=0;
		ResultSetMetaData rsmd=rs.getMetaData();
		collength=rsmd.getColumnCount();
		for(int i=1;i<=collength;i++) {
			System.out.print(rsmd.getColumnName(i)+"\t\t |");
		}
		System.out.println("\n___________________________________________________________________\n");
		while(rs.next()) {
			for(int i=1;i<=collength;i++) {
				System.out.print(rs.getString(i)+"\t\t |");
			}
			System.out.println();
		}
	}
}


