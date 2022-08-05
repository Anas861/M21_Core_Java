package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>obj=Arrays.asList(new String[] {"Apple","Pear","Grapes","Mango"});
		System.out.println("Word length for object-fruits");
		obj.stream().map(String::length).forEach(i->System.out.print(i+" "));
		System.out.println();
		List<Integer>obj1=Arrays.asList(new Integer[] {10,20,40,30,50,60});
		List<Integer>obj2=obj1.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(obj2+" ");

	}

}
