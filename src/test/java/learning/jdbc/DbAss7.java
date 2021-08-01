package learning.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DbAss7 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DbAss7 d1=new DbAss7();
		int i=0,k = 0;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "ajay");
		PreparedStatement ps=con.prepareStatement("insert into student7am values(?,?,?,?,?,?,?,?)");
		
	try(	Scanner s=new Scanner(System.in);)
	{   System.out.println("enter how many do you want to register");
	int n=Integer.parseInt(s.nextLine());
		while(i<n)
		{
		System.out.println("enter rno");
		String rNo=s.nextLine();
		System.out.println("enter name");
		String sName=s.nextLine();
		System.out.println("enter branch");
		String sBranch=s.nextLine();
		System.out.println("enter phNO");
		String sPhNo=s.nextLine();
		System.out.println("enter address");
		String sAddress=s.nextLine();
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
		String result=d1.resultStatus(t,h,e,m,sci,sco,per );
		
		
		ps.setString(1, rNo);
		ps.setString(2, sName);
		ps.setString(3, sBranch);
		ps.setString(4, sAddress);
		ps.setString(5, sPhNo);
		ps.setInt(6, totMarks);
		ps.setFloat(7, per);
		ps.setString(8, result);
		
		 k=ps.executeUpdate();
		i++;
		k++;
		}
		System.out.println("no of students registred;" +k);
		con.close();
	}
	}
	public String resultStatus(int t,int h,int e,int m,int sci,int sco,float per)
	{
		
		if(t<35||h<35||e<35||m<35||sci<35||sco<35&&per<35)
		{
		return "Fail";
		
		}else if(per>=35&&per<50) {
			return "3rd class";
			
		}else if(per>=50&&per<60) {
		return	"2nd class";
			
		}else if(per>=60&&per<70) {
		return	"1st class";
			
		}else
		{
		return	"Distinct";
			
		}
	}

}
