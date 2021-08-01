package learning.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.Scanner;

public class DbCon3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException ,NumberFormatException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "ajay");
		PreparedStatement ps=con.prepareStatement("insert into register7am values(?,?,?,?)");
		int i=0;int k=0;
		Scanner s = null;
        while(i<3)
		{
		 s= new Scanner(System.in);
		System.out.println("enter uname");
		String uName=s.nextLine();
		System.out.println("enter pword");
		String pWord=s.nextLine();
		System.out.println("enter emailId");
		String emailId=s.nextLine();
		System.out.println("enter phno");
	    String phNo=s.nextLine();
		ps.setString(1, uName);
		ps.setString(2, pWord);
		ps.setString(3, emailId);
		ps.setString(4, phNo);
		 k=ps.executeUpdate();
		 k++;
		i++;
		}
        System.out.println(k +"user/s registred");
		con.close();
		s.close();
	}
}
