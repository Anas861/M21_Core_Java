package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Float>obj=Arrays.asList(12.5f,23.2f,45.3f);
		//System.out.println(obj);
		//filtering with condition:filter(predicate)  
		obj.stream().filter(i->i>15.4f).forEach(System.out::println);
	}

}
