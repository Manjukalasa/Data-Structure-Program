package com.java.recursion;

public class SumOfNfibonacciSeries
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
		int n=10;//6-->20 10-->143
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum =sum+fibonacci(i);
		}
		System.out.print(sum);
	}
}
