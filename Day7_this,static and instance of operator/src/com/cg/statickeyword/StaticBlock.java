package com.cg.statickeyword;

public class StaticBlock {
	static int num;
	static String str;
	static
	//static block: if u want to initialize the value without using constructor and obj.creation
	//then use static block 
	//and make the variable of the class as static 
	//StaticBlock()
	{
		num=15;
		str="Anas";
	}
	public static void main(String[] args) {
		//StaticBlock s=new StaticBlock;
		System.out.println(num);
		System.out.println(str);

	}
}