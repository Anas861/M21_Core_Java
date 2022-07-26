package com.cg.exception;
//program to handle exception on array index out of bound 
public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First line");
		System.out.println("Second line");
		int[] myintarray = new int[] {1,2,3};
		try
		{
		print(myintarray);
		System.out.println("Third line");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled" +e);
		}
	}

	private static void print(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println(arr[3]);
		System.out.println("Fourth element successfully displayed!");
		
	}

}
