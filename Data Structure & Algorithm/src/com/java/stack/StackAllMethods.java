package com.java.stack;
public class StackAllMethods
{
	//public static int cap=5,top=-1,Stack[]=new int[cap];
	public static int cap=5;
	public static int top=-1;
	public static int StackDS[]=new int[cap];
	public static void push(int element)
	{
		if(top==cap-1)
		{
			System.out.println("Stack is full");
		}
		else
		{
			top++;
			StackDS[top]=element;
			System.out.println("Element is inserted: "+element);
		}
	}
	public static void pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			System.out.println("Element is deleted: "+StackDS[top]);
			top--;
		}
	}
	public static void peek()
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			System.out.println("top Element in stack:"+StackDS[top]);
		}
	}
	public static void display()
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			for(int i=top;i>=0;i--)
			{
				System.out.println(StackDS[i]);
			}
		}
	}
	public static boolean isFull()
	{
		if(top==cap-1)
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
		if(top==-1)
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
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		push(60);
		System.out.println(isFull());
		display();
		peek();
		pop();
		pop();
		pop();
		pop();
		pop();
		display();
		System.out.println(isFull());
		System.out.println(isEmpty());
	}
}
