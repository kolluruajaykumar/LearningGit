package learning.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DbAss9 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		ArrayList<StuData> al=new ArrayList<StuData>();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "ajay");
		PreparedStatement ps=con.prepareStatement("select * from student7am ");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			al.add(new StuData(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getFloat(7),rs.getString(8)));
		}
		System.out.println("dis from collection object");
		for(StuData k:al)
		{
			System.out.println(k);
		}
		}
	}


