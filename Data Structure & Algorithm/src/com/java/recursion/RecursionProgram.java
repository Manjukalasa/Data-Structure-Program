package com.java.recursion;
public class RecursionProgram
{
	public static void print(int x)
	{
		if(x>5)
		{
			return;
		}
		    //System.out.print(x); //1 2 3 4 5
			print(x+1);
			System.out.print(x);  //5 4 3 2 1
	}
	public static void main(String[] args) {
		
		print(1);
	}
}
