package com.cg.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Object>q=new ArrayDeque<Object>();
		q.add(11);
		q.add(121);
		q.add(17);
		System.out.println(q);
		System.out.println(q.peek());
		//priorityQueue will print the elements using Priority of the elements
		Queue<Object>q1=new PriorityQueue<Object>();
		q1.offer(11);
		q1.add(12);
		q1.add(10);
		System.out.println(q1);
		System.out.println(q1.peek());
		System.out.println(q1.remove());
		System.out.println(q1);
		System.out.println(q1.poll());
		System.out.println(q1);
		

	}

}
