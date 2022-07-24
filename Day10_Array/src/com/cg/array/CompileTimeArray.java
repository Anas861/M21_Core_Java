package com.cg.array;

public class CompileTimeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11,22,33,44,55};
		//System.out.println(arr[1]+" "+arr[4]);
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");//11 22 33 44 55
		}*/
		//enhance for loop
		for(int x:arr)
		{
			System.out.print(x+ " ");
		}

	}

}
