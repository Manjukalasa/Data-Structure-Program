package org.java.hashtable;
public class HashTable
{
	static int cap=5,hash[]=new int[cap];
	static
	{
		reset();
	}
	public void insert(int ele)
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
	public  void delete(int ele)
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
	public int size()
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
	public void display()
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
	

}