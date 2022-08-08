package com.indiabix.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern="Shaikh Anas";
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		boolean result=Pattern.matches(pattern, input);
		System.out.println(result);
		s.close();

	}

}
