package com.cg.list;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInputArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(str);
		@SuppressWarnings("resource")
		Scanner token=new Scanner(System.in);
		token.useDelimiter("");
		//user input ArrayList
		ArrayList<Object>arr=new ArrayList<Object>();
		//to return the elements of the array
		while(token.hasNext())
		{
			arr.add(token.next());
			System.out.println(arr.get(arr.size()));
		}
		System.out.println(arr);
		s.close();
		
		

	}

}
