package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;

public class StreamOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>obj=Arrays.asList(10,20,30,40,45,10);
		//distinct: takes unique values
		obj.stream().distinct().forEach(System.out::println);
		obj.stream().limit(5).forEach(i->System.out.print(i+" "));
		//limit: limits the values 
	}

}
