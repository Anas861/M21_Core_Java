package com.cg.streamsoperation;

import java.util.LinkedList;

public class CollectionLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>obj=new LinkedList<>();
		obj.add(11);
		obj.add(12);
		System.out.println(obj);
		//obj.forEach(i->System.out.println(i));
		obj.forEach(System.out::println);
	}

}
