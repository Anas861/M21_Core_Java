package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>obj=Arrays.asList(new Integer[] {10,20,40,30,50,60});
		Optional<Integer>obj1=obj.stream().filter(i->i>5).reduce((a,b)->a>b?a:b);
		if(obj1.isPresent())
		{
			System.out.println("Result: "+obj1.get());
		}
	}

}
