package com.cg.inheritance;
//Why multiple inheritance is not supported in java
class Mother
{
	void display()
	{
		System.out.println("My Mother name is: Nazma");
	}
}
class Father
{
	void display1()
	{
		System.out.println("My Father name is: Aijaz");
	}
}

public class Demo extends Mother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.display();
	}

}
