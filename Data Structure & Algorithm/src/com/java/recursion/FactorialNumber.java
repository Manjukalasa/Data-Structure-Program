package com.java.recursion;

public class FactorialNumber
{
	public static int display(int n)
	{
		if(n==5)
		return n;
		return n*display(n+1);
	}
	public static void main(String[] args) 
	{
	int fac=display(1);
	System.out.println(fac);
	}

}