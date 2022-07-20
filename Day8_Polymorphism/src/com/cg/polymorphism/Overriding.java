package com.cg.polymorphism;
class Multiplication
{
	void accept(int a,int b)
	{
		System.out.println(a*b);
	}
}
class Mul extends Multiplication
{
	void accept(int x,int y)
	{
		System.out.println(x*y);
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mul m=new Mul();
		m.accept(2,6);
		Multiplication m1=new Multiplication();
		m1.accept(4,3);	
	}		
}
