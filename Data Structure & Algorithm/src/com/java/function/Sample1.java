package com.java.function;
public class Sample1
{
	public static void add(int b,int a)
	{
		int x=2,y=3;
		x=a+y-x;
		b=y-2*x;
		System.out.println(x+" "+b);
	}
	public static void display()
	{
		int a=1,b=3;
	 add(a,b);
	}
	public static void main(String[] args)
	{
		display();
	}
}
