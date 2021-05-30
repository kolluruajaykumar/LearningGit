package learning.jdbc;


import java.util.Scanner;
import java.sql.*;
public class DbAss3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int i=0;
		int k=0;
	try(Scanner s=new Scanner(System.in);){
	System.out.println(" how many members do you want register");
	int n=Integer.parseInt(s.nextLine());
	Class.forName("oracle.jdbc.driver.OracleDriver");
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ajay");
	PreparedStatement ps=con.prepareStatement("insert into employee7am values(?,?,?,?,?,?,?,?,?,?)");
	while(i<n) {
	System.out.println("enter uname");
	String uName=s.nextLine();
	System.out.println("enter pword");
	String pWord=s.nextLine();
	System.out.println("enter fname");
	String fName=s.nextLine();
	System.out.println("enter mname");
	String mName=s.nextLine();
	System.out.println("enter lname");
	String lName=s.nextLine();
	System.out.println("enter empNo");
	String empNo=s.nextLine();
	System.out.println("enter dept");
	String dept=s.nextLine();
	System.out.println("enter desg");
	String desg=s.nextLine();
	System.out.println("enter phNo");
	int phNo=Integer.parseInt(s.nextLine());
	System.out.println("enter bsal");
	int bSal=Integer.parseInt(s.nextLine());
	ps.setString(1, uName);
	ps.setString(2, pWord);
	ps.setString(3, fName);
	ps.setString(4, mName);
	ps.setString(5, lName);
	ps.setString(6, empNo);
	ps.setString(7, dept);
	ps.setString(8, desg);
	ps.setInt(9, phNo);
	ps.setInt(10, bSal);
	 k=ps.executeUpdate();
	 i++;
	// k++;
	}
	System.out.println("no of users registred:"+k);
	con.close();
	
	//s.close();
}
	}
}
