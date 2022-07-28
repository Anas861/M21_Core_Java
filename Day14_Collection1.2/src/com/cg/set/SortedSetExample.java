package com.cg.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it will sort the string in ascending order
				SortedSet<String> s=new TreeSet<String>();
				s.add("Abstract");//1
				s.add("Anas");//4
				s.add("Allows");//2
				s.add("Azad");//3
				System.out.println(s);
	}

}
