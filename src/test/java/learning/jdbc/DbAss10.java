package learning.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class DbAss10 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
			HashMap<String,StuData2> hm=new HashMap<String,StuData2>();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "ajay");
			PreparedStatement ps=con.prepareStatement("select * from student7am ");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				hm.put(rs.getString(1),new StuData2(rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6),rs.getFloat(7),rs.getString(8)));
			}
			System.out.println("dis from collection object");
			hm.forEach((p,q)->//forEach 
			{
				System.out.println(p+"\t"+q);
			});
	
	}

}
