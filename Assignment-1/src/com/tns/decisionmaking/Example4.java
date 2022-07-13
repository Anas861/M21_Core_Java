package com.tns.decisionmaking;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("hi");
			break;
		case 2:
			System.out.println("hello");
			break;
		case 3:System.out.println("what's up");
			break;
		default:
			System.out.println("Invalid Input");
			s.close();
		
			
		}
	}

}
