import java.sql.DriverManager;
import java.sql.*;

public class ConnectDB{
public static Connection connect ()
{
	
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stud","arpit1906","password");
		return con;
	}
	catch (Exception ex)
	{
		
	}
return null;
	

}
public static void main (String[] args) {
	
}
}
