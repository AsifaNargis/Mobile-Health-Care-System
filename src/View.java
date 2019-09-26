import java.sql.*;
public class View 
{

	public static void main(String[] args) throws SQLException
	{
		Connection conn = null ;
		try
		{
		
		
	final String driver = "com.mysql.jdbc.Driver";
			Class.forName(driver);
     	
	
			conn = DriverManager.getConnection("jdbc:mysql://localhost:4200/HealthCare\",\"root\",\"asifaN*793");
		
			PreparedStatement ps = conn.prepareStatement("select * from HealthCare");
			
			ResultSet rs = ps.executeQuery();
			
			System.out.println("ID"+"    " +"Name"+"     "+"Gender"+"    "+"Health-type"+"      "+"");
			
			while(rs.next())
			{
				//System.out.println("ID"+"      " +"Name"+"       "+"Gender"+"      "+"Type"+"        "+"Details\n");
			System.out.println("\n");
				System.out.print(rs.getInt(1)+"   ");
				System.out.print(rs.getString(2)+"    ");
                System.out.print(rs.getString(3)+"      ");
                System.out.print(rs.getString(4)+"      ");
                System.out.println(rs.getString(5)+"  ");
                
				}
			
			
			}
     	
		
		
	
		catch (ClassNotFoundException e) 
     	{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     	
		
		
		

	}

}