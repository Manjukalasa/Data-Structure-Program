package com.java.recursion;
public class Sample2NaturalNumberReveres 
{
	public static void print(int x)
	{
		
		if(x>=1)
		{
     	System.out.println(x); //5 4 3 2 1
			print(x-1);
		}
	}
	public static void main(String[] args) {
		print(5);
	}
}