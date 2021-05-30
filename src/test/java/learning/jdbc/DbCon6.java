package learning.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.Scanner;

public class DbCon6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try(Scanner s=new Scanner(System.in);)
		{
		System.out.println("enter which emp name whose data to be removed");
		String name=s.nextLine();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "ajay");
		PreparedStatement ps=con.prepareStatement("delete from employee where name=?");
		ps.setString(1, name);
		int k=ps.executeUpdate();
		System.out.println("no of rows deleted;" +k);
		
	/*	if(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			
		}else
		{
			System.out.println("invalid name");
		}*/
		con.close();
		}	
	}

}
