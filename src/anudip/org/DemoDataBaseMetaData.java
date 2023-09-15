package anudip.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;



public class DemoDataBaseMetaData {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
        String url="jdbc:mysql://localhost:3306/kavyadb1";
        String userName="root";
        String pwd="Kavya@123";
        Connection con=DriverManager.getConnection(url,userName,pwd);
        
        DatabaseMetaData dbmd=con.getMetaData();
        
        System.out.println("DriverName:"+dbmd.getDriverName());
        System.out.println("Driver Version:"+dbmd.getDriverVersion());
        System.out.println("Product Name:"+dbmd.getDatabaseProductName());
        System.out.println("Product Version:"+dbmd.getDatabaseProductVersion());
        System.out.println(dbmd.getURL());
        System.out.println(dbmd.getUserName());
        System.out.println(dbmd.getTimeDateFunctions());
        System.out.println(dbmd.getMaxTableNameLength());
        
	}

}
