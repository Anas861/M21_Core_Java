package com.cg.lamexp;

interface E
{
	String show(String str1,String str2);
}

public class LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E obj=(String str1,String str2)->
		{
			return str1+str2;
		};
		System.out.println("Strings are: " +obj.show("Anas" ,"Shiwani"));
	}

}
