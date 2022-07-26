package com.cg.exception;
//program on finally block
import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		//if any exception will be there in a try block
		//that exception will be handled by catch block
		try
		{
			int res=x/1;
			System.out.println(res);
			//finally block will not execute if you call below statement
			//System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println(e);
			s.close();
		}
		finally
		{
			System.out.println("Whether any exception occur or not, the finally block is always executed ");
		}
		System.out.println("M21 Batch-Angular");


	}
	}
