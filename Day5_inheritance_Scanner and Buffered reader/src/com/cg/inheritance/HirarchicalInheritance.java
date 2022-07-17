package com.cg.inheritance;

class Mobile_Brand
{
	void displayName()
	{
		System.out.println("Brand is: MI");
	}
}
class MI extends  Mobile_Brand
{
	void display()
	{
		System.out.println("MI 8");
	}
}

class MI_10T extends  Mobile_Brand
{
	void display1()
	{
		System.out.println("MI 10T");
	}
}
public class HirarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MI m=new MI();
		m.displayName();
		m.display();
	
		MI_10T m1=new MI_10T();
		m1.display1();
	}

}
