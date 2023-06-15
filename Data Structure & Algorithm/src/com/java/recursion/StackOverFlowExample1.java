package com.java.recursion;

public class StackOverFlowExample1 {
	static int x=1;
	public static void count()
	{
		System.out.println("fun loaded" +x++);
		if(x<=5)
		{
			count();
		}
	}
	public static void main(String[] args) {
		count();
	}
}
