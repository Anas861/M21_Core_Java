package com.cg.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<Integer>obj=new HashSet<Integer>();
				Set<Object>obj=new HashSet<Object>();
				//1.Set is an unordered
				obj.add("Anas");
				obj.add('p');
				obj.add(5.8);
				obj.add(65);
				System.out.println(obj);
				
	}

}
