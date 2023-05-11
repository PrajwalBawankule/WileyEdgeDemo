package DataStructures;

public class LinkedListClass {
	
	class Node {
		int value;
		Node next;

		public Node(int d) {
			value = d;
			next = null;
		}
	}
	public Node head = null;
	public Node tail = null;
	
	//insert at the end, beginning, middle
	public void addAtEnd(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void addAtBeg(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void insertPosition(int data,int pos) {
		Node newNode = new Node(data);
		if(pos==1) {
			newNode.next = head;
			head = newNode;
		}
		else {
			Node temp = head;
			while(--pos >1) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
	
	public void deleteBeg() {
		if(head == null) {
			System.out.println("Empty list");
			return;
		}
		System.out.println("Deleted node = "+head.value);
		head = head.next;
	}
	public void deleteEnd() {
		if(head == null) {
			System.out.println("Empty list");
			return;
		}
		else {
			if(head!=tail) {
				Node current = head;
				while(current.next != tail) {
				  current = current.next;
				}
				System.out.println("Deleted element = "+tail.value);
				tail = current;
				tail.next = null;
			}
			else {
				head = tail = null;
			}
		}
		System.out.println("Deleted node = "+head.value);
		head = head.next;
	}
	
	public void deleteMiddle(int pos) {
		if(pos==1) {
			head = tail = null;
			
		}
		else {
			
		}
	}
	public void display() {
		Node node = head;
		while(node != null) {
			System.out.print(node.value + " ");
		}
		System.out.println(" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListClass linkedlist = new LinkedListClass();

		linkedlist.addAtEnd(5);
		


		linkedlist.addAtBeg(11);
		
	}

}
