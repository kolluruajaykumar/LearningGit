package learning.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DbAss4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner s= new Scanner(System.in);
	System.out.println("enter uname");
	String uName=s.nextLine();
	System.out.println("enter pword");
	String pWord=s.nextLine();
	Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ajay");
	PreparedStatement ps=con.prepareStatement("select * from employee7am where uName=? and pWord=?");
	ps.setString(1, uName);
	ps.setString(2, pWord);
	ResultSet rs=ps.executeQuery();
	if(rs.next())
	{
		System.out.println(rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)+"\t"+rs.getString(9)+"\t"+rs.getString(10));
	}else
	{
		System.out.println("invalid user");
	}
	}
}
