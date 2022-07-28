package com.cg.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Object>obj=new LinkedHashSet<Object>();
		obj.add("Anas");
		obj.add(2);
		obj.add(8.9f);
		System.out.println(obj);
		//to extract the elements of a set separately
		Object[] arr=obj.toArray();
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}*/
		//if all the elements that we added is heterogeneous then use Object Type instead of int,String,etc
		for(Object itr:arr)
		{
			System.out.println(itr);
		}	
	}

}
