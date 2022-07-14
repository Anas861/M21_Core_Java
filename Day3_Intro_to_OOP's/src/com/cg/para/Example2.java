package com.cg.para;
class B
{
	public int x;
	//Parameterized constructor
	B(int x)
	{
		System.out.println("The value of a is:" +x);
	}
	public void println() {
		// TODO Auto-generated method stub
		
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B(15);
		obj.println();
	}
	}


