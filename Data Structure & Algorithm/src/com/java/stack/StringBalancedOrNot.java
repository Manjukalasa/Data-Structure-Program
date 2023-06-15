package com.java.stack;
import java.util.Scanner;
public class StringBalancedOrNot
{
	public static int cap;
	public static int top=-1;
	public static char[]Stack;
	public static void push(char element)
	{
		if(top==cap-1)
		{
			System.out.println("Stack is full");
		}
		else
		{
			top++;
			Stack[top]=element;
		}
	}
	public static char pop()
	{	
		if(top<=-1)
		{
			System.out.println("not Balanced");
			System.exit(0);
		}
		return Stack[top--];
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String Elements");
		String str=sc.next();
		cap=str.length();
		Stack =new char[cap];
		for(int i=0;i<=cap-1;i++)
		{
			if(str.charAt(i)!='(' && str.charAt(i)!=')')
			{
				System.out.println("not Balanced");
				System.exit(0);
			}
			if(str.charAt(i)=='(')
			{
				push(str.charAt(i));
			}
			else
			{
				pop();
			}
		}
		if(top==-1)
		{
			System.out.println("Balanced");  // ((())),(()())
		}
		else
		{
			System.out.println("is not Balanced");//(()))(,)))(((

		}
	}
}
