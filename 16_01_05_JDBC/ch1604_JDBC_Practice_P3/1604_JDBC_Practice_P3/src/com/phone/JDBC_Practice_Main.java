package com.phone;
import java.sql.*;

public class JDBC_Practice_Main {
	public static void main (String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/aliens?useSSL=false"; 
		String uname= "root";
		String password = "Pc1997=ch";
		String query = "select * from student";
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 3. Connection
		Connection con = DriverManager.getConnection(url, uname, password);
		System.out.println ("Conenction OK");
		Statement st = con.createStatement ();
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			String userData = rs.getString(1) + ": " + rs.getString(2);
			System.out.println ("userData: " + userData);
		}
		// Move to the second row.
//		rs.next(); //move the pointer first
//		userData = rs.getString(1) + ": " + rs.getString(2);
//		System.out.println ("userData: " + userData);
		st.close(); // close the statement.
		con.close(); // close the connection
	}
}