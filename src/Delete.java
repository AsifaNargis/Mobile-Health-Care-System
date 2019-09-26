import java.sql.*;

import java.util.Scanner;
public class Delete 
{

	public static void main(String[] args) throws SQLException 
	
	
	{
		String option  = null;
		
		Connection conn = null ;
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		do
		{
		
		try
		{
	
		
	final String driver = "";
			Class.forName(driver);
     	
	
			conn = DriverManager.getConnection("com.mysql.jdbc.Driver");
			
			//Statement st = conn.createStatement();
			conn = DriverManager.getConnection("jdbc:mysql://localhost:4200/HealthCare\\\",\\\"root\\\",\\\"asifaN*793");
			
			  System.out.println("Want to delete record\nEnter candidate ID");
			  int id = in.nextInt();
			  
			  PreparedStatement ps = conn.prepareStatement("delete from HealthCare where ID=?");
			  ps.setInt(1, id);
			  ps.executeQuery();
			  
			  System.out.println("your record is delete\nTO continue yes\nTO view records type --view--");
			  
			
			option = in.next();
			
			
			
			ps.close();
		
		}
			
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		
	}
			
	}while(option.equals("yes"));
		
		while(option.equals("no"))
		{
			System.out.println("!!!!!!!!*******");
		}
	
		if(option.equals("view"))
		{
  PreparedStatement pst = conn.prepareStatement("select * from HealthCare");
			
			ResultSet rs = pst.executeQuery();
			
			System.out.println("ID"+"    " +"Name"+"     "+"Gender"+"    "+"Health-type"+"      "+"Records");
			
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
		else
		{
			System.out.println("!!!!!!!******");
		}
		

}
}