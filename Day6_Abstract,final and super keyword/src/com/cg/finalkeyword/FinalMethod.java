package com.cg.finalkeyword;

class C
{
	//we can't override any final method
	//final void accept()
	void accept()
	{
		System.out.println("Hey there, I wanna provide Restriction ");
	}
}
class D extends C
{
	void accept()
	{
		System.out.println("Restriction provided");
	}
}

public class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d=new D();
		d.accept();
	}

}
