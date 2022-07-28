package com.cg.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExampleGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>obj=new HashMap<Integer,String>();
		obj.put(1, "Anas");
		obj.put(2, "Parag");
		System.out.println(obj);
		
		Set<Map.Entry<Integer,String>>itr=obj.entrySet();
		
		Iterator<Map.Entry<Integer,String>>itrl=itr.iterator();
		
		while(itrl.hasNext());
		{
			//type casting is not required
			@SuppressWarnings("rawtypes")
			Map.Entry e=itrl.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}
		

	}

}
