package com.cg.polymorphism;
class A
{
	//by having different types of argument
	void add(int a,int b) 
	{
		System.out.println(a+b);
	}
	void add(float a,float b)
	{
		System.out.println(a+b);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.add(2,5);
		obj.add(3.0f,4.2f);
	}

}
