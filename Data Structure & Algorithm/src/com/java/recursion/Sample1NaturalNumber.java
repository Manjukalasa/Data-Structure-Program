package com.java.recursion;

public class Sample1NaturalNumber
{
	public static void print(int x)
	{
		//System.out.println(x); //1 2 3 4 5 6
		if(x<=5)
		{
     	System.out.println(x); //1 2 3 4 5
			print(x+1);
		//System.out.println(x); //5 4 3 2 1
		}
	}
	public static void main(String[] args) {
		print(1);
	}
}