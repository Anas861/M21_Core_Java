package com.cg.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetreiveEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbURL="jdbc:mysql://127.0.0.1:3306/capemini";
		String dbUsername="root";
		String dbPassword="Anas@861";
		try 
		{
			Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			//TO retrieve data
			String query="SELECT * FROM EMPLOYEE";
			Statement s=c.createStatement();
			//if row>0 means at-least some rows are there
			ResultSet r=s.executeQuery(query);
			//int count=0;
			while(r.next())
			{
				int id=r.getInt(1);
				String name=r.getString(2);
				Float salary=r.getFloat(3);
								
				String output="User :%d- %s %s %s";
				System.out.println(String.format(output, id,name,salary));
			}
		c.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
