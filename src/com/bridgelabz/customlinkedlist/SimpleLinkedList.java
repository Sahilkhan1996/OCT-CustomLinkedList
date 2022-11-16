package com.bridgelabz.customlinkedlist;

import com.bridgelabz.customlinkedlist.SimpleLinkedList;
import com.bridgelabz.customlinkedlist.SimpleLinkedList.Node;

public class SimpleLinkedList {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data2) {
			this.data = data2;
			this.next = null;
		}
	}

	public void append(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = new Node(data);
			return;
		}
		newNode.next=null;
		Node lastNode = head;// 10
		while (lastNode.next != null) {// lastNode.next=10
			lastNode = lastNode.next; // lastNode=10;
		}
		lastNode.next = newNode;
		return;
	}

	
	public void printList() {
		if (head == null) {
			System.out.println("Linked list is empty!");
			return;
		}
		Node tNode = head;
		while (tNode != null) {
			System.out.print(tNode.data + "==>");
			tNode = tNode.next;
		}
		System.out.println("null");
	}
 	public static void main(String[] args) {
		SimpleLinkedList ll = new SimpleLinkedList();
		ll.append(56);
		ll.append(30);
		ll.append(70);
		ll.printList();

	}

}
