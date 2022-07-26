package com.cg.exception;
//program on throw keyword:
//throw keyword is used to throw an exception explicitly
public class KeywordThrow {
	
	public static void validate (int age)
	{
		if(age<21 || age>27 )
			throw new ArithmeticException("not eligible");
		else
			System.out.println("Eligible to attend Military Selection");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			validate(30); //fun call
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}

}
