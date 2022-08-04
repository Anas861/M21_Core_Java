package com.cg.lamexp;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileFilter obj=(File pathname)->pathname.getName().endsWith(".txt");
		File dir=new File("C:\\Users\\PC\\Downloads") ;
		File[] contents=dir.listFiles(obj); 
		for(File i:contents)
		{
			System.out.println(i);
		}

	}

}
