package Collections;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> books = new Stack<>();
		books.push("Java");
		books.push("Python");
		books.push("Python");
		books.push("C");
		books.add(null);
		System.out.println(books);
		System.out.println(books.peek());
		books.pop();
		System.out.println(books);
		System.out.println(books.search("Python"));
		System.out.println(books);
	}

}
