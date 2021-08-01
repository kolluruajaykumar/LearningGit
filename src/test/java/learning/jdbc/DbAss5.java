package learning.jdbc;

import java.sql.*;
import java.util.Scanner;
public class DbAss5 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner s= new Scanner(System.in);
	System.out.println("enter empno");
	String empNo=s.nextLine();
	Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ajay");
	PreparedStatement ps=con.prepareStatement("select * from employee7am where empNo=?");
	ps.setString(1, empNo);
	ResultSet rs=ps.executeQuery();
	if(rs.next())
	{
		System.out.println(rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)+"\t"+rs.getString(9)+"\t"+rs.getString(10));
	}
	else {
		System.out.println("invalid id");
	}
	con.close();
	s.close();
	}

}
