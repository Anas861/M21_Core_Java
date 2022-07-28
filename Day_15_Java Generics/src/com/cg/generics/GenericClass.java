package com.cg.generics;
//Generic Class
public class GenericClass<T> {
	//T is a Type
	T num;
	public void display()
	{
		System.out.println(num.getClass().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<Integer>obj=new GenericClass<Integer>();//generics avantage
		obj.num=15;
		obj.display();
	}

}
