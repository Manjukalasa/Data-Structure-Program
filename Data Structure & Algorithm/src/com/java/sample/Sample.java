package com.java.sample;

public class Sample {

	static int a;
	static
	{
		a=2;
	}
	{
		//a=2;//2
		a++;
	}
	public static void main(String[] args)
	{
		Sample s1=new Sample();
		new Sample();
		new Sample();
		Sample s2=new Sample();
		System.out.println(s1.a);
	}

}
