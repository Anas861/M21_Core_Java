package com.cg.thiskeyword;
//1. this keyword is used to refer the instance variable of current class
class Fruit 
{
	private String str;
	private String strl;
	void accept (String str,String strl)
	{
		this.str=str;
		this.strl=strl;
	}
	void display()
	{
		System.out.println("The first string is: "+str);
		System.out.println("The second string is: "+strl);
	}
}
public class InstanceVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f=new Fruit();
		f.accept("Anas", "Parag");
		f.display();
	}

}
