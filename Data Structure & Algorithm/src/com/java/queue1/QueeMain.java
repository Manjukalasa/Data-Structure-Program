package com.java.queue1;

import com.java.queue.Quee;

public class QueeMain {

	public static void main(String[] args) {
	Quee q1=new Quee(5);
	System.out.println("First Quee");
	q1.enQue(10);
	q1.enQue(20);
	q1.enQue(30);
	q1.enQue(40);
	q1.enQue(50);
	q1.enQue(60);
	q1.display();
	System.out.println(q1.isEmpty());
	System.out.println(q1.isFull());
	System.out.println("======================================================");
	System.out.println("Second Quee");
	Quee q2=new Quee(3);
	q2.enQue(10);
	q2.enQue(20);
	q2.enQue(30);
	q2.enQue(40);
	q2.display();
	System.out.println(q1.isEmpty());
	System.out.println(q1.isFull());
	}

}
