package com.day17;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class JDBCDemo4 {

	
		public static void main(String[] args)throws Exception {
			Class.forName("com.mysql.cj.jdbc.Driver");//registering the driver
			
			
			//con.setAutoCommit(false);
			
			//stmt.execute("insert into users values (5,'sony','spider',0)");
			
			//con.commit();
			
			cmMoneyTransfer("ramu","monu",5000);
		}
		
		public static void cmMoneyTransfer(String creditorName,String creditorName2, int amount) throws Exception{
			
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/TrainingSession","root","root");
		con.setAutoCommit(false);
		
		PreparedStatement pstmt=con.prepareStatement("update accounts set amount=? where accname=?");
		pstmt.setInt(1, amount);
		pstmt.setString(2, creditorName);
		int i=pstmt.executeUpdate();
		System.out.println("No of records updated...:"+i);
		
		
		pstmt=con.prepareStatement("update accounts set amount=? where accname=?");
		pstmt.setInt(1, amount);
		pstmt.setString(2, creditorName2);
		i=pstmt.executeUpdate();
		System.out.println("No of records updated...:"+i);
		if(i==1) {
			con.commit();
		}
		else {
			con.rollback();
		}
		
		
	
	}

}
