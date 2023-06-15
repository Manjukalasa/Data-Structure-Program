package com.java.linkedList;
class Node1
{
	int data;
	Node1 add;
	public Node1(int data)
	{
		this.data=data;
	}
}
public class ReverseSingleLinkedList 
{
	Node1 Root;
	public  void insert(int element)
	{
		Node1 n1=new Node1(element);
		if(Root==null)
		{
			Root=n1;
		}
		else
		{
			Node1 last=Root;
			while(last.add!=null)
			{
				last=last.add;
			}
			last.add=n1;
		}
	}
	public int delete()  // deleteAtLast()
	{
		int ele;
		if(Root==null)
		{
			return 0;
		}
		else if(Root.add==null)
		{
			ele=Root.data;
			Root=null;
			return ele;
		}
		else
		{
			Node1 last=Root;
			while(last.add.add!=null)
			{
				last=last.add;
			}
			ele=last.add.data;
			last.add=null;
			return ele;
		}
	}
	public  void display()
	{
		if(Root==null)
		{
			System.out.println("LiskedList is Empty");
		}
		else
		{
			Node1 temp=Root;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.add;
			}
		}
	} 
	public int length()
	{
		int count=0;
		if(Root==null)
		{
			return 0;
		}
		else
		{
			Node1 temp=Root;
			while(temp!=null)
			{
				count++;
				temp=temp.add;
			}
			return count;
		}
	} 
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