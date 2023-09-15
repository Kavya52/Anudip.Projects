package anudip.org;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Emp {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement stmt = null;
		ResultSet rset = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/Kavyadb1";// add your database name at myproject
			String user = "root";// add your username of mysql
			String pwd = "Kavya@123";// add password of mysql

			con = DriverManager.getConnection(url, user, pwd);
			
			stmt = con.createStatement();
			
			rset = stmt.executeQuery("SELECT * FROM emp1;");
			
			while (rset.next())
				System.out.println(rset.getInt("EmpId") + " " + rset.getString("EmpName"));

		} catch (Exception e)
		{
			System.out.println(e);
		}
		
		finally 
		{
			con.close();
			stmt.close();
			rset.close();

		}
	}

}


