package com.cg.Inter;
//Multiple Inheritance
interface Mother
{
	void display();
}
interface Father
{
	void print();
}
class Son implements Mother,Father
{

	@Override
	public void print() {
		System.out.println("My Father name is Aijaz");
	}
	
	@Override
	public void display() {
		System.out.println("My Mother name is Nazma");
	}
	
}
public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son d=new Son();
		d.display();
		d.print();
	}

}
