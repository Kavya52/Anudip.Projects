package anudip.org;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeUpdate {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/kavyadb1";// add your database name at myproject
		String username = "root";// add your username of mysql
		String pwd = "Kavya@123";// add password of mysql

		// 3.establishing connection
		Connection con = DriverManager.getConnection(url, username, pwd);
		
		//To update a row of a employee table
		PreparedStatement pst=con.prepareStatement("update employee set empName=?where empId=?");
		pst.setString(1, "Queen");
		pst.setInt(2,4);
		
		int i=pst.executeUpdate();
		System.out.println("No.of rows updated:"+i);
		
		//Selecting student table
		ResultSet rst=pst.executeQuery("select * from student1");
		while(rst.next())
			System.out.println(rst.getInt(1)+""+rst.getString(2));
		con.close();
		pst.close();
	}

}
