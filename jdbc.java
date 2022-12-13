import java.sql.*;
import java.util.Scanner;
class stmt_jdbc1
{
	public static void main(String s[])
	{
		try{
	  Class.forName("com.mysql.cj.jdbc.Driver");	
		}
		catch (ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
	  //string url, username, password.
	  //datbase name jdbc2511:- root , root
	  try{
	  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2511","root","root");	
	    if(conn==null)
		{			
		  System.out.println("Not able to make the connection");	
		  
		}
		else	
			System.out.println("Connection Established");	
		//creating statement object to run the queries 
		Scanner sc = new Scanner(System.in);
		Statement st = conn.createStatement();
		// i need to apply here for ResultSet ,ResultSet.TYPE_SCROLL_SENSITIVE
		int ch=0;
		while(true)
		{
			System.out.println("1 for insert 2 for update, 3 for delete, 4 for listing all records, 5 for exit");
			ch =sc.nextInt();
			 String query ="";
			switch(ch)
			{
				case 1:
				query="insert into user (fname,lname,email,password,dob) values('sunil kumar','sharma','sunilkumar@gmial.com','123!@#43adsf','1990-10-10')";
				 int count=st.executeUpdate(query);
					System.out.println("record inserted: "+count);
					break;
					case 2:
					query ="update user set email='sunilkumar@gmail.com' where uid=1";
					System.out.println("record updated :- "+st.executeUpdate(query));
					break;
				case 4: 
					  query ="select * from user";
					ResultSet rs= st.executeQuery(query);
					/*System.out.println("current row no:-"+rs.getRow());
					rs.last();
					System.out.println("current row no:-"+rs.getRow());*/
					System.out.println("uid\tfname\t  lname,\t email\t   password\t  date of birth ");
					while(rs.next())
					{
						System.out.println(rs.getInt("uid")+"\t"+rs.getString("fname")+"\t"+rs.getString("lname")+"\t"+rs.getString("email")+"\t"+rs.getString("password")+"\t"+rs.getDate("dob"));						
					}
						
					break;
				default:
				  System.out.println("Wrong choice");
				
			}//end of switch
			if(ch==5)
				 break;
		}
		
			
	  }
	  catch(SQLException se)
	  {
		  se.printStackTrace();		  
	  }
	}
}