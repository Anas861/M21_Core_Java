package com.tns.strings;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		System.out.println(str1.length());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.charAt(3));
		s.close();
	}

}
