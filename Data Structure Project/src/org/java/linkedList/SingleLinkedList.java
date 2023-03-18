package org.java.linkedList;
class Node
{
	int data;
	Node add;
	public Node(int data)
	{
		this.data=data;
	}
}
public class SingleLinkedList 
{
	static Node Root;
	static Node tail;
	public void insert(int element)
	{
		Node n1=new Node(element);
		if(Root==null)
		{
			Root=n1;
		}
		else
		{
			Node last=Root;
			while(last.add!=null)
			{
				last=last.add;
			}
			last.add=n1;
		}
	}
	public void delete()  // deleteAtLast()
	{
		if(Root==null)
		{
			System.out.println("LiskedList is Empty");
		}
		else if(Root.add==null)
		{
			Root=null;
		}
		else
		{
			Node last=Root;
			while(last.add.add!=null)
			{
				last=last.add;
			}
			last.add=null;
		}
	}
	public void deletebegin()
	{
		if(Root==null)
		{
			System.out.println("LiskedList is Empty");
		}
		else if(Root.add==null)
		{
			Root=null;
		}
		else
		{
			Node temp=Root;
			Root=Root.add;
			temp.add=null;
		}
	}
	public void display()
	{
		if(Root==null)
		{
			System.out.println("LiskedList is Fmpty");
		}
		else
		{
			Node temp=Root;
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
			Node temp=Root;
			while(temp!=null)
			{
				count++;
				temp=temp.add;
			}
			return count;
		}
	} 
	public void insertAtPosition(int index,int ele)
	{
		Node n1=new Node(ele);
		if(Root==null)
		{
			Root=n1;
		}
		else if(index==0)
		{
			n1.add=Root;
			Root=n1;
		}
		else
		{
			Node cur=Root;
			for(int i=0;i<index-1;i++)
			{
				cur=cur.add;
			}
			n1.add=cur.add;
			cur.add=n1;
		}
	}
	public  void insertAtFirst(int ele)
	{
		Node n1=new Node(ele);
		if(Root==null)
		{
			Root=n1;
			tail=n1;
		}
		else
		{
			Node last=Root;
			Root=n1;
			Root.add=last;
		}
	}
	public void deleteAtIndex(int index)
	{
		if(Root==null)
		{
			System.out.println("LL is empty");
		}
		else if(index==0)
		{
			deletebegin();
		}
		else if(index==length()-1)
		{
			delete();
		}
		else if(index>=length() || index<0)
		{
			System.out.println(" Linked List out of bound index");
		}
		else
		{
			int x=0;
			Node prev=Root;
			Node cur=Root;
			while(x<index)
			{
				prev=cur;
				cur=cur.add;
				x++;
			}
			prev.add=cur.add;
			cur.add=null;
		}
	}
}