package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * 	1. Import the package.			import java.sql.*;
 * 
 * 	2. Load and Register the Driver.
 * 		a> Load the Driver.		
 * 		b> Register the Driver. 	Class.forName("com.mysql.cj.jdbc.Driver");
 * 
 * 	3. Establish the Connection.	Connection con = DriverManager.getConnection(" URL ", " UNAME ", " PASS ");
 * 
 * 	4. Create the Statement.		Statement st = con.createStatement();
 * 
 *	5. Execute the Query.			ResultSet rs = st.executeQuery("select * from student");
 *
 *	6. Process the Result.			while(rs.next()){
 *										System.out.println(rs.getInt(1) + " " + rs.getString(2));	// Column Number.
 *									}
 *	7. Close.						con.close();
 *									st.close();
 */

public class J_01_StepsToConnectMySQL implements MysqlPass {

	public static void main(String[] args) {
		String query = "select * from student";
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL, UNAME, PASS);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
			
			st.close();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
