package com.cg.list;

import java.util.ArrayList;

public class CloneArrayList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("rawtypes")
		ArrayList obj=new ArrayList();
		obj.add("ANAS");
		obj.add(13);
		obj.add(15.30);
		obj.add("Anas");
		System.out.println(obj);
		//Shallow Copy of Array List
		Object clonelist;
		clonelist=obj.clone();
		System.out.println(clonelist);
		

	}

}
