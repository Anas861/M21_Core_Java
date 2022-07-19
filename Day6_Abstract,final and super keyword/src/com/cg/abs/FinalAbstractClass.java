package com.cg.abs;
//we cannot make any abstract class as final in java

abstract class Car
{
	abstract void display();
}
class BMW extends Car
{
	void display()
	{
		System.out.println("Car Is");
	}
}
public class FinalAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW c=new BMW();
		c.display();

	}

}
