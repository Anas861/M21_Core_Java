package com.indiabix.enum1;

interface Pizza
{
	void display();
	
}
enum size implements Pizza
{
	small,medium,large,extralarge;

	
	public void display() {
		System.out.println("Size is:" +this);
		
	}
}

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		size.large.display();
	}

}
