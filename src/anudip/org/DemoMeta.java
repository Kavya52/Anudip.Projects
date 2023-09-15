package anudip.org;

import java.sql.*;


public class DemoMeta {
	
	public static void main(String[]args)throws Exception{
     Class.forName("com.mysql.cj.jdbc.Driver");
     String url="jdbc:mysql://localhost:3306/kavyadb1";
     String userName="root";
     String pwd="Kavya@123";
     Connection con = DriverManager.getConnection(url,userName,pwd);
     Statement st=con.createStatement();
     
     ResultSet rset=st.executeQuery("select * from employee");
     
     ResultSetMetaData rsmd=rset.getMetaData();
     
     System.out.println("Table name:"+rsmd.getTableName(1));
     System.out.println("No.of Columns:"+rsmd.getColumnCount());
     System.out.println("Column Type:"+rsmd.getColumnTypeName(1));
     System.out.println("Column Type Name:"+rsmd.getColumnType(1));
     System.out.println("Column class Name:"+rsmd.getColumnClassName(1));
     System.out.println("Column Name:"+rsmd.getColumnName(1));
	}
}
	
