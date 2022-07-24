package com.cg.superkeyword;
//Super keyword:- it is used to invoke parent class constructor 
class Flower
{
	Flower()
	{
		System.out.println("Flower");
	}
}
class Rose extends Flower
{
	Rose()
	{
		//we are invoking parent class constructor
		//first give the preference to constructor call and then print the statement
		super();
		System.out.println("Rose is red");
	}
}
public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Rose r=new Rose();
		
		
		
	}

}
