package Exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First statement");
		int arr[] = {1,2,3,4,5};
		try {
			System.out.println(arr[2]);
			System.out.println(arr[10]);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		System.out.println("Another statement");
	}

}
