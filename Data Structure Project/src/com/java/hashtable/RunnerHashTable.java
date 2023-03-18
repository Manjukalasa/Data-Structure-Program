package com.java.hashtable;

import org.java.hashtable.HashTable;
public class RunnerHashTable
{
	public static void main(String[] args) 
	{
		HashTable h=new HashTable();
		h.insert(10);
		h.insert(63);
		h.insert(57);
		h.insert(31);
		h.insert(24);
		h.display();
		System.out.println("=========================");
		System.out.println(	h.size());
		System.out.println("=========================");
		h.insert(30);
		System.out.println("=========================");
		h.delete(57);
		h.delete(10);
    	//delete(100);
		h.display();
		System.out.println("=========================");
		HashTable.reset();//h.reset();
		h.display();
	}
}
