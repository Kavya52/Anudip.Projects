package anudip.org;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DemoPreparedStmt {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/kavyadb1";// add your database name at myproject
		String username = "root";// add your username of mysql
		String pwd = "Kavya@123";// add password of mysql

		// 3.establishing connection
		Connection con = DriverManager.getConnection(url, username, pwd);
		
		PreparedStatement pst=con.prepareStatement("insert into employee(?,?)");
		pst.setInt(1, 3);
		pst.setString(1,"Kavya");
		int i=pst.executeUpdate();
		
		pst.setInt(1, 4);
		pst.setString(2,"Kalyani");
		i+=pst.executeUpdate();
		
		
		System.out.println("No.of Rows inserted:"+i);
		con.close();
		 pst.close();
	}

}

