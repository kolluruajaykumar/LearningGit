package learning.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DbCon2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("enter empid");
		String empid=s.nextLine();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "ajay");
		PreparedStatement ps=con.prepareStatement("select * from employee where empid=?");
		ps.setString(1, empid);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
		}else
		{
		System.out.println("invalid empid");	
		}
		con.close();
		s.close();
		
	}

}
