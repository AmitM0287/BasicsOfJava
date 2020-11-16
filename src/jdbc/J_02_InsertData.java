package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J_02_InsertData implements MysqlPass {

	public static void main(String[] args) {
		int userid = 74;
		String username = "Minu Amit";
		
		String query = "insert into student values(?, ?)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL, UNAME, PASS);
			
//			We use preparedStatement when the values are unknown;
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, userid);
			pst.setString(2, username);
			
			int rowEffected = pst.executeUpdate();
			
			System.out.println(rowEffected + " row/s effected.");
			
			pst.close();
			con.close();
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
