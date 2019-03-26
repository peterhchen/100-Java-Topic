package com.phone;
import java.sql.*;

public class JDBC_Practice_P3_Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/aliens?useSSL=false"; 
		String uname= "root";
		String password = "Pc1997=ch";
		//String query = "insert into student values (107, 'Jerry', 90, 19); ";
		int stud_id = 109;
		String stud_name = "Jerry";
		int marks = 90;
		int age = 19;
		String query = 
		 "insert into student values (" + stud_id + ", '" + stud_name + "', " + marks +  ", " + age + "); ";
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 3. Connection
		Connection con = DriverManager.getConnection(url, uname, password);
		System.out.println ("Conenction OK");
		Statement st = con.createStatement ();
		System.out.println ("Statement done ");
		//int rowCnt = st.executeUpdate(query);
		int rowCnt = st.executeUpdate(query);
		System.out.println ("rowCnt: " + rowCnt);
		String query1 = "select * from student";
		ResultSet rs = st.executeQuery(query1);
		String userData ="";
		while (rs.next()) {
			userData = rs.getString(1) + ": " + rs.getString(2);
			System.out.println ("userData: " + userData);
		}
		st.close(); // close the statement.
		con.close(); // close the connection
	}
}
