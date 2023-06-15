package com.java.stack;
import java.util.Scanner;
public class StackAllMethods1
{
	public static int cap=5,top=-1,StackDS[]=new int[cap];
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
		while(true)
		{
			System.out.println("Welcome To Stack Linear Data Structure ");
			System.out.println("1.inserte element\n2.Delete element\n3.Display All elements\n4.Display the Top element\n5.Exit");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("Enter Inserting Element");
			push(sc.nextInt());	
			break;
			case 2:pop();	
			break;
			case 3:display();
			System.out.println("All elements Displayed");
			break;
			case 4:peek();	
			break;
			case 5:System.out.println("Thank you!");
			System.exit(0);
			break;
			default :System.out.println("invalid choice..!");
			}
			System.out.println("----------------------------------------------------");
		}
	}
}
