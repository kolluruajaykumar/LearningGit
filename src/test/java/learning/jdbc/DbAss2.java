package learning.jdbc;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class DbAss2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DbAss2 d=new DbAss2();
		Scanner s=new Scanner(System.in);
		System.out.println("enter rno");
		String rNo=s.nextLine();
		System.out.println("enter name");
		String name=s.nextLine();
		System.out.println("enter branch");
		String branch=s.nextLine();
		System.out.println("enter phNO");
		String phNo=s.nextLine();
		System.out.println("enter hno");
		String hNo=s.nextLine();
		System.out.println("enter sName");
		String sName=s.nextLine();
		System.out.println("enter city");
		String city=s.nextLine();
		System.out.println("enter pincode");
		int pinCode=Integer.valueOf(s.nextLine());
		System.out.println("enter telugu marks");
		int t=Integer.valueOf(s.nextLine());
		System.out.println("enter hindi marks");
	    int h=Integer.valueOf(s.nextLine());
		System.out.println("enter english marks");
		int e=Integer.valueOf(s.nextLine());
		System.out.println("enter maths marks");
		int m=Integer.valueOf(s.nextLine());
		System.out.println("enter scince marks");
		int sci=Integer.valueOf(s.nextLine());
		System.out.println("enter social marks");
		int sco=Integer.valueOf(s.nextLine());
		int totMarks=t+h+e+m+sci+sco;
		float per=(float)totMarks/6;
		String result=d.resultStatus(t,h,e,m,sci,sco,per );
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","ajay");
		CallableStatement cs=con.prepareCall("{call StuDetails(?,?,?,?,?,?,?,?,?,?,?)}");
		cs.setString(1, rNo);
		cs.setString(2, name);
		cs.setString(3, branch);
		cs.setString(4, phNo);
		cs.setString(5, hNo);
		cs.setString(6, sName);
		cs.setString(7,city);
		cs.setInt(8,pinCode);
		cs.setInt(9,totMarks);
		cs.setDouble(10, per);
		cs.setString(11, result);
		cs.execute();
		System.out.println("procedure executed");
		con.close();
		s.close();
		}

	public String resultStatus(int t,int h,int e,int m,int sci,int sco,float per)
	{
		
		if(t<35||h<35||e<35||m<35||sci<35||sco<35&&per<35)
		{
		return "Fail";
		
		}else if(per>=35&&per<50) {
			return "Third class";
			
		}else if(per>=50&&per<60) {
		return	"Second class";
			
		}else if(per>=60&&per<70) {
		return	"First class";
			
		}else
		{
		return	"Distinction";
			
		}

	}
}

