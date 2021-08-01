package learning.jdbc;

import java.sql.*;
import java.util.Scanner;

public class DbAss1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner s=new Scanner(System.in);
		System.out.println("enter uname");
		String uName=s.nextLine();
		System.out.println("enter pWord");
		String pWord=s.nextLine();
		System.out.println("enter accno");
		int accNo=Integer.valueOf(s.nextLine());
		System.out.println("enter name");
		String name=s.nextLine();
		System.out.println("enter address");
		String address=s.nextLine();
		System.out.println("enter bal");
		int bal=Integer.valueOf(s.nextLine());
		System.out.println("enter phno");
	    String phNo=s.nextLine();
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ajay");
	    CallableStatement cs=con.prepareCall("{call AccDetails(?,?,?,?,?,?,?)}");
	    cs.setInt(1, accNo);
	    cs.setString(2, uName);
		cs.setString(3, pWord);
		cs.setFloat(4, bal);
		cs.setString(5, name);
		cs.setString(6,address);
		cs.setString(7, phNo);
		cs.execute();
		System.out.println("procedure executed");
		con.close();
		s.close();
	   
	}

}
