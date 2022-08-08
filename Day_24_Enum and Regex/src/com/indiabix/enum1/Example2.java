package com.indiabix.enum1;

public class Example2 {
	enum Margin
	{
		Top,Bottom,Left,Right
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=11;
		for(Margin m:Margin.values())
		{
			System.out.printf("Margin:%d = %s\n",count++,m); 
		}

	}

}
