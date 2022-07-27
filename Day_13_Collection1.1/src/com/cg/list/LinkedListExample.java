package com.cg.list;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings({ "rawtypes", "unchecked" })
		LinkedList<Comparable> obj=new LinkedList();
		obj.add(11);
		obj.add('z');
		obj.add("Anas");
		obj.add(13.4f);
		obj.add('z');
		
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.contains(15.30));//false
		System.out.println(obj.indexOf(13.4f));
		System.out.println(obj.lastIndexOf('z'));
	}

}
