package DataStructures;

public class StackClass {

	private int arr[];
	private int top;
	private int capacity;

	// creating a stack
	StackClass(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	public void push(int val) {
		if (isFull()) {
			System.out.println("Stack full");
			System.exit(1);
		}
		System.out.println("Inserting value :" + val);
		arr[++top] = val;
	}

	// check if stack is full
	public boolean isFull() {
		return top == capacity - 1; // return true or false
	}

	// removing top element
	public int pop() {
		if (top == -1) {
			System.out.println("Stack is empty");
			System.exit(1);
		}
		System.out.println("Removing value :"+arr[top]);
		return arr[top--];
	}

	// check stack is empty
	public boolean isEmpty() {
		return top == -1;
	}

	// utility function to return the size of stack created
	public int size() {
		return top + 1;
	}

	//iterate over stack
	public void printStack() {
		for(int i=0; i<=top; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackClass myStack = new StackClass(4);
		myStack.push(23);
		myStack.push(34);
		myStack.push(45);
		myStack.push(56);
		
		myStack.printStack();
		
		myStack.pop();
		System.out.println("");
		myStack.printStack();
		
		
	}

}
