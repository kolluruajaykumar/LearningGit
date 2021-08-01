package learning.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBcon4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("enter uname");
		String uName=s.nextLine();
		System.out.println("enter pword");
		String pWord=s.nextLine();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","ajay");
		PreparedStatement ps=con.prepareStatement("select * from register7am where uname=? and pword=?");
		ps.setString(1, uName);
		ps.setString(2, pWord);
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			System.out.println("validity is successful");
		}
		else
		{
			System.out.println("invalid user");
		}
		con.close();
		s.close();
		
		
	}

}
