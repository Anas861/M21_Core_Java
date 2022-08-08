package com.indiabix.regex;

public class Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="M-21 @@ Anas @@ Sara @@ Auwais";
		String[] res=str.split("@@");
		for(String i:res)
		{
			System.out.println(i);
		}

	}

}
