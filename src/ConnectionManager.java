import java.sql.*;  
class ConnectionManager
{  
public static void main(String args[]) throws ClassNotFoundException, SQLException
{  
 
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:4200","root","asifaN*793");  
 
 if(con != null)
 {
	 System.out.println("Connection Established Sucessfully");
 }
 else
 {
	 System.out.println("Unsucessful Connection");
 }

}}