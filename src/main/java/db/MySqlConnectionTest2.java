package db;
import java.sql.*;
import java.sql.DriverManager;
public class MySqlConnectionTest2 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection
			("jdbc:mysql://localhost:3306/test1","root","root");
			String query1="select count(*) from test1";
			System.out.println(query1);
			//Statement stm=con.createStatement();
			Statement stm=con.createStatement();
			//ResultSet rset=stm.executeQuery(query1);
			ResultSet rset=stm.executeQuery(query1);
			while(rset.next()){
				System.out.println(rset.getString(1));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
