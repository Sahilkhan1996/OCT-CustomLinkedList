package com.bridgelabz.customlinkedlist;

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
		newNode.next = null;
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
//Appending means adding the element at the end of the linked list
		ll.append(56);
		ll.append(30);
		ll.append(70);
		// Adding elements is starting of the linked list
//		ll.addFirst(70);
//		ll.addFirst(30);
//		ll.addFirst(56);

		// Inserting the 30 new element after the 56 node by
		// passing the elements after which you like to add the element and
		// the new element which you like to add
		// ll.insert(70, 40);
		System.out.println("Checking the index of 56 element in the linked list");
		System.out.println(ll.indexof(56));// to check the index number of the element
		ll.printList();
		// ll.insertAtIndex(0, 30);// parameter after which you wish to add the element
		// 30
		ll.printList();
		ll.deleteFirst();
		ll.printList();

		System.out.println("Deleting last element from linked list");
		ll.deleteLast();
		ll.printList();

	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		if (head.next == null) {
			head = null;
			System.out.println("head is deleted sucessfully!");
			return;
		}

		Node secondLast = head;
		Node last = head.next.next;
		while (last != null) {
			last = last.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
		System.out.println("Last element is deleted sucessfully!");
	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("Linked list is empty");
			return;
		}
		head = head.next;
		System.out.println("First element of the linked list deleted sucessfully");
	}

	public int indexof(int data) {
		int index = 0;
		if (head == null) {
			return -1;
		}
		Node newNode = new Node(data);
		Node tNode = head;

		while (tNode != null) {
			if (tNode.data == newNode.data) {
				System.out.println(
						"Element is present in the linked list with the data " + data + " at index of: " + index);
				return index;
			}
			index++;
			tNode = tNode.next;
		}

		return -1;
	}

	public void insertAtIndex(int index, int data) {
		int ind = 0;
		if (head == null) {
			head = new Node(data);
			return;
		}

		Node newNode = new Node(data);
		Node tNode = head;

		while (tNode != null) {
			if (ind == index) {
				newNode.next = tNode.next;
				tNode.next = newNode;
			}
			ind++;
			tNode = tNode.next;
		}
	}

	public void insert(int prevNodedata, int data) {
		Node newNode = new Node(data);
		Node tNode = head;
		while (tNode != null) {
			if (tNode.data == prevNodedata) {
				newNode.next = tNode.next;
				tNode.next = newNode;
			}
			tNode = tNode.next;
		}
	}

	public void addFirst(int data) {
		// adding element before the head of the linked list
		// if linked list is empty then head will be null so will add the element in the
		// head first
		if (head == null) {
			head = new Node(data);
			head.next = null;
			return;
		}
		Node newNode = new Node(data);
		// Changing the head reference to new node next reference
		newNode.next = head;
		// assigning the new Node reference to the head reference
		head = newNode;
	}
}
