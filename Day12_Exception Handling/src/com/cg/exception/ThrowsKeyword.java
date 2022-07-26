package com.cg.exception;

import java.io.IOException;

public class ThrowsKeyword {
	static void display(int x)throws IOException,ClassNotFoundException
	{
		if(x==5)
		{
			throw new IOException("Input-Output Exception");
		}
		else
		{
			throw new IOException("ClassNotFoundException");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			display(10);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
