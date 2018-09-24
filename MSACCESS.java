package jdbcconnection;

import java.sql.*;
public class MSACCESS {

	public static void main(String[] args) 
	{

	try
	    {

	        Connection conn=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\admin\\eclipse-workspace\\enumsam\\Socket\\src\\Theatre1.mdb");
	
   Statement stment = conn.createStatement();

	        String qry = "SELECT * FROM Hurricane";

	ResultSet rs = stment.executeQuery(qry);

	while(rs.next())
	        {
	            String id    = rs.getString("Seat") ;
	            String fname = rs.getString("Availablity");

System.out.println("Seat no="+id +"\t" +"Availablity=" +fname +"\n");
	        }
	    }
	
catch(Exception err)
	    {
	System.out.println(err);
	    }


	//System.out.println("HasithSithila");

	}}  

