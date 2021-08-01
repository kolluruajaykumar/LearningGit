package learning.jdbc;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class My1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {		
		
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sai","root","ajay");
	
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from employee");

while(rs.next())
{
	System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
	
}
con.close();
	
	}
}