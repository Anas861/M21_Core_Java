package com.cg.generics;

import java.util.List;
import java.util.LinkedList;

public class GenericsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>obj=new LinkedList<Integer>();
		obj.add(11);
		obj.add(12);
		//1.Compile-Time checking type safe
		//obj.add("12");
		System.out.println(obj);
		//2.Type casting is not required in generics
		List<String>obj1=new LinkedList<String>();
		obj1.add("Anas");
		obj1.add("Sana");
		String str=obj1.get(1);
		//String str1=(String)obj1.get(1);
		System.out.println(str);
	}

}
