package com.cg.polymorphism;
class Shape
{
	int area(int a)
	{
		return a*a;
	}
	int area(int a,int b)
	{
		return a*b;
	}
	
}

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Shape();
		System.out.println(s.area(10,20));
		System.out.println(s.area(5));
	}

}
