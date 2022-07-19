package com.cg.abs;

abstract class Fruit
{
	//abstract method
	abstract void display();
}
class Apple extends Fruit
{
	//provide implementation for abstract method
	void display()
	{
		System.out.println("An Apple a day keeps the doctor away");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we can't create the obj. for abstract class
		Fruit f=new Apple();
		f.display();

	}

}
