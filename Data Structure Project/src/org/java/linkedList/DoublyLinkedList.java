package org.java.linkedList;
class Node2 {
	Node2 add1;
	int data;
	Node2 add2;
	public Node2(int data)
	{
		this.data=data;
	}
}
public class DoublyLinkedList {
	Node2 root=null;
	public void insert(int data)
	{
		Node2 n1=new Node2(data);

		if(root==null)
		{
			root=n1;
		}
		else
		{
			Node2 temp=root;
			while(temp.add2!=null)
			{
				temp=temp.add2;
			}
			temp.add2=n1;
			n1.add1=temp;
		}
	}
	public void insertAtFirst(int ele)
	{
		Node2 n1=new Node2(ele);
		if(size()==0)
		{
			root=n1;
		}
		else
		{
			Node2 temp=root;
			root=n1;
			temp.add1=n1;
			n1.add2=temp;
		}
	}
	public void insertAtIndex(int index,int ele)
	{
		Node2 n1=new Node2(ele);
		if(index==0)
		{
			insertAtFirst(ele);
		}
		else if(size()==0)
		{
			root=n1;
		}
		else if(index>size())
		{
			System.out.println("IndexOutOfBound");
		}
		else if(index==size())
		{
			insert(ele);
		}
		else
		{
			Node2 temp=root;
			int count=0;
			Node2 pre=null;
			while(index!=count)
			{
				count++;
				pre=temp;
				temp=temp.add2;
			}
			n1.add1=pre;
			n1.add2=temp;
			pre.add2=n1;
			temp.add1=n1;

		}
	}
	public void deleteFirstNode() // deleting at First node
	{
		if(root==null)
		{
			System.out.println("LinkedList is Empty");
		}
		else
		{

			root=root.add2;
		}
	}
	public void delete()  // deleting at last node
	{
		if(size()==0)
		{
			System.out.println("LinkedList is Empty");
		}
		else
		{
			Node2 last=root;
			Node2 pre=null;
			while(last.add2!=null)
			{
				pre=last;
				last=last.add2;

			}
			pre.add2=null;
		}
	}
	public void delete(int index)   // deleting at index 
	{
		if(size()==0)
		{
			System.out.println("Linked is Empty");
		}
		else if(index>=size())
		{
			System.out.println("indexOutOfBound");
		}
		else if(index==0)
		{
			deleteFirstNode();
		}
		else if(index==size()-1)
		{
			delete();
		}
		else
		{
			Node2 target=root;
			Node2 pre=null;
			int count=0;
			while(index!=count)
			{
				count++;
				pre=target;
				target=target.add2;
			}
			pre.add2=target.add2;
			target.add1=pre;
			target.add1=null;
			target.add2=null;		
		}
	}

	public void display()
	{
		if(size()==0)
		{
			System.out.println("Empty");
		}
		else
		{
			Node2 temp=root;
			while(temp.add2!=null)
			{
				System.out.println(temp.data);
				temp=temp.add2;
			}
			System.out.println(temp.data);
		}
	}
	public void displayReverse()
	{
		if(size()==0)
		{
			System.out.println("Empty");
		}
		else
		{
			Node2 temp=root;
			while(true)
			{
				if(temp.add2==null)
				{
					System.out.println(temp.data);
					break;
				}
				temp=temp.add2;
			}

			temp=temp.add1;
			while(temp.add1!=null)
			{
				System.out.println(temp.data);
				temp=temp.add1;
			}
			System.out.println(root.data);

		}
	}
	public int size()
	{
		if(root==null)
		{
			return 0;
		}
		else
		{
			int count=1;
			Node2 temp=root;
			while(temp.add2!=null)
			{
				count++;
				temp=temp.add2;
			}
			return count;

		}
	}
}