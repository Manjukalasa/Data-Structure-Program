package com.java.function;

public class Sample3
{
	public static String teri(int x)
	{
		String y=x++ +" "+ ++x;
		return y;
	}
	public static int meri(int x)
	{
		String y=teri(x+x);
		return y.charAt(0)-48;
	}
	public static void main(String[] args)
	{
	System.out.println(meri(13));
	}
}
