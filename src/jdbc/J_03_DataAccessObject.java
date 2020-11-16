package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class J_03_DataAccessObject {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
		
		//	Connect with database.
		dao.connect();
		
		//	Find the user name which has the user id 7. 
		Student s1 = dao.getUsername(7);
		System.out.println(s1.username);
		
		//	Add Student details into the database.
		Student s2 = new Student();
		s2.userid = 47;
		s2.username = "Amit Minu";
		dao.addStudent(s2);
		
	}
	
}

class StudentDAO implements MysqlPass{
	private Connection con;
	
	//	Connect with MySQL Database.
	public void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, UNAME, PASS);
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
				
		}
		
	}
	
	//	Get user name from database.
	public Student getUsername(int userid) {
		Student s = new Student();
		String query = "select username from student where userid="+userid;
		
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			String name = rs.getString("username");
			s.username = name;
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		
		return s;
	}
	
	//	Add student information into the database.
	public void addStudent(Student s2) {
		String query = "insert into student values(?, ?)";
		
		try {
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, s2.userid);
			pst.setString(2, s2.username);
			int row = pst.executeUpdate();
			
			System.out.println(row + " row/s effected.");
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
	}
}

class Student{
	int userid;
	String username;
}
