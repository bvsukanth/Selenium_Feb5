package dBTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String host = "localhost";
		String port = "3306";
		// jdbc:mysql://localhost:3306/qademo
		Connection conn = DriverManager.getConnection("jdbc:mysql://"+ host + ":" +port+"/qademo", "root", "admin");
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("select * from Employee;");
		
		while(rs.next())
		{
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("empid"));
			System.out.println(rs.getString("location"));
			System.out.println(rs.getString("age"));
			System.out.println("*************************************");
		}

	}

}
