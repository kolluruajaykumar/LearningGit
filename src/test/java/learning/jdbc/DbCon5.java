package learning.jdbc;


import java.util.Scanner;
import java.sql.*;

public class DbCon5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	try(Scanner s= new Scanner(System.in);)
	{
	System.out.println("enter empid");	
	String empId=s.nextLine();
	System.out.println("enter name of employee to be updated");
	String name=s.nextLine();
	Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ajay");
	PreparedStatement ps=con.prepareStatement("update employee set name=? where empid=?");
	ps.setString(1, name);
	ps.setString(2, empId);
	int k=ps.executeUpdate();
	System.out.println("no of rows updared:"+"\t"+ k);
	con.close();
	
	}
		
	}

}
