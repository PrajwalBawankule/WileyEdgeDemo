package Optimization;

public class DeadCodeElimination {

	public static void PrintOperation(int val) {
		if(val > 0) {
			System.out.println("Positive");
			return;
		}
		else {
			System.out.println("Negative");
		}
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintOperation(4);
	}

}
