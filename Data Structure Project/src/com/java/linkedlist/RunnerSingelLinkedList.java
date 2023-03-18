package com.java.linkedlist;
import org.java.linkedList.*;
public class RunnerSingelLinkedList 
{
	public static void main(String[] args)
	{
		SingleLinkedList sl=new SingleLinkedList();
		sl.insert(10);
		sl.insert(20);
		sl.insert(30);
		sl.insert(40);
		sl.insert(50);
		System.out.println("================inserted Elemets=====================");
		sl.display();
		System.out.println("====================Total length=====================");
		System.out.println(sl.length());
		System.out.println("============Some Elemets are Deleted after display=====================");
		sl.delete();  // last node is deleted
		sl.delete();
		sl.delete();
		sl.display();
		sl.delete();
		sl.delete();
		System.out.println("==============Some Elemets are Deleted after displaying===================");
		sl.display();
		System.out.println("============again some Inserting elements==================");
		sl.insert(10);
		sl.insert(20);
		sl.insert(30);
		sl.insert(40);
		sl.insert(50);
		System.out.println("============Deleting Begining Elements after Dispaying=====================");
		sl.deletebegin(); // first node is deleted
		sl.deletebegin();
		sl.deletebegin();
		sl.deletebegin();
		sl.deletebegin();
		sl.display();
		System.out.println("============again some Inserting elements==================");
		sl.insert(10);
		sl.insert(20);
		sl.insert(30);
		sl.insert(40);
		sl.insert(50);
		System.out.println("===================deleting based on index===================");
		sl.deleteAtIndex(3);  // deleting based on index                                                                                                                     
		sl.display();
		System.out.println("================insert At First=======================");
		sl.insertAtFirst(100); // insert element in first          
		sl.display();
		System.out.println("===================insert At Position=================");
		sl.insertAtPosition(2,300); // insert element in 2nd position   
		sl.display();
	}
}
