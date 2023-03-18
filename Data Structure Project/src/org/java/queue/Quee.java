package org.java.queue;

public class Quee
{
	int cap;
	int front;
	int rear;
	int Que[];
	public Quee(int cap)
	{
		this.cap=cap;
		Que=new int[this.cap];
	}
	public void enQue(int element)
	{
		if(isFull())// if(rear==cap)
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
	public void deQue()
	{
		if(isEmpty())// if(front==rear)
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
	public void display()
	{
		if(isEmpty())// if(front==rear)
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
	public boolean isFull()
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
	public boolean isEmpty()
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
}
