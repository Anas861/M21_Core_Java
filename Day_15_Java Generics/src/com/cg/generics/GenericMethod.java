package com.cg.generics;

public class GenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= {11,22,33};
		Character ch[]= {'A','S','B'};
		
		System.out.println("Integer Array: ");
		print(arr);
		
		System.out.println("Character Array: ");
		print(ch);
	}
	//Generic Method: We can pass any type of Arguments
		//E is a Element
		public static <E>void print(E[] elements)
		{
			for(E elem:elements)
			{
				System.out.println(elem);
			}
			System.out.println();
			
		}
	}

	


