package com.cg.Inter;

public interface InterfaceExample {
	//by default its abstract method
	void display1();
}
class X implements InterfaceExample
{
	//provided the implementation for abstract method inside the Demo class


	@Override
	public void display1() {
		System.out.println("InterfaceExample");
		
	}
	
}
	