package com.cg.abs;

abstract class A
{
	void print()
	{
		System.out.println("Non Abstract method");
	}
}
class B extends A
{
	//As B is inheriting the properties of A class then it has print method
}
public class NonAbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a=new B();
		a.print();
	}

}
