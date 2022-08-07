package com.capgemini.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CrudDB {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String dbURL="jdbc:mysql://127.0.0.1:3306/capemini";
		String dbUsername="root";
		String dbPassword="Anas@861";
		try
		{
			//to check whether the eclipse is connected with MYSQL or not  
			Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			if(c!=null)
				{
					System.out.println("Connection Established");
					//once the connection is established ,we need to close it 
					c.close();
				}	
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
