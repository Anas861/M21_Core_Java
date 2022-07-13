package com.tns.operator;

public class Logical_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3,b=5;
		boolean res=(a<b && b>4);
		boolean res1=(a<b || b>4);
		boolean res2= ! (a>b);
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		
	}

}
