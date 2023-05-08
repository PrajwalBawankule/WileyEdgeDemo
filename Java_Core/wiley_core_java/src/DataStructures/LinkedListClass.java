package DataStructures;

public class LinkedListClass {

	Node head;

	static class Node {
		int value;
		Node next;

		public Node(int d) {
			value = d;
			next = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListClass linkedlist = new LinkedListClass();

		linkedlist.head = new Node(12);
		Node second = new Node(13);
		Node third = new Node(16);
		
		linkedlist.head.next = second;
		second.next = third;
		
		while(linkedlist.head != null) {
			System.out.println(linkedlist.head.value);
			linkedlist.head = linkedlist.head.next;
		}
		
	}

}
