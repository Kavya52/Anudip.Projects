package anudip.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class BatchDemo 
{

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kavyadb1", "root", "Kavya@123");
		PreparedStatement pst = con.prepareStatement("select * from emp1");
		
		ResultSet rset = pst.executeQuery();
		while (rset.next())
			System.out.println(rset.getInt(1) + " " + rset.getString(2));

		// inserting records into the employee table
		
		pst.addBatch("insert into emp1 values(6,'Sanvi')");
		pst.addBatch("insert into emp1 values(7,'Rahim')");
		pst.addBatch("update emp1 set empName='Preetam' where empId=2");
		pst.addBatch("insert into emp1 values(8,'Saara')");
        
		int[] i = pst.executeBatch();

		System.out.println("No.of Records inserted :" + i.length);

	}

}
