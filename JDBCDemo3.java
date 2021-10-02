package com.day17;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
public class JDBCDemo3 {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");//registering the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/TrainingSession","root","root");
		
		System.out.println(con);
		
		System.out.println("Autocommit status..:"+con.getAutoCommit());
		con.setAutoCommit(false);
		System.out.println("Autocommit status..:"+con.getAutoCommit());
		System.out.println("Default Isolation level..:"+con.getTransactionIsolation());
		System.out.println("Value of Read Committed..:"+Connection.TRANSACTION_READ_COMMITTED);
		System.out.println("Value of Repeat Read ..:"+Connection.TRANSACTION_REPEATABLE_READ);
		System.out.println("Value of Transaction Serializable..:"+Connection.TRANSACTION_SERIALIZABLE);
		DatabaseMetaData dbmd=con.getMetaData();
		
		System.out.println("DbName..:"+dbmd.getDatabaseProductName());
		System.out.println("DbVersion..:"+dbmd.getDatabaseMajorVersion());
		
		con.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
		System.out.println("New Isolation Level..:"+con.getTransactionIsolation());
	}
}

