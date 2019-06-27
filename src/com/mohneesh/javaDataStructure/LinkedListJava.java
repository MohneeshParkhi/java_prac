package com.mohneesh.javaDataStructure;



public class LinkedListJava {
	
	Node head;
	
	static	 class Node {
		 int data;
		 Node node;
		 
		 Node(int data){
			 this.data = data;
			 node = null;
		 }
	}

	
	
	
	
	static LinkedListJava insert(LinkedListJava list,int data) {
		// creating a new node with data...
		Node firstNode = new Node(data);
		firstNode.node = null;
		
		if(list.head == null) {
			list.head = firstNode;
		}
		else {
			// traversing till end...
			Node next = list.head;
			while(next.node != null) {
				next = next.node;
			}
			next.node = firstNode;
		}
		return list;
	}
	
	static void printDataList(LinkedListJava list) {
		
		Node currNode = list.head;
		System.out.println("Printinq Linked List");
		
		while(currNode != null) {
			System.out.println(currNode.data +"\t");
			currNode = currNode.node;
		}
	}
	
	public static void main(String[] args) {
		LinkedListJava linkedList  = new LinkedListJava();
		
		linkedList = insert(linkedList,1);
		linkedList = insert(linkedList,2);
		linkedList = insert(linkedList,3);
		linkedList = insert(linkedList,5);
		linkedList = insert(linkedList,6);
		
		printDataList(linkedList);
}
}
