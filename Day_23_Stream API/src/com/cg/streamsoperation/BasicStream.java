package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BasicStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stream can be created with static data 
		Stream<String>obj=Stream.of("Anas","Shabnam","Nia","Sara");
		obj.forEach((i)->System.out.println(i));
		//stream can be accqurid from array or collections
		List<String>obj1=Arrays.asList(new String[] {"Mumbai","Pune","Thane"});
		obj=obj1.stream();
		//obj.forEach((i)->System.out.println(i));
		obj.forEach(System.out::println);

	}

}
