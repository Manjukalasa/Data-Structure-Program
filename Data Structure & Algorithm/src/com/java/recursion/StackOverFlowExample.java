package com.java.recursion;

public class StackOverFlowExample {
	static int x=1;
	public static void count()
	{
		System.out.println("fun loaded" +x++);
		count();
	}
	public static void main(String[] args) {
		count();
	}

}
