package com.cg.lamexp;
//functional interface
interface A
{
	void show();
}
/*class B implements A
{
	@override
	public void show()
	{
	 	System.out.println("Program to implement functional interface using lambda expression  )
  	}
 */

public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//B b=new B();
		//b.show();
		//Lambda Expression
		A obj=()->
		{
			System.out.println("Program to implement functional interface using lambda expression");
		};
		obj.show();

	}

}
