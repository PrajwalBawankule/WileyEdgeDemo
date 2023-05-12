package Optimization;

public class EnhancedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Inefficient way is using for loop
		int[] arr = new int[2000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		long start1 = System.currentTimeMillis();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		long end1 = System.currentTimeMillis();

		System.out.println("\nTime taken using normal for loop = " + (end1 - start1));

		// efficient way is using for each loop
		int[] arr1 = new int[2000];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i;
		}
		long start2 = System.currentTimeMillis();
		for (int num : arr1) {
			System.out.print(num+" ");
		}
		long end2 = System.currentTimeMillis();

		System.out.println("\nTime taken using normal for loop = " + (end2 - start2));

	}

}
