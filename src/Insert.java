import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner ;
import java.util.Date ;

public class Insert 
{


	public static void main(String[] args) throws   ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
	
		String option ;
		Scanner in = new Scanner(System.in);
	 do
	 {
	   final String driver = "com.mysql.jdbc.Driver";
     	Class.forName(driver);
		
		Connection conn = null ;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:4200/HealthCare","root","asifaN*793");
		
		
	
		//Scanner in = new Scanner(System.in);
		
		  
		 
		
		
		
	 System.out.println("---Welcome to Health-Care System services---");
	System.out.println("Enter your  ID:");
	int ID = in.nextInt();
	System.out.println("Enter your name:");
    String name = in.next();
    System.out.println("Enter your Gender Type:");
		String gender = in.next();
		System.out.println("Enter your Type of Health-Care:");
		String type = in.next();
		Date dt = new Date();
		String Records = dt.toString();
		
		PreparedStatement ps = conn.prepareStatement("insert into insuranceservice values(?,?,?,?,?)");
		ps.setInt(1,ID);
		ps.setString(2, name);
		ps.setString(3, gender);
		ps.setString(4, type);
		ps.setString(5,  Records);
		 ps. executeUpdate();
		 
		 
		 System.out.println("YOur Details are recorded---");
		System.out.println("To continue type yes");
		 
		 conn.close();
			//in.close();
		   option = in.next();
		}while(option.equals("yes"));
		
	 
	
	 
	 

	

}
	}