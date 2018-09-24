package jdbcconnection;

import java.sql.DriverManager;

import java.sql.Connection;

import java.sql.SQLException;

	import java.sql.*;  

public class sqlconnect {

	public static void main(String args[]){  

		try{

		Class.forName("com.mysql.jdbc.Driver");  
		
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost/nametable","root", "");
		//here sonoo is database name, root is username and password  
		
	Statement stmt=con.createStatement();  

		ResultSet rs=stmt.executeQuery("select * from nametable");  

		while(rs.next())  

		System.out.println("FirstName=" +rs.getString(1)+"\t " +"LastName=" +rs.getString(2)+"  ");  

		con.close();  

		}catch(Exception e){ System.out.println(e);}  

		}  
		
	}

