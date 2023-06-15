package com.java.hashtable;
public class HashTableExample
{
	static int cap=5,hash[]=new int[cap];
	static
	{
		reset();
	}
	public static void insert(int ele)
	{
		int key=ele%cap;
		if(hash[key]==-1)
		{
			hash[key]=ele;
		}
		else
		{
			System.out.println("duplicate key");
		}
		
	}
	public static void delete(int ele)
	{
		int key=ele%cap;
		if(hash[key]==ele)
		{
			hash[key]=-1;
		}
		else
		{
			System.out.println("elements  not found");
		}
	}
	public static int size()
	{
		int count=0;
		for(int i: hash)
		{
			if(i!=-1)
			{
				count++;
			}
		}
		return count;
	}
	public static void display()
	{
		if(size()==0)
		{
			System.out.println("no elemets linked list is empty");
		}
		else
		{
			for(int i: hash)
			{
				if(i!=-1)
				{
					System.out.println(i);
				}
			}
		}
	}
	public static void reset()
	{
		for (int i=0;i<cap;i++)
		{
			hash[i]=-1;
		}
	}
	
	public static void main(String[] args) 
	{
		insert(10);
		insert(63);
		insert(57);
		insert(31);
		insert(24);
		display();
		System.out.println("=========================");
		System.out.println(size());
		System.out.println("=========================");
	    insert(30);
		System.out.println("=========================");
		delete(57);
		delete(10);
    	//delete(100);
		display();
		System.out.println("=========================");
		reset();
		display();
	}

}