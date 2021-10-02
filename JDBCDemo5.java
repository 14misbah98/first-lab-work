package com.day17;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBCDemo5 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");//registering the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/TrainingSession","root","root");
		
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery("select * from users");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString("upass"));
			System.out.println(rs.getInt("flag"));
		}
		
		PreparedStatement ps=con.prepareStatement("select * from users where uname=?");
		ps.setString(1, "ram");
		rs=ps.executeQuery();
		if(rs.next()) {
			System.out.println(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getString("upass")+"\t");
			System.out.print(rs.getInt("flag")+"\t");
		}
	}

}
