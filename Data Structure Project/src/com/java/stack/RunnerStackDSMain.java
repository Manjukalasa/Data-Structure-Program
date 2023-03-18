package com.java.stack;
import org.java.stack.StackDS;
public class RunnerStackDSMain 
{
	public static void main(String[] args) 
	{
		System.out.println("First Objecrt of StackDS ");
		StackDS sd=new StackDS(5,-1);
		sd.push(10);
		sd.push(20);
		sd.push(30);
		sd.push(40);
		sd.push(50);
		sd.push(60);
		sd.display();
		sd.pop();
		sd.pop();
		sd.display();
		System.out.println(sd.isFull());
		System.out.println(sd.isEmpty());
		System.out.println("=======================================");
		System.out.println("Second Objecrt of StackDS");
		StackDS sd2=new StackDS(3,-1);
		sd2.push(10);
		sd2.push(20);
		sd2.push(30);
		sd2.push(40);
		sd2.display();
		sd2.peek();
		sd2.pop();
		sd2.pop();
		sd2.pop();
		sd2.display();
		System.out.println(sd2.isFull());
		System.out.println(sd2.isEmpty());
	}

}
