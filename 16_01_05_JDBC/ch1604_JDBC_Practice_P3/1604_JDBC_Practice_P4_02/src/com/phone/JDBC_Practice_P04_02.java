package com.phone;
import java.sql.*;
public class JDBC_Practice_P04_02 {
	public static void main (String args[]) throws Exception {
		String url = "jdbc:mysql://localhost:3306/aliens?useSSL=false"; 
		String uname= "root";
		String password = "Pc1997=ch";
		//String query = "insert into student values (107, 'Jerry', 90, 19); ";
		int stud_id = 111;
		String stud_name = "Jonathan";
		int marks = 90;
		int age = 19;
		//String query = 
		// "insert into student values (" + stud_id + ", '" + stud_name + "', " + marks +  ", " + age + "); ";
		String query = "insert into student values (?, ?, ?, ?); ";
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 3. Connection
		Connection con = DriverManager.getConnection(url, uname, password);
		//Statement st = con.createStatement ();
		PreparedStatement st = con.prepareStatement (query);
		st.setInt (1, stud_id);
		st.setString(2, stud_name);
		st.setInt(3, marks);
		st.setInt(4, age);
		int rowCnt = st.executeUpdate();
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
