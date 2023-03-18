package com.java.linkedlist;

import org.java.linkedList.ReverseSingleLinkedList;

public class RunnerReverseSingleLinkedList 
{
	public static void main(String[] args)
	{
		ReverseSingleLinkedList rs=new ReverseSingleLinkedList();
		rs.insert(10);
		rs.insert(20);
		rs.insert(30);
		rs.insert(40);
		rs.insert(50);
		rs.display();
		int size=rs.length();
		System.out.println("-------------------------------------");
		ReverseSingleLinkedList rs1=new ReverseSingleLinkedList();
		for(int i=0;i<size;i++)
		{
			rs1.insert(rs.delete());
		}
		rs1.display();
	}
}