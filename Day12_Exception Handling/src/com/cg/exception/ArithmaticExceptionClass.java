package com.cg.exception;

import java.util.Scanner;

public class ArithmaticExceptionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		//if any exception will be there in a try block
		//that exception will be handled by catch block
		try
		{
			int res=x/0;
			System.out.println(res);
		}
		catch(Exception e)
		{
			System.out.println(e);
			s.close();
		}
	}

}
