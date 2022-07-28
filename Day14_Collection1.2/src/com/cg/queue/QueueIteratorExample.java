package com.cg.queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class QueueIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>q=new ArrayDeque<Integer>();
		for(int i=11;i<15;i++)
		{
			q.add(i);
		}
		System.out.println(q);
		boolean isadded=q.offer(25);
		System.out.println("IsAdded: "+isadded);
		System.out.println(q);
		//Iterator =to return single-single elements separately 
		Iterator<Integer>itr=q.iterator();
		System.out.println("The elements are: ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}	

	}

}
