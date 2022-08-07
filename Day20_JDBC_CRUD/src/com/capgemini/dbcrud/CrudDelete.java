package com.capgemini.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL="jdbc:mysql://127.0.0.1:3306/capemini";
		String dbUsername="root";
		String dbPassword="Anas@861";
		try
		{
			Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			String query="DELETE FROM EMPLOYEE WHERE ID=?";
			PreparedStatement p=c.prepareStatement(query);
			
			p.setInt(1,234);
			
			int r=p.executeUpdate();
			//if row>0 means at-least some rows are there
			if(r>0)
			{
				System.out.println("A new user is deleted successfully");
			}
			c.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}


	}

}
