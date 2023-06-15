package com.java.function;

public class Sample2
{
	public static int display(float x)
	{
		int y=3;
		return (int)x+y;
	}
	public static int display(int x)
	{
		return display(x+2.0f);
	}
	public static void main(String[] args)
	{
		int z=display(10);
		System.out.println(z++ + ++z);
	}
}
