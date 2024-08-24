/**
 * 
 */
package com.collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	/**
	 *Collection(i)->Queue->DeQueue(I) & BlockingQue(I) & BlockingDeQueue(I)
	 *Queue-PriorityQueue(c) and LinkedList(c)
	 */
	public static void main(String[] args) {
		//insertion order preserved
		//Duplicates are allowed
		PriorityQueue<String> q=new PriorityQueue<String>();
		//Using add method
		
		q.add("a");
		q.add("b");
		q.add("c");
		q.add("d");
		q.add("e");
		q.add("x");
		q.add("y");
		//System.out.println(q);
		
		//using offer()
		q.offer("p");
		q.offer("q");
		q.offer("r");
		q.offer("p");
	//	q.offer(100);// not allowed in queue(heterogeneous data) getting exception
		System.out.println(q);//[a, b, c, d, e, x, y, p, q, r, p]
		
		
		//get head element element() and peek()
//		System.out.println(q.element());// a
//		System.out.println(q.peek());// a
		
		//if Queue is empty
	//	System.out.println(q.add());//[]
		
		//System.out.println(q.element());// if queue is empty then getting no such element exception
		//System.out.println(q.peek());// if queue is empty then getting null value
		// Remove and return element from queue
		//System.out.println(q.remove());//a
		//System.out.println(q);//[b, d, c, p, e, x, y, p, q, r]
		//using poll()
	//	System.out.println(q.poll());//a
	//	System.out.println(q);//[b, d, c, p, e, x, y, p, q, r]
//		System.out.println(q.poll());//a if queue is empty the return null
//		System.out.println(q);//[]
		
		Iterator it=q.iterator();
		while(it.hasNext()) {
			Object text=it.next();
			System.out.print(text+" " );
		}
	}

}
