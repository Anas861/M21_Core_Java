package com.tns.recursion;

import java.util.Scanner;

public class Factorial1 {
	
	//fun definition
	static int factorial(int n)
	{
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(factorial(n));//fun call
		s.close();

	}

}
