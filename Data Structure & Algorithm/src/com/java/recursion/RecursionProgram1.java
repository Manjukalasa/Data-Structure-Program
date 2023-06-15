package com.java.recursion;
public class RecursionProgram1
{
	public static void print(int x)
	{
	    System.out.print(x+" ");//1 2 3 4 5
		if(x<5)
		{
			print(x+1);
			System.out.print(x+" ");//4 3 2 1
		}
		
	}
	public static void main(String[] args) {
		print(1);
	}
}
