package com.java.stack;
import java.util.Scanner;
public class ReverseString
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
		return Stack[top--];
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String Elements");
		String str=sc.next(); //manju
		String rev="";
		cap=str.length();
		
		Stack =new char[cap];
		for(int i=0;i<=cap-1;i++)
		{
			push(str.charAt(i));
		}
		while(top!=-1)
		{
			rev=rev+pop();
		}
		System.out.println(rev);//ujnam
	}
}
