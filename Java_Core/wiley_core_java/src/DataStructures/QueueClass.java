package DataStructures;

public class QueueClass {

	private int front;
	private int rear;
	private int size = 5;
	int items[] = new int[5];
	
	public QueueClass(){
		front = -1;
		rear = -1;
	}
	
	//checking if queue is full
	boolean isFull() {
		if(front==0 && rear == size-1) {
			return true;
		}
		return false;
	}
	
	//chccking if queue is empty
	boolean isEmpty() {
		if(front==-1) {
			return true;
		}
		return false;
	}
	
	//addding element in the queue
	void enQueue(int element) {
		if(isFull()) {
			System.out.println("Queue is full");
		}
		else {
			if(front == -1) {
				front = 0;
			}
			rear++;
			items[rear] = element;
			System.out.println("Inserted value :"+element);
		}
	}
	
	
	//removing element from the queue
	int deQueue() {
		int element;
		if(isEmpty()) {
			System.out.println("Queue empty");
			return -1;
		}
		else {
		  element = items[front];
		  if(front>=rear) {
			  front = -1;
			  rear =-1;
		  }
		  else {
			  front++;
		  }
		  System.out.println("Deleted element : "+element);
		  return element;
		}
	}
	
	
	//displaying queue
	void display() {
		int i;
		if(isEmpty()) {
			System.out.println("Queue empty");
		}
		else {
			for(i=front;i<=rear;i++) {
				System.out.println(items[i]);
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueClass que = new QueueClass();
		que.deQueue();
		que.enQueue(2);
		que.enQueue(3);
		que.enQueue(4);
		que.enQueue(5);
		que.enQueue(6);
		que.enQueue(6);
		
		que.display();
		
		que.deQueue();
		que.display();
	}

}
