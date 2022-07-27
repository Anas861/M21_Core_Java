package com.cg.vector;

import java.util.Stack;

public class StackProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Object> s=new Stack<Object>();
		//push method is use to add the elements into the stack 
		s.push(11);
		s.push(12);
		s.push("Anas");
		System.out.println(s);
		//pop method is used to remove the elements from the stacks
		System.out.println(s.pop());
		System.out.println(s);

	}

}
