package anudip.org;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DemoEmployeeDelete {

	public static void main(String[] args) throws Exception {
      Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/Kavyadb1";// add your database name at myproject
			String username = "root";// add your username of mysql
			String pwd = "Kavya@123";// add password of mysql

			// 3.establishing connection
			Connection con = DriverManager.getConnection(url, username, pwd);
			//to delete a row of a employee table
			PreparedStatement pst=con.prepareStatement("delete from emp1 where EmpID=2");
			
			int i=pst.executeUpdate();
			System.out.println("No.of records deleted:"+i);
			con.close();
			pst.close();
	}
}

