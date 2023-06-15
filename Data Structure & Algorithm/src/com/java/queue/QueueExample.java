package com.java.queue;
public class QueueExample
{
	public static int cap=5;
	public static int front=0;
	public static int rear=0;
	public static int Que[]=new int[cap];
	public static void enQue(int element)
	{
		if(rear==cap)
		{
			System.out.println("Queue is full");
		}
		else
		{
			Que[rear]=element;
			rear++;
			System.out.println("Element is inserted: "+element);
		}
	}
	public static void deQue()
	{
		if(front==rear)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			for(int i=0;i<rear-1;i++)
			{
				Que[i]=Que[i+1];
			}
			rear--;
		}
	}
	public static void display()
	{
		if(front==rear)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			for(int i=0;i<rear;i++)
			{
				System.out.println(Que[i]);
			}
		}
	}
	public static boolean isFull()
	{
		if(rear==cap)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isEmpty()
	{
		if(front==rear)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		enQue(10);
		enQue(20);
		enQue(30);
		enQue(40);
		enQue(50);
		enQue(60);
		System.out.println("------------------------------------------------------");
		System.out.println(isFull());
		System.out.println("------------------------------------------------------");
		display();
		System.out.println("------------------------------------------------------");
		deQue();
		deQue();
		deQue();
		display();
		deQue();
		deQue();
		System.out.println("------------------------------------------------------");
		System.out.println(isFull());
		System.out.println(isEmpty());
	}
}
