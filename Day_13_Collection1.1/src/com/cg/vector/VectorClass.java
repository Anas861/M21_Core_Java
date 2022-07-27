package com.cg.vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Object> v=new Vector<Object>();
		//v.add(11);
		//v.add("Anas");
		//v.add(34.6f);
		v.add(0,"Anas");
		v.add(1, 'A');
		v.add(2,45);
		System.out.println(v);
		System.out.println(v.set(1, v));
		//copying all the elements of vector into array list using add all method
		ArrayList<Object> a=new ArrayList<Object>();
		a.addAll(v);
		System.out.println(a);
		a.clear();
		System.out.println(a);
	}

}
