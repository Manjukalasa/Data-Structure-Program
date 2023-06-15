package com.java.sample;

public class Sample1
{
	static int a=5,b=2;
	public static void main(String[] args) {
		a=a++ + ++a + b++ + ++b;
		b=b++ + b++ + a++ + a++;
		System.out.println(a+b + " "+ b+a);
	}

}
