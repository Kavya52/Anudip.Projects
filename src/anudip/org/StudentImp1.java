package anudip.org;

   //1.import java packages
	import java.sql.*;
    import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;

   public class StudentImp1 {

		public static void main(String[] args) throws Exception {
			//2.loading the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//3.establishing connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kavyadb1", "root", "Kavya@123");
			
			//4.create statement
			Statement st=con.createStatement();
			
			//5.Execute the statement
			 ResultSet set=st.executeQuery("SELECT * FROM employee;");
			 
			 //6.Print the o/p
			 System.out.println("EmpId"+" "+"EmpName"+" "+"EmpAge"+" "+"EmpDept");
			 System.out.println();		
			 while(set.next())
				 System.out.println(set.getInt("EmpId")+"      "+set.getString("EmpName")+"      "+set.getInt("EmpAge")+"       "+set.getString("EmpDept"));
			 
			 
			 
			 //7.close the connections
			 con.close();
			 st.close();
			 set.close();
			
			
			

		}
	 
	}






