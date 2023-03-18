package org.java.stack;
public class StackDS 
{
   int cap,top,StackDS[];
   public StackDS(int cap,int top)
   {
	   this.cap=cap;
	   this.top=top;
	   StackDS=new int[this.cap];
   }
	public void push(int element)
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
	public void pop()
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
	public void peek()
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
	public void display()
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
	public boolean isFull()
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
	public boolean isEmpty()
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
}
