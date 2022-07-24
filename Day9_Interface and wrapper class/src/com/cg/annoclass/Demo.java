package com.cg.annoclass;
//Anonymous class
abstract class Anonymus
{
	public abstract void method();
}
public class Demo
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymus a=new Anonymus()
		{
			public void method()
			{
				System.out.println("This is an example of Anonymus class");
			}
		};
		a.method();
	}
}