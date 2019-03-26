package com.phone;
import java.sql.*;
/*
 * Follow the seven steps in JDBC:
 * 1. import ---> java.sql
 * 2. load and register the driver 
 * ---> com.mysql.jdbc.Driver (download mysql.connector.jar)
 * 3. Create connection ---> Connection interface
 * 4. Create statement ---> Statement interface
 * 5. Execute the query -->
 * 6. process the results -->
 * 7. close
 */
public class JDBCPracticeMain {
	public static void main (String[] args) throws Exception {
		// We do not have database yet.
		//String url = ""; 
		// We have database aliens.
		String url = "jdbc:mysql://localhost:3306/aliens?useSSL=false"; 
		String uname= "root";
		String password = "Pc1997=ch";
		String query = "select * from student";
		// 2.b: Class.forName(className); 
		// className must be a qualified name: com.mysql.jdbc.Driver
		// The following is deprecated.
		// Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 3. Connection

		// For database, you can use Oracle, MySQL, or MS Access.
		System.out.println ("url: " + url);
		System.out.println ("uname: " + uname);
		System.out.println ("password: " + password);
		Connection con = DriverManager.getConnection(url, uname, password);
		System.out.println ("Conenction OK");
		Statement st = con.createStatement ();
		ResultSet rs = st.executeQuery(query);
		rs.next(); //move the pointer first
		String name = rs.getString("stud_name");
		System.out.println ("stud_name: " + name);
		st.close(); // close the statement.
		con.close(); // close the connection
	}
}