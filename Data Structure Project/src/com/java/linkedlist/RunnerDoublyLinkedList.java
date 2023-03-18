package com.java.linkedlist;

import org.java.linkedList.DoublyLinkedList;
public class RunnerDoublyLinkedList
{
	public static void main(String[] args)
		{
			DoublyLinkedList d=new DoublyLinkedList(); 
			System.out.println("----------Inserting Elements and displyaing----------------");
			d.insert(10);
			d.insert(20);
			d.insert(30);
			d.insert(40);
			d.insert(50);
			d.display();
			System.out.println("----------deleting at last Elements-----------------------");
			d.delete();
			d.display();
			System.out.println("----------deleting at first Elements----------------------");
			d.deleteFirstNode();
			d.display();
			System.out.println("----------deleting at index Elements ---------------------");
			d.delete(1);
			d.display();
			System.out.println("----------size() 0f index and displyaing------------------");
			System.out.println(d.size());
			System.out.println("----------inserting at first------------------------------");
			d.insertAtFirst(100);
			d.display();
			System.out.println("----------inserting at index------------------------------");
			d.insertAtIndex(2,200);
			d.display();
			System.out.println("----------Display Reveese at index------------------------");
			d.displayReverse();
		}
}

