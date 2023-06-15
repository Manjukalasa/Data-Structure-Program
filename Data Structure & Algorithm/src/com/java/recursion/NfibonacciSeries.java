package com.java.recursion;
public class NfibonacciSeries
{
	public static int fibonacci(int n) 
	{
		if(n==0)
			return 0;
		if(n==1||n==2)
			return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String[] args) 
	{
		int n=10;
		for(int i=1;i<=n;i++)
		{
			System.out.print(fibonacci(i)+" ");// 0: 1 1 2 3 5 8 13 21 34 55
			                                   // 0: 1 2 3 4 5 6  7  8  9 10  
		}
	}
}